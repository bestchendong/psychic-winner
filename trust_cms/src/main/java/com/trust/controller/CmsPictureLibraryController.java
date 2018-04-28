package com.trust.controller;

import com.github.pagehelper.PageInfo;
import com.trust.entity.cms.CmsPictureLibrary;
import com.trust.service.CmsPictureLibraryService;
import com.trust.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author Yangcb
 * @Descrintion 图片库管理
 * @Date create 2018-01-05 13:44
 * @Version 1.0
 */
@RestController
@RequestMapping("/cms")
public class CmsPictureLibraryController {
    @Autowired
    private CmsPictureLibraryService cmsPictureLibraryService;

    /**
     * 图片库分页查询
     * @param cmsPictureLibrary
     * @param pageSize
     * @param pageNum
     * @param startTime
     * @param endTime
     * @return
     */
    @RequestMapping(value = "/picturelib/page",method = RequestMethod.POST)
    public ResultData getCmsPictureListByPage(@RequestParam(value="cmsPictureLibrary",required = true) CmsPictureLibrary cmsPictureLibrary, @RequestParam(value = "pageSize",defaultValue = "10",required = true)int pageSize, @RequestParam(value = "pageNum", defaultValue = "1",required = true) int pageNum,
                                              @RequestParam(value = "startTime",required = false)Date startTime, @RequestParam(value = "endTime",required = false)Date endTime){
        PageInfo pageInfo  = cmsPictureLibraryService.findByPageAndParams(cmsPictureLibrary,pageNum,pageSize,startTime,endTime);
        return new ResultData("200","success",pageInfo);
    }

    /**
     *新增图片库图片信息
     * @param cmsPictureLibrary
     * @return
     */
    @RequestMapping(value = "/picturelib/save" ,method = RequestMethod.POST)
    public ResultData insertCmsPictureLibrary(@RequestParam(value="cmsPictureLibrary",required = true) CmsPictureLibrary cmsPictureLibrary){
       if(cmsPictureLibrary!=null){
           int result = cmsPictureLibraryService.save(cmsPictureLibrary);
           if(result==1){
               return new ResultData("200","success");

           }
           return new ResultData("500","保存失败");
       }
       return new ResultData("401","不能为空");
    }

    /**
     * 删除图片库图片
     * @param pictureId
     * @return
     */
    @RequestMapping(value = "/picturelib/delete",method = RequestMethod.DELETE)
    public ResultData delete(@RequestParam(value = "pictureId",required = true)Long pictureId){
        int result = cmsPictureLibraryService.delete(pictureId);
        if(result==1){
            return new ResultData("200","删除成功");
        }
        return new ResultData("500","删除失败");
    }

    /**
     * 查看图片详情信息
     * @param pictureId
     * @return
     */
    @RequestMapping(value = "/picturelib/detail",method = RequestMethod.POST)
    public ResultData getCmaPictureDetail(@RequestParam(value = "pictureId",required = true)Long pictureId){
        CmsPictureLibrary cmsPictureLibrary = cmsPictureLibraryService.findCmsPictureLibraryById(pictureId);
        return new ResultData("200","success",cmsPictureLibrary);
    }

}
