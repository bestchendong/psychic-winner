package com.trust.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trust.dao.CmsArticleContentMapper;
import com.trust.dao.CmsArticleInfoMapper;
import com.trust.entity.api.Article;
import com.trust.entity.api.ArticleDetail;
import com.trust.entity.api.Category;
import com.trust.entity.cms.CmsArticleContent;
import com.trust.entity.cms.CmsArticleInfo;
import com.trust.entity.cms.CmsArticleInfoExample;
import com.trust.entity.cms.CmsArticleOperateLog;
import com.trust.service.CmsArticleCategoryService;
import com.trust.service.CmsArticleContentService;
import com.trust.service.CmsArticleInfoService;
import com.trust.service.CmsArticleOperateLogService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import javax.annotation.Resource;
import java.util.*;



/**
 * @Author Yangcb
 * @Descrintion 文章信息Service
 * @Date create 2017-11-23 14:25
 * @Version 1.0
 */
@Service("cmsArticleInfoService")
public class CmsArticleInfoServiceImpl implements CmsArticleInfoService{
    @Resource
    private CmsArticleInfoMapper cmsArticleInfoMapper;
    @Resource
    private CmsArticleContentMapper cmsArticleContentMapper;
    @Resource
    private CmsArticleContentService cmsArticleContentService;
    @Resource
    private CmsArticleOperateLogService cmsArticleOperateLogService;
    @Resource
    private CmsArticleCategoryService cmsArticleCategoryService;
    /**
     * 通过文章ID查看文章信息
     * @param id
     * @return
     */
    @Override
    public CmsArticleInfo findCmsArticleInfoById(long id) {
        return  cmsArticleInfoMapper.selectByPrimaryKey(id);
    }

    /**
     * 根据ID返回模板详细内容
     * @param id
     * @return
     */
    @Override
    public ArticleDetail findArticleDetailById(long id,String sourceType) {
        return cmsArticleInfoMapper.selectArticleDetailByPrimaryKey(id,sourceType);
    }

