package com.trust.controller.rnt;

import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 禁言记录controller
 */
@Controller
@RequestMapping("/gagrecord")
public class RntUserGagRecordController {

    @ApiOperation(value = "分页",notes = "禁言项用户禁言列表")
    @RequestMapping(value = "/page",method = RequestMethod.GET)
    public String getPage(@RequestParam(value = "pageNum", required = false,defaultValue = "1") Integer pageNum,
                          @RequestParam(value = "pageSize", required = false,defaultValue = "10") Integer pageSize,
                          @RequestParam(value = "gagItem") Integer gagItem){

        return "";
    }
}
