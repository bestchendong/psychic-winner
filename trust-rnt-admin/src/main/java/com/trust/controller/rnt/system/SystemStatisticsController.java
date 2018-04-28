package com.trust.controller.rnt.system;

import com.trust.service.ucenter.UcUserService;
import com.trust.service.rnt.cms.ArticleService;
import com.trust.utils.Result;
import com.trust.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * 系统统计
 * @Author Yangcb
 * @Descrintion
 * @Date create 2018-02-10 15:24
 * @Version 1.0
 */
@RequestMapping("/rntadmin/statistics")
@Controller
public class SystemStatisticsController {
    @Autowired
    private ArticleService articleService;

    @Autowired
    UcUserService rntUserService;

    /**
     * 爬虫库新增统计
     * @return Result
     */
    @RequestMapping(value = "/spider/add",method = RequestMethod.GET)
    @ResponseBody
    public Result spiderNewAddStatistics(){
        return articleService.spiderNewAddStatistics();
    }
    /**
     * 用户相关统计数据
     */
    @RequestMapping(value = "/indexUserStatistics",method = RequestMethod.GET)
    @ResponseBody
    public ResultData indexUserStatistics(@RequestParam (value = "productId") Integer productId){
       Map userStatiseMap = rntUserService.indexUserStatistics(productId);
        return new ResultData("200","success",userStatiseMap);
    }
}
