package com.trust.controller.rnt;

import com.github.pagehelper.PageInfo;
import com.trust.common.annotation.OperationLogDes;
import com.trust.constant.log.RntOperationLogModule;
import com.trust.constant.log.RntOperationLogType;
import com.trust.entity.rnt.RntSysVersion;
import com.trust.service.rnt.RntSysVersionService;
import com.trust.service.rnt.RntOperationLogService;
import com.trust.utils.Result;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: TangLiang
 * @Descrintion: 版本信息接口
 * @Date: Created in 14:39 2017/12/21 0021
 * @Version: 1.0
 */
@Controller
@RequestMapping("/rnt/sysversion")
public class SysVersionController {

    @Autowired
    private RntSysVersionService rntSysVersionService;

    @Autowired
    private RntOperationLogService rntOperationLogService;

    /**
     * @Descrintion: 分页查询所有
     * @param: pageNum  pageSize
     * @return: PageInfo
     */
    @RequiresPermissions("rnt:sysversion:query:page")
    @RequestMapping("/query/page")
    public String findVersionByPage(Model model, @RequestParam(value="pageNum",defaultValue = "1")int pageNum, @RequestParam(value="pageSize",defaultValue = "5") int pageSize){
        PageInfo<RntSysVersion> pageInfo = rntSysVersionService.findVersionByPage(pageNum, pageSize);
        if (pageInfo!=null){
            model.addAttribute("pageInfo",pageInfo);
            return "/rnt/version/version";
        }
        return "/rnt/sys/500";
    }

    /**
     * @Descrintion: 新增版本信息后台跳转handler
     * @param:
     * @return: 跳转至新增页面
     */
    @RequiresPermissions("rnt:sysversion:add")
    @RequestMapping("/toAdd")
    public String toAddVersion_html(){
        return "/rnt/version/version_add";
    }

    /**
     * @Descrintion: 新增版本信息
     * @param: RntSysVersion
     * @return:
     */
    @OperationLogDes(moduleName = RntOperationLogModule.sysVersion)
    @RequiresPermissions("rnt:sysversion:add")
    @RequestMapping("/add")
    public String addVersion(RntSysVersion rntSysVersion){
        if (rntSysVersion!=null && rntSysVersion.getSysName()!=null &&
                rntSysVersion.getVersionNum()!=null && rntSysVersion.getPublishTime()!=null &&
                rntSysVersion.getDownloadUrl()!=null){
            Result verifyResult = this.findSysVersionBySysnameAndVersionnum(
                    "add", rntSysVersion.getSysName(), rntSysVersion.getVersionNum(), null);
            if (verifyResult!=null && verifyResult.get("code")!=null && verifyResult.get("code").equals("200")){
                Integer save = rntSysVersionService.save(rntSysVersion);
                if (save!=null && save == 1){
                    try {
                        rntOperationLogService.addLog( RntOperationLogType.add,this.getClass().getMethod("addVersion", RntSysVersion.class),rntSysVersion.getVersionId());
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                        System.out.println("========== Log not logged! ==========");
                    }
                    return "redirect:/rnt/sysversion/query/page";
                }
            }
        }
        return "/rnt/sys/500";
    }

    /**
     * @Descrintion: 根据id查找版本信息
     * @param: id
     * @return:
     */
    @RequiresPermissions("rnt:sysversion:modify")
    @RequestMapping("/query/id")
    public String findVersionById(Long id,Model model){
        if(id != null){
            RntSysVersion rntSysVersion = rntSysVersionService.findPriceQuotesById(id);
            if (rntSysVersion!=null){
                model.addAttribute("rntSysVersion",rntSysVersion);
                return "/rnt/version/version_update";
            }
        }
        return "/rnt/sys/500";
    }

