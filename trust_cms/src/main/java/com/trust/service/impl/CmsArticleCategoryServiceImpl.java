package com.trust.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trust.dao.CmsArticleCategoryMapper;
import com.trust.dao.CmsArticleInfoMapper;
import com.trust.entity.api.Category;
import com.trust.entity.cms.CmsArticleCategory;
import com.trust.entity.cms.CmsArticleCategoryExample;
import com.trust.entity.cms.CmsArticleInfo;
import com.trust.service.CmsArticleCategoryService;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

//import com.trust.entity.CmsArticleCategory;
//import com.trust.entity.CmsArticleOperateLog;

/**
 * @Author Yangcb
 * @Descrintion
 * @Date create 2017-11-22 18:52
 * @Version 1.0
 */
@Service("cmsArticleCategoryService")
@Transactional()
public class CmsArticleCategoryServiceImpl implements CmsArticleCategoryService {
    @Resource
    private CmsArticleCategoryMapper cmsArticleCategoryMapper;

    @Resource
    private CmsArticleInfoMapper cmsArticleInfoMapper;

    @Autowired
    private AmqpTemplate rabbitTemplate;

    /**
     * 获取全部分类列表
     * @return
     */
    @Override
    public List<CmsArticleCategory> getCmsArticleCategoryList() {
        try {
            CmsArticleCategoryExample example = new CmsArticleCategoryExample();
            return cmsArticleCategoryMapper.selectByExample(example);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 查询分类子类List
     * @param code
     * @return
     */
    @Override
    public List<CmsArticleCategory> getChildrenCategoryListByCode(String code) {
        try {
            return cmsArticleCategoryMapper.getCmsCategoryByCode(code);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 查询分类子类List
     * @param code
     * @return
     */
    @Override
    public List<Category> getChildrenCategoryListByInsectpests(String code) {
        try {
            return cmsArticleCategoryMapper.getApiCategoryByInsectpests(code);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 根据分类编码获取子类集合
     * @param code
     * @return
     */
    @Override
    public List<Category> getChildrenApiCategoryListByCode(String code) {
        try {
            return cmsArticleCategoryMapper.getApiCategoryByCode(code);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 根据ID查询分类信息
     * @param id
     * @return cmsArticleCategory
     */
    @Override
    public CmsArticleCategory findCmsArticleCategoryById(long id)
    {
        try {
            return cmsArticleCategoryMapper.selectByPrimaryKey(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 新增分类信息
     * @param cmsArticleCategory
     * @return
     */
    @Override
    public int save(CmsArticleCategory cmsArticleCategory) {
        try {
            cmsArticleCategoryMapper.insert(cmsArticleCategory);
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }
        return 1;
    }

    /**
     * 修改分类信息
     * @param cmsArticleCategory
     * @return
     */
    @Override
    public int edit(CmsArticleCategory cmsArticleCategory) {
        try {
            cmsArticleCategoryMapper.updateByPrimaryKey(cmsArticleCategory);
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }
        return 1;
    }

    /**
     * 根据ＩＤ获取分类信息
     * @param id
     * @return
     */
    @Override
    public int  delete(long id) {
        try {
            //判断子类和是否有被文章引用
            List<CmsArticleInfo> articleInfoList = cmsArticleInfoMapper.selectArticleByCategoryId(id);
            if(articleInfoList!=null&&articleInfoList.size()>0){
                  return 3;
            }else{
                cmsArticleCategoryMapper.deleteByPrimaryKey(id);
            }
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }
        return 1;
    }

    /**
     * 根据编码获取分类信息
     * @param code
     * @return
     */
    @Override
    public CmsArticleCategory getCategoryByCode(String code) {
        try {
            return cmsArticleCategoryMapper.getCategoryByCode(code);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 多条件分页查询
     * @param param
     * @param pageNumber
     * @param pageSize
     * @return
     */
    @Override
    public PageInfo<CmsArticleCategory> findByPageAndParams(final CmsArticleCategory param, int pageNumber, int pageSize) {
        PageHelper.startPage(pageNumber, pageSize);
        CmsArticleCategoryExample example = new CmsArticleCategoryExample();
        CmsArticleCategoryExample.Criteria criteria = example.createCriteria();
        if(param.getcPid()!=null&&param.getcPid()>0){
            criteria.andCPidGreaterThan(param.getcPid());
        }
        if(param.getcCategoryLevel()!=null){
            criteria.andCCategoryLevelEqualTo(param.getcCategoryLevel());
        }
        if(param.getcCategoryStatus()!=null){
            criteria.andCCategoryStatusEqualTo(param.getcCategoryStatus());
        }
        List<CmsArticleCategory> list= cmsArticleCategoryMapper.selectByExample(example);
        PageInfo<CmsArticleCategory> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    /**
     * 查询所有农作物分类
     * @param level
     * @param pageNum
     * @param pageSize
     * @return PageInfo
     */
    @Override
    public PageInfo<CmsArticleCategory> getCmsArticleCategoryAllByLevel(Integer level, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        CmsArticleCategoryExample cmsArticleCategoryExample = new CmsArticleCategoryExample();
        cmsArticleCategoryExample.setOrderByClause("c_category_id ASC");
        cmsArticleCategoryExample.createCriteria().andCCategoryLevelGreaterThan(level);
        List<CmsArticleCategory> cmsArticleCategories = cmsArticleCategoryMapper.selectByExample(cmsArticleCategoryExample);
        if (cmsArticleCategories!=null){
            PageInfo<CmsArticleCategory> pageInfo = new PageInfo<>(cmsArticleCategories);
            return pageInfo;
        }
        return null;
    }

    /**
     * 按照level查询父类（包含子类集合）
     * @param level
     * @return List
     */
    @Override
    public List<Category> getChildrenCategoryListByLevel(Integer level) {
        List<Category> categories = cmsArticleCategoryMapper.selectChildrenCategoryByLevel(level);
        if (categories!=null){
            return categories;
        }
        return null;
    }

    /**
     * 按照分类名称查询
     * @param categoryName
     * @return CmsArticleCategory
     */
    @Override
    public List<CmsArticleCategory> findCmsArticleCategoryByCategoryName(String categoryName) {
        CmsArticleCategoryExample categoryExample = new CmsArticleCategoryExample();
        CmsArticleCategoryExample.Criteria criteria = categoryExample.createCriteria();
        criteria.andCCategoryNameEqualTo(categoryName);
        List<CmsArticleCategory> cmsArticleCategories = cmsArticleCategoryMapper.selectByExample(categoryExample);
        if (cmsArticleCategories!=null){
            return cmsArticleCategories;
        }
        return null;
    }

}