    /**
     * 保存文章信息
     * @param cmsArticleInfo
     * @return
     */
    @Override
    @Transactional
    public int save(CmsArticleInfo cmsArticleInfo) {
        try {
            if(cmsArticleInfo.getcArticleId()!=null){//修改
                CmsArticleInfo oldCmsArticleInfo = cmsArticleInfoMapper.selectByPrimaryKey(cmsArticleInfo.getcArticleId());
                StringBuffer updateLog = new StringBuffer();
                updateLog.append("修改了内容,");
                if(!oldCmsArticleInfo.getcArticleTitle().equals(cmsArticleInfo.getcArticleTitle())){
                    updateLog.append("修改了标题,");
                }
                if(!oldCmsArticleInfo.getcArticleResource().equals(cmsArticleInfo.getcArticleResource())){
                    updateLog.append("修改了来源,");
                }
                if(!oldCmsArticleInfo.getcArticleAuthor().equals(cmsArticleInfo.getcArticleAuthor())){
                    updateLog.append("修改了作者,");
                }
                if(!oldCmsArticleInfo.getcArticlePoster().equals(cmsArticleInfo.getcArticlePoster())){
                    updateLog.append("修改了封面,,");
                }
                cmsArticleInfo.setcArticleUpdatetime(new Date());
                cmsArticleInfoMapper.updateByPrimaryKeySelective(cmsArticleInfo);
                for (CmsArticleContent content:cmsArticleInfo.getArticleContents()) {
                    if(content.getcArticleContentId()!=null){
                        cmsArticleContentMapper.updateByPrimaryKeySelective(content);
                    }else {
                        content.setcArticleId(cmsArticleInfo.getcArticleId());
                        cmsArticleContentMapper.insertSelective(content);
                    }
                }
                CmsArticleOperateLog log = new CmsArticleOperateLog();
                log.setCmsArticleId(cmsArticleInfo.getcArticleId());
                log.setCmsOperateDate(new Date());
                log.setCmsSiteCode("0001");
                log.setCmsSiteId(1L);
                log.setCmsUserName("通海睿农通");
                log.setCmsArtcileName(cmsArticleInfo.getcArticleTitle());
                log.setCmsResourcesName(updateLog.toString());
                cmsArticleOperateLogService.save(log);  //添加修改日志
            }else{
                cmsArticleInfo.setcArticleCreatetime(new Date());
                cmsArticleInfo.setcArticleDes(cmsArticleInfo.getcArticleCategoryCode());
                cmsArticleInfo.setcArticleType(1);
                cmsArticleInfo.setcArticleStatus(1);
                cmsArticleInfo.setcSiteId(1L);
                cmsArticleInfo.setSiteCode("0000001");
                cmsArticleInfoMapper.insertSelective(cmsArticleInfo);
                if(cmsArticleInfo.getArticleContents()!=null&&cmsArticleInfo.getArticleContents().size()>0) {
                    for(int i=0;i<cmsArticleInfo.getArticleContents().size();i++){
                        CmsArticleContent cmsArticleContent = cmsArticleInfo.getArticleContents().get(i);
                        cmsArticleContent.setcArticleId(cmsArticleInfo.getcArticleId());
                        cmsArticleContent.setcContentIndex(i+1);
                        cmsArticleContentMapper.insertSelective(cmsArticleContent);
                    }
                }
            }
        } catch (Exception e) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();//手动设置回滚
            e.printStackTrace();
            return 0;
        }
        return 1;
    }

    /**
     * 修改文章信息及相关内容信息
     * @param cmsArticleInfo
     * @return
     */
    @Override
    @Transactional
    public int edit(CmsArticleInfo cmsArticleInfo) {
        try {
            if(cmsArticleInfo!=null){
                List<CmsArticleContent> contents = cmsArticleInfo.getArticleContents();
                if(!contents.isEmpty()){
                    for (CmsArticleContent content:contents) {
                        cmsArticleContentMapper.insertSelective(content);
                    }
                }
                cmsArticleInfoMapper.insertSelective(cmsArticleInfo);
            }
        } catch (Exception e) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();//手动设置回滚
            e.printStackTrace();
            return 0;
        }
        return 1;
    }

    /**
     * 删除文章信息
     * @param id
     * @return
     */
    @Override
    @Transactional
    public int delete(long id) {
        try {
            List<CmsArticleContent> ccontents = cmsArticleContentService.findCmsArticleContentByArticleId(id);
            if(ccontents!=null&&ccontents.size()>0){
                for (CmsArticleContent content:ccontents) {
                    cmsArticleContentMapper.deleteByPrimaryKey(content.getcArticleContentId());
                }
            }
            List<CmsArticleOperateLog>  logList = cmsArticleOperateLogService.getCmsCmsArticleOperateLogListArticelId(id);
            if(logList!=null){
                for (CmsArticleOperateLog log:logList) {
                    cmsArticleOperateLogService.delete(log.getCmsOperateLogId());
                }
            }
            cmsArticleInfoMapper.deleteByPrimaryKey(id);
        } catch (Exception e) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();//手动设置回滚
            e.printStackTrace();
            return 0;
        }
        return 1;
    }

    /**
     * 根据文章参数分页查询文章信息
     * @param param
     * @param pageNumber
     * @param pageSize
     * @return
     */
    @Override
    public PageInfo findByPageAndParams(CmsArticleInfo param, int pageNumber, int pageSize, Date startTime,Date endTime) {
        PageHelper.startPage(pageNumber, pageSize);
        CmsArticleInfoExample cmsArticleInfoExample = new CmsArticleInfoExample();
        cmsArticleInfoExample.setOrderByClause("c_article_createtime desc");
        CmsArticleInfoExample.Criteria criteria = cmsArticleInfoExample.createCriteria();
        if(startTime!=null){
            criteria.andCArticleReleaseTimeGreaterThanOrEqualTo(startTime);
        }
        if(endTime!=null){
            criteria.andCArticleReleaseTimeLessThanOrEqualTo(endTime);
        }
        if(!"".equals(param.getcArticleCategoryCode())&&param.getcArticleCategoryCode()!=null){
            if(param.getcArticleCategoryCode().equals("trust_insect_pests")){
                List<Category> list = cmsArticleCategoryService.getChildrenApiCategoryListByCode(param.getcArticleCategoryCode());
                List<String> cmsArticleCategoryCodes =getCategoryCodes(list,new ArrayList());
                System.out.printf("cmsArticleCategoryCodes===="+cmsArticleCategoryCodes);
                criteria.andcArticleCategoryCodeIn(cmsArticleCategoryCodes);
            }else {
                criteria.andcArticleCategoryCodeEqualTo(param.getcArticleCategoryCode());
            }
        }
        if(!"".equals(param.getcArticleAuthor())&&param.getcArticleAuthor()!=null){
            criteria.andCArticleAuthorEqualTo(param.getcArticleAuthor());
        }
        if(!"".equals(param.getcArticleResource())&&param.getcArticleResource()!=null){
            criteria.andCArticleResourceLike("%"+param.getcArticleResource()+"%");
        }
        if(!"".equals(param.getcArticleTitle())&&param.getcArticleTitle()!=null){
            criteria.andCArticleTitleLike("%"+param.getcArticleTitle()+"%");
        }
        if(param.getcArticleStatus()!=null&&param.getcArticleStatus()!=4){
            criteria.andCArticleStatusEqualTo(param.getcArticleStatus());
        }
        if(param.getcArticleType()!=null){
            criteria.andCArticleTypeEqualTo(param.getcArticleType());
        }
        List<CmsArticleInfo> list= cmsArticleInfoMapper.selectByExample(cmsArticleInfoExample);
        PageInfo<CmsArticleInfo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    /**
     * 分页查询内容
     * @param pageNum
     * @param pageSize
     * @param categoryCode
     * @return
     */
    @Override
    public PageInfo getArticleByPage(Integer pageNum, Integer pageSize, String categoryCode) {
        PageHelper.startPage(pageNum, pageSize);
        List<Article> list= cmsArticleInfoMapper.selectArticleByCategoryCode(categoryCode);
        PageInfo<Article> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    /**
     * 根据分类ID查询内容
     * @param categoryId
     * @return
     */
    @Override
    public List<CmsArticleInfo> selectArticleByCategoryId(Long categoryId) {
        try {
            return cmsArticleInfoMapper.selectArticleByCategoryId(categoryId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 批量发布
     * @param list
     * @return
     */
    @Override
    public int batchUpdateArticleStatus(List<Long> list,String categoryCode,int status) {
        for (Long articleId:list) {
            if(articleId!=null&&articleId>0){
                CmsArticleInfo cmsArticleInfo = cmsArticleInfoMapper.selectByPrimaryKey(articleId);
                StringBuffer updateLog = new StringBuffer();
                updateLog.append("修改了状态,");
                Map params = new HashMap();
                params.put("cArticleStatus",status);
                params.put("categoryCode",categoryCode);
                params.put("articleId",articleId);
                try {
                    cmsArticleInfoMapper.releaseArticle(params);
                    CmsArticleOperateLog log = new CmsArticleOperateLog();
                    log.setCmsArticleId(cmsArticleInfo.getcArticleId());
                    log.setCmsOperateDate(new Date());
                    log.setCmsSiteCode("0001");
                    log.setCmsSiteId(1L);
                    log.setCmsUserName("通海睿农通");
                    log.setCmsArtcileName(cmsArticleInfo.getcArticleTitle());
                    log.setCmsResourcesName(updateLog.toString());
                    cmsArticleOperateLogService.save(log);  //添加修改日志
                } catch (Exception e) {
                    TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();//手动设置回滚
                    return 0;
                }
            }
        }
        return 1;
    }

    /**
     * 批量删除文章内容
     * @param list
     * @param categoryCode
     * @return
     */
    @Override
    public int batchDeleteArticleStatus(List<Long> list, String categoryCode) {
        for (Long articleId:list) {
            if(articleId!=null&&articleId>0){
                try {
                    //删除文章
                    CmsArticleInfoExample cmsArticleInfoExample = new CmsArticleInfoExample();
                    CmsArticleInfoExample.Criteria criteria = cmsArticleInfoExample.createCriteria();
                    criteria.andcArticleCategoryCodeEqualTo(categoryCode);
                    criteria.andCArticleIdEqualTo(articleId);
                    List<CmsArticleContent> ccontents = cmsArticleContentService.findCmsArticleContentByArticleId(articleId);
                    if(ccontents!=null&&ccontents.size()>0){
                        for (CmsArticleContent content:ccontents) {
                            cmsArticleContentMapper.deleteByPrimaryKey(content.getcArticleContentId());
                        }
                    }
                    List<CmsArticleOperateLog>  logList = cmsArticleOperateLogService.getCmsCmsArticleOperateLogListArticelId(articleId);
                    if(logList!=null){
                        for (CmsArticleOperateLog log:logList) {
                            cmsArticleOperateLogService.delete(log.getCmsOperateLogId());
                        }
                    }
                    cmsArticleInfoMapper.deleteByExample(cmsArticleInfoExample);
                }catch (Exception e){
                    TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();//手动设置回滚
                    e.printStackTrace();
                    return 0;
                }
            }
        }
        return 1;
    }

    public List<String> getCategoryCodes(List<Category> list,List<String> codeList){
        if(list!=null&&list.size()>0){
            for (Category cmsArticleCategory:list){
                if(cmsArticleCategory!=null) {
                    codeList.add(cmsArticleCategory.getCategoryCode());
                    if (cmsArticleCategory.getChildrenCategory() != null && cmsArticleCategory.getChildrenCategory().size() > 0) {
                        getCategoryCodes(cmsArticleCategory.getChildrenCategory(), codeList);
                    }
                }
            }
        }
        return codeList;
    }
}