    /**
     * @Descrintion: 修改版本信息
     * @param: RntSysVersion
     * @return:
     */
    @OperationLogDes(moduleName = RntOperationLogModule.sysVersion)
    @RequiresPermissions("rnt:sysversion:modify")
    @RequestMapping("/modify")
    public String modifyVersionById(RntSysVersion rntSysVersion) {
        if (rntSysVersion!=null && rntSysVersion.getVersionId()!=null &&rntSysVersion.getSysName()!=null && rntSysVersion.getVersionNum()!=null
                && rntSysVersion.getPublishTime()!=null && rntSysVersion.getDownloadUrl()!=null){
            Result verifyResult = this.findSysVersionBySysnameAndVersionnum("edit", rntSysVersion.getSysName(), rntSysVersion.getVersionNum(), rntSysVersion.getVersionId());
            if (verifyResult!=null && verifyResult.get("code")!=null && verifyResult.get("code").equals("200")){
                RntSysVersion oldRntSysVersion = rntSysVersionService.findPriceQuotesById(rntSysVersion.getVersionId());
                Integer edit = rntSysVersionService.edit(rntSysVersion);
                if (edit!=null && edit == 1){
                    try {
                        rntOperationLogService.addLog( RntOperationLogType.edit,this.getClass().getMethod("modifyVersionById", RntSysVersion.class),oldRntSysVersion,rntSysVersion);
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                        System.out.println("========== Log not logged! ==========");
                    }
                    return "redirect:/rnt/sysversion/query/page";
                }
            }
        }
        return "/rnt/sys/500";
    }

    /**
     * @Descrintion: 根据id删除版本信息
     * @param: id
     * @return:
     */
    @OperationLogDes(moduleName = RntOperationLogModule.sysVersion)
    @RequestMapping(value = "/delete")
    @RequiresPermissions("rnt:sysversion:delete")
    public String deleteVersionById(Long id) {
        if (id!=null){
            Integer delete = rntSysVersionService.delete(id);
            if (delete == 1){
                try {
                    rntOperationLogService.addLog( RntOperationLogType.delete,this.getClass().getMethod("deleteVersionById", Long.class),id);
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                    System.out.println("========== Log not logged! ==========");
                }
                return "redirect:/rnt/sysversion/query/page";
            }
        }
        return "/rnt/sys/500";
    }

    /**
     * @Descrintion: 新增、修改验证
     * @param: sysName versionNum
     * @return: Result(code,msg)
     */
    @ResponseBody
    @RequestMapping(value = "/verify")
    public Result findSysVersionBySysnameAndVersionnum(String operationSort,String sysName,String versionNum,Long versionId) {
        //新增：版本号验证
        if (operationSort!=null && operationSort.equals("add") &&
                sysName!=null && versionNum!=null){
            List<RntSysVersion> sysVersionBySysnameAndVersionnum = rntSysVersionService.findSysVersionBySysnameAndVersionnum(sysName, versionNum);
            if (sysVersionBySysnameAndVersionnum==null ||
                    (sysVersionBySysnameAndVersionnum!=null && sysVersionBySysnameAndVersionnum.size()==0)){
                return new Result("200","success");
            }
        }
        //编辑：版本号验证
        if (operationSort!=null && operationSort.equals("edit") &&
                sysName!=null && versionNum!=null && versionId!=null){
            List<RntSysVersion> sysVersionBySysnameAndVersionnum = rntSysVersionService.findSysVersionBySysnameAndVersionnum(sysName, versionNum);
            if (sysVersionBySysnameAndVersionnum==null ||
                    (sysVersionBySysnameAndVersionnum!=null && sysVersionBySysnameAndVersionnum.size()==0)){
                return new Result("200","success");
            }
            if (sysVersionBySysnameAndVersionnum!=null && sysVersionBySysnameAndVersionnum.size()==1){
                if (sysVersionBySysnameAndVersionnum.get(0)==null){
                    return new Result("200","success");
                }
                if (sysVersionBySysnameAndVersionnum.get(0)!=null &&
                        sysVersionBySysnameAndVersionnum.get(0).getVersionId()!=null){
                    if (sysVersionBySysnameAndVersionnum.get(0).getVersionId().equals(versionId)){
                        return new Result("200","success");
                    }
                }
            }
        }
        return new Result("500","error");
    }

}
