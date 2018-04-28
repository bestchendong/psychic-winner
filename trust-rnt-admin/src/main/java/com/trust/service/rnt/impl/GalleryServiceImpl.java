package com.trust.service.rnt.impl;

import com.github.pagehelper.PageHelper;
import com.trust.common.PageInfo;
import com.trust.dao.rnt.GalleryMapper;
import com.trust.entity.rnt.Gallery;
import com.trust.entity.rnt.GalleryExample;
import com.trust.service.rnt.GalleryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GalleryServiceImpl implements GalleryService {

    @Autowired
    private GalleryMapper galleryMapper;

    @Override
    public PageInfo getGalleryByPage(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        GalleryExample galleryExample = new GalleryExample();
        List<Gallery> galleryList = galleryMapper.selectByExample(galleryExample);
        return new PageInfo(galleryList);
    }

    @Override
    public void add(Gallery gallery) {
        galleryMapper.insertSelective(gallery);
    }

    @Override
    public Gallery getGalleryByName(String name) {
        GalleryExample galleryExample = new GalleryExample();
        galleryExample.createCriteria().andNameEqualTo(name);
        List<Gallery> galleryList = galleryMapper.selectByExample(galleryExample);
        if(galleryList != null && galleryList.size() > 0 ){
            return galleryList.get(0);
        }
        return null;
    }

    @Override
    public Gallery getGalleryById(long id) {
        return galleryMapper.selectByPrimaryKey(id);
    }

    @Override
    public void deleteGallery(long id) {
        galleryMapper.deleteByPrimaryKey(id);
    }
}
