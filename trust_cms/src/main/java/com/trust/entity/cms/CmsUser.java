package com.trust.entity.cms;

import java.io.Serializable;


/**
 * @Author Yangcb
 * @Descrintion用户
 * @Date create 2017-11-23 9:58
 * @Version 1.0
 */
public class CmsUser implements Serializable {
    private Long cUserId; //ID

    private String cUserName;//用户名

    private String cPassword;//密码

    private String cUserRealname;//真实名

    private static final long serialVersionUID = 1L;

    public CmsUser(Long cUserId, String cUserName, String cPassword, String cUserRealname) {
        this.cUserId = cUserId;
        this.cUserName = cUserName;
        this.cPassword = cPassword;
        this.cUserRealname = cUserRealname;
    }

    public CmsUser() {
        super();
    }

    public Long getcUserId() {
        return cUserId;
    }

    public void setcUserId(Long cUserId) {
        this.cUserId = cUserId;
    }

    public String getcUserName() {
        return cUserName;
    }

    public void setcUserName(String cUserName) {
        this.cUserName = cUserName == null ? null : cUserName.trim();
    }

    public String getcPassword() {
        return cPassword;
    }

    public void setcPassword(String cPassword) {
        this.cPassword = cPassword == null ? null : cPassword.trim();
    }

    public String getcUserRealname() {
        return cUserRealname;
    }

    public void setcUserRealname(String cUserRealname) {
        this.cUserRealname = cUserRealname == null ? null : cUserRealname.trim();
    }
}