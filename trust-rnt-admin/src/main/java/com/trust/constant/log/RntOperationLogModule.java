package com.trust.constant.log;

public enum RntOperationLogModule {

    notSet("/"),
    department("部门管理"),
    manager("用户管理"),
    menu("菜单管理"),
    operation("页面操作管理"),
    role("角色管理"),
    system("系统管理"),
    spiderAgriculturalNews("爬虫库_农业要问"),
    spiderInsectpests("爬虫库_病虫害"),
    spiderNotice("爬虫库_公告通知"),
    spiderPoliciesRegulations("爬虫库_政策法规"),
    base("/"),
    file("文件管理"),
    login("登录"),
    rntSystem("系统版本"),
    upload("文件上传"),
    agriculturalNews("农业要问"),
    area("行政区域信息"),
    crops("农作物分类"),
    gallery("图片库"),
    insectpests("病虫害"),
    notice("公告通知"),
    policiesRegulations("政策法规"),
    sysVersion("应用版本信息");

    private String temp = null;

    private RntOperationLogModule(String str){
        this.temp = str;
    }

    public String toString(){
        return temp;
    }
}
