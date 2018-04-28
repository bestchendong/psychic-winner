package com.trust.controller.market;

import com.github.pagehelper.PageInfo;
import com.trust.entity.market.BackInformContent;
import com.trust.service.rnt.market.BackInformService;
import com.trust.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

/**
 * @author 唐亮
 * @create 2018-04-11 9:18
 * @desc 后台推送消息
 **/
@Controller
@RequestMapping("/market/backinform")
public class BackInformController {

    @Autowired
    private BackInformService backInformService;

    /**
     * @Descrintion: 根据param条件筛选查询
     * @return:
     */
    @RequestMapping("/query/param")
    public String findByParam(Model model, @RequestParam(value="pageNum",defaultValue = "1")int pageNum, @RequestParam(value="pageSize",defaultValue = "5") int pageSize, String title, String type, Date startDate, Date endDate){
        PageInfo<BackInformContent> byParam = backInformService.findByParam(pageNum, pageSize, title, type, startDate, endDate);
        if (byParam!=null){
            model.addAttribute("pageInfo",byParam);
            return "/rnt/backstagemsg/backstagemsg";
        }
        return "/rnt/sys/500";
    }

}
