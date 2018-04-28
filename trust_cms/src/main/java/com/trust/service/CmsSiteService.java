package com.trust.service;

import com.trust.entity.cms.CmsSite;

import java.util.List;

public interface CmsSiteService {
     List<CmsSite> getCmsSiteList();

     CmsSite findCmsSiteById(int id);

     void save(CmsSite cmsSite);

     void edit(CmsSite cmsSite);

     void delete(long id);
}
