package com.trust.service.impl;

import com.trust.entity.cms.CmsSite;
import com.trust.service.CmsSiteService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Yangcb
 * @Descrintion 频道站点实现类
 * @Date create 2017-11-23 11:32
 * @Version 1.0
 */
@Service("cmsSiteService")
public class CmsSiteServiceImpl implements CmsSiteService {

    @Override
    public List<CmsSite> getCmsSiteList() {
        return null;
    }

    @Override
    public CmsSite findCmsSiteById(int id) {
        return null;
    }

    @Override
    public void save(CmsSite cmsSite) {

    }

    @Override
    public void edit(CmsSite cmsSite) {

    }

    @Override
    public void delete(long id) {

    }
}
