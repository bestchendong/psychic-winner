package com.trust.entity.cms;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Author Yangcb
 * @Descrintion 模板实体类
 * @Date create 2017-11-22 17:25
 * @Version 1.0
 */
public class CmsContentTemplate implements Serializable {
    private Long cContentTemplateId;//模板ID

    private String cTemplateName;//模板名称

    private Date cTemplateCreatetime;//创建时间

    private List<CmsTemplateResources> templateResourcesList;//模板资源列表

    private static final long serialVersionUID = 1L;

    public CmsContentTemplate(Long cContentTemplateId, String cTemplateName, Date cTemplateCreatetime) {
        this.cContentTemplateId = cContentTemplateId;
        this.cTemplateName = cTemplateName;
        this.cTemplateCreatetime = cTemplateCreatetime;
    }

    public CmsContentTemplate() {
        super();
    }

    public Long getcContentTemplateId() {
        return cContentTemplateId;
    }

    public void setcContentTemplateId(Long cContentTemplateId) {
        this.cContentTemplateId = cContentTemplateId;
    }

    public String getcTemplateName() {
        return cTemplateName;
    }

    public void setcTemplateName(String cTemplateName) {
        this.cTemplateName = cTemplateName == null ? null : cTemplateName.trim();
    }

    public Date getcTemplateCreatetime() {
        return cTemplateCreatetime;
    }

    public void setcTemplateCreatetime(Date cTemplateCreatetime) {
        this.cTemplateCreatetime = cTemplateCreatetime;
    }


    public List<CmsTemplateResources> getTemplateResourcesList() { return templateResourcesList; }

    public void setTemplateResourcesList(List<CmsTemplateResources> templateResourcesList) { this.templateResourcesList = templateResourcesList; }
}