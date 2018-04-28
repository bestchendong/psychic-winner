package com.trust.service;

import com.trust.entity.cms.CmsTemplateResources;

import java.util.List;

public interface CmsTemplateResourcesService {


     List<CmsTemplateResources> getCmsTemplateResourcesListByTempId(Long templateId);

     List<CmsTemplateResources> findCmsTemplateResourcesByType(String type);

     CmsTemplateResources findCmsTemplateResourcesById(long id);

     int save(CmsTemplateResources cmsTemplateResources);

     int edit(CmsTemplateResources cmsTemplateResources);

     int delete(long id);

     int batchDeteleResources(List<Long> list);
}
