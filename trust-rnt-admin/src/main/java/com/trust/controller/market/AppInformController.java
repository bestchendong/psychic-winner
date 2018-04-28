package com.trust.controller.market;

import com.trust.service.rnt.market.AppInformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

/**
 * @author 唐亮
 * @create 2018-04-11 9:18
 * @desc app推送消息
 **/
@Controller
@RequestMapping("/market/appinform")
public class AppInformController {

    @Autowired
    private AppInformService appInformService;

    /**
     * @Descrintion: 根据param条件筛选查询
     * @return:
     */
    @RequestMapping("/query/param")
    public void findByParam(Model model, @RequestParam(value="pageNum",defaultValue = "1")int pageNum, @RequestParam(value="pageSize",defaultValue = "5") int pageSize, String title, String type, Date startDate, Date endDate){
        appInformService.findByParam(pageNum, pageSize, title, type, startDate, endDate);
    }

}
