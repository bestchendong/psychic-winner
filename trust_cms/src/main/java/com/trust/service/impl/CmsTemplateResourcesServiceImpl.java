package com.trust.service.impl;

import com.trust.dao.CmsTemplateResourcesMapper;
import com.trust.entity.cms.CmsTemplateResources;
import com.trust.service.CmsTemplateResourcesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Yangcb
 * @Descrintion 模板资源service实现类
 * @Date create 2017-11-23 11:29
 * @Version 1.0
 */
@Service("cmsTemplateResourcesService")
public class CmsTemplateResourcesServiceImpl implements CmsTemplateResourcesService {
    @Resource
    private CmsTemplateResourcesMapper cmsTemplateResourcesMapper;

    /**
     * 根据模板ID查询相关资源列表
     * @param templateId
     * @return
     */
    @Override
    public List<CmsTemplateResources> getCmsTemplateResourcesListByTempId(Long templateId) {
        return cmsTemplateResourcesMapper.getCmsTemplateResourcesListByTempId(templateId);
    }

    /**
     * 根据模板资源类型查询列表
     * @param type
     * @return
     */
    @Override
    public List<CmsTemplateResources> findCmsTemplateResourcesByType(String type) {
        try {
            return  cmsTemplateResourcesMapper.findCmsTemplateResourcesByType( type);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 根据ID查询模板资源详情
     * @param id
     * @return
     */
    @Override
    public CmsTemplateResources findCmsTemplateResourcesById(long id) {
        try {
            if(id>0){
                return  cmsTemplateResourcesMapper.selectByPrimaryKey(id);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 新增模板资源文件
     * @param cmsTemplateResources
     * @return
     */
    @Override
    public int save(CmsTemplateResources cmsTemplateResources) {
        if(cmsTemplateResources!=null){
            cmsTemplateResourcesMapper.insertSelective(cmsTemplateResources);
            return 1;
        }
        return 0;
    }

    /**
     * 修改资源文件
     * @param cmsTemplateResources
     * @return
     */
    @Override
    public int edit(CmsTemplateResources cmsTemplateResources) {
        try {
            if(cmsTemplateResources!=null){
                cmsTemplateResourcesMapper.updateByPrimaryKeySelective(cmsTemplateResources);
                return 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * 删除资源文件
     * @param id
     * @return
     */
    @Override
    public int delete(long id) {
        try {
            if(id>0){
                cmsTemplateResourcesMapper.deleteByPrimaryKey(id);
                return 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * 批量删除模板相关资源文件
     * @param list
     * @return
     */
    @Override
    public int batchDeteleResources(List<Long> list) {
        try {
            if(list!=null&&list.size()>0){
                for (int i=0;i<list.size();i++){
                    cmsTemplateResourcesMapper.deleteByPrimaryKey(list.get(i));
                }
                return 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
