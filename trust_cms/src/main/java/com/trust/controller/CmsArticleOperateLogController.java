package com.trust.controller;

import com.trust.entity.cms.CmsArticleOperateLog;
import com.trust.service.CmsArticleOperateLogService;
import com.trust.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Yangcb
 * @Descrintion 内容操作日志
 * @Date create 2018-01-05 14:18
 * @Version 1.0
 */
@RequestMapping("/cms")
@RestController
public class CmsArticleOperateLogController {
    @Autowired
    private CmsArticleOperateLogService cmsArticleOperateLogService;

    @RequestMapping(value = "/articlelog/add",method = RequestMethod.PUT)
    public ResultData insertOperateLog(@RequestParam(value = "cmsArticleOperateLog",required = true)CmsArticleOperateLog cmsArticleOperateLog){
        if(cmsArticleOperateLog!=null){
            int result = cmsArticleOperateLogService.save(cmsArticleOperateLog);
            if(result==1){
                return new ResultData("200","success");
            }
            return new ResultData("500","添加失败");
        }
        return new ResultData("401","paramerror");
    }
}
