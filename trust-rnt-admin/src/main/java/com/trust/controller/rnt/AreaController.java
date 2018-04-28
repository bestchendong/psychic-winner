package com.trust.controller.rnt;

import com.trust.entity.rnt.RntArea;
import com.trust.service.rnt.RntAreaService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author tangliang
 * @create 2018-01-02 23:20
 * @desc 行政区域四级展示接口
 **/
@Controller
@RequestMapping("/rnt/area")
public class AreaController {

    @Resource(name="rntAreaService")
    private RntAreaService rntAreaService;

    /**
     * @Descrintion: 查询行政区域信息入口（页面默认数据渲染）
     * @param: id  count（查询次数）
     * @return:
     */
    @RequiresPermissions("rnt:area:default")
    @RequestMapping("/default")
    public String queryAreaDefault(Model model,@RequestParam(value="id",defaultValue = "0") int id,@RequestParam(value="count",defaultValue = "4")int count){
        Map<String, List<RntArea>> listMap = rntAreaService.queryAreaByCount(id,count);
        List<RntArea> rntAreas;
        if (listMap!=null && !listMap.isEmpty()){
            for (String s : listMap.keySet()) {
                rntAreas = listMap.get(s);
                model.addAttribute(s,rntAreas);
            }
            return "/rnt/area/area";
        }
        return "/rnt/sys/500";
    }

    /**
     * @Descrintion: 根据不同区域等级查询所有子类信息
     * @param: id  count（查询次数）
     * @return: map（存放4个集合：省、市、区、街道）
     */
    @ResponseBody
    @RequestMapping("/query/count")
    public Map<String, List<RntArea>> queryAreaByCount(int id,int count){
        if(id!=0 && count!=0){
            Map<String, List<RntArea>> listMap = rntAreaService.queryAreaByCount(id,count);
            return listMap;
        }
        return null;
    }
}
