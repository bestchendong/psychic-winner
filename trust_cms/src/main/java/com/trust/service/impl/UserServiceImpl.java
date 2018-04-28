package com.trust.service.impl;
import com.trust.dao.CmsUserMapper;
import com.trust.entity.cms.CmsUser;
import com.trust.service.CmsUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Yangcb
 * @Descrintion
 * @Date create 2017-11-16 13:22
 * @Version 1.0
 */
@Service("userService")
public class UserServiceImpl implements CmsUserService {

    @Resource
    private CmsUserMapper cmsUserMapper;

    @Override
    public List<CmsUser> getUserList() {
        return cmsUserMapper.selectByExample(null);
    }

    @Override
    public CmsUser findUserById(long id) {
        return cmsUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public void save(CmsUser user) {
        cmsUserMapper.insertSelective(user);
    }

    @Override
    public void edit(CmsUser user) {
        cmsUserMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public void delete(long id) {
        cmsUserMapper.deleteByPrimaryKey(id);
    }


}