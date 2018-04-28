package com.trust.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trust.dao.CmsPictureLibraryMapper;
import com.trust.entity.cms.CmsPictureLibrary;
import com.trust.entity.cms.CmsPictureLibraryExample;
import com.trust.service.CmsPictureLibraryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @Author Yangcb
 * @Descrintion 图库管理service
 * @Date create 2017-11-28 9:23
 * @Version 1.0
 */
@Service("cmsPictureLibraryService")
public class CmsPictureLibraryServiceImpl implements CmsPictureLibraryService {
    @Resource
    private CmsPictureLibraryMapper cmsPictureLibraryMapper;

    /**
     * 根据ID查看图片详情信息
     * @param id
     * @return
     */
    @Override
    public CmsPictureLibrary findCmsPictureLibraryById(long id) {
        try {
            if(id>0){
                return cmsPictureLibraryMapper.selectByPrimaryKey(id);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 新增图库图片信息
     * @param cmsPictureLibrary
     * @return
     */
    @Override
    public int save(CmsPictureLibrary cmsPictureLibrary) {
        try {
            if(cmsPictureLibrary!=null){
                cmsPictureLibraryMapper.insertSelective(cmsPictureLibrary);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     *修改图库图信息
     * @param cmsPictureLibrary
     * @return
     */
    @Override
    public int edit(CmsPictureLibrary cmsPictureLibrary) {
        try {
            if(cmsPictureLibrary!=null){
                cmsPictureLibraryMapper.updateByPrimaryKeySelective(cmsPictureLibrary);
                return 1;
            }
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * 删除图片信息并删除文件
     * @param id
     * @return
     */
    @Override
    public int delete(long id) {
        try {
            if(id>0){
                CmsPictureLibrary pictureLibrary = cmsPictureLibraryMapper.selectByPrimaryKey(id);
                if(pictureLibrary!=null){
                    String url = pictureLibrary.getcPictureUrl();
                    //调用接口删除文件
                    cmsPictureLibraryMapper.deleteByPrimaryKey(id);
                    return  0;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * 根据时间分页查询图片信息
     * @param param
     * @param pageNumber
     * @param pageSize
     * @param startTime
     * @param endTime
     * @return
     */
    @Override
    public PageInfo<CmsPictureLibrary> findByPageAndParams(CmsPictureLibrary param, int pageNumber, int pageSize, Date startTime, Date endTime) {
        try{
            PageHelper.startPage(pageNumber, pageSize);
            CmsPictureLibraryExample cmsPictureLibraryExample = new CmsPictureLibraryExample();
            CmsPictureLibraryExample.Criteria criteria = cmsPictureLibraryExample.createCriteria();
            if(startTime!=null){
                criteria.andCCreateTimeGreaterThanOrEqualTo(startTime);
            }
            if(endTime!=null){
                criteria.andCCreateTimeLessThanOrEqualTo(endTime);
            }
            if(param.getcPictureCategoryCode()!=null){
                criteria.andCPictureCategoryCodeEqualTo(param.getcPictureCategoryCode());
            }
            List<CmsPictureLibrary> list= cmsPictureLibraryMapper.selectByExample(cmsPictureLibraryExample);
            PageInfo<CmsPictureLibrary> pageInfo = new PageInfo<>(list);
            return pageInfo;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
