package com.trust.admin.mgt.controller;

import com.trust.admin.mgt.entity.Manager;
import com.trust.admin.mgt.shiro.ShiroUtils;
import org.springframework.stereotype.Controller;

/**
 * @Author Yangcb
 * @Descrintion 父类controller,通用相关功能
 * @Date create 2017-11-24 14:39
 * @Version 1.0
 */
@Controller
public class BaseController {

    public Manager getUser() { return ShiroUtils.getUser(); }

    public Integer getUserId() {
        return getUser().getManagerId();
    }

    public String getUsername() {return getUser().getRealName(); }
}
