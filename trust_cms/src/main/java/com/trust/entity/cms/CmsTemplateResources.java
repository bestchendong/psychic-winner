package com.trust.entity.cms;

import java.io.Serializable;
/**
 * @Author Yangcb
 * @Descrintion 模板对应的资源文件
 * @Date create 2017-11-22 17:35
 * @Version 1.0
 */
public class CmsTemplateResources implements Serializable {
    private Long cTemplateResourceId;//模板资源ID

    private Long cTemplateId;//模板ＩＤ

    private String cTemplatePath;//模板路径

    private String cTemplateAccessType;//模板资源类型//手机端 、PC 、大屏

    private static final long serialVersionUID = 1L;

    public CmsTemplateResources(Long cTemplateResourceId, Long cTemplateId, String cTemplatePath, String cTemplateAccessType) {
        this.cTemplateResourceId = cTemplateResourceId;
        this.cTemplateId = cTemplateId;
        this.cTemplatePath = cTemplatePath;
        this.cTemplateAccessType = cTemplateAccessType;
    }

    public CmsTemplateResources() {
        super();
    }

    public Long getcTemplateResourceId() {
        return cTemplateResourceId;
    }

    public void setcTemplateResourceId(Long cTemplateResourceId) {
        this.cTemplateResourceId = cTemplateResourceId;
    }

    public Long getcTemplateId() {
        return cTemplateId;
    }

    public void setcTemplateId(Long cTemplateId) {
        this.cTemplateId = cTemplateId;
    }

    public String getcTemplatePath() {
        return cTemplatePath;
    }

    public void setcTemplatePath(String cTemplatePath) {
        this.cTemplatePath = cTemplatePath == null ? null : cTemplatePath.trim();
    }

    public String getcTemplateAccessType() {
        return cTemplateAccessType;
    }

    public void setcTemplateAccessType(String cTemplateAccessType) {
        this.cTemplateAccessType = cTemplateAccessType == null ? null : cTemplateAccessType.trim();
    }

}