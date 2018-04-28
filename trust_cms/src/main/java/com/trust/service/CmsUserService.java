package com.trust.service;

import com.trust.entity.cms.CmsUser;

import java.util.List;

/**
 * @Author Yangcb
 * @Descrintion
 * @Date create 2017-11-16 13:45
 * @Version 1.0
 */
public interface CmsUserService {

     List<CmsUser> getUserList();

     CmsUser findUserById(long id);

     void save(CmsUser user);

     void edit(CmsUser user);

     void delete(long id);
}
