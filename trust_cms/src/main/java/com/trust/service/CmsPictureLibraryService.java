package com.trust.service;

import com.github.pagehelper.PageInfo;
import com.trust.entity.cms.CmsPictureLibrary;

import java.util.Date;

public interface CmsPictureLibraryService {


    CmsPictureLibrary findCmsPictureLibraryById(long id);

    int save(CmsPictureLibrary cmsPictureLibrary);

    int edit(CmsPictureLibrary cmsPictureLibrary);

    int delete(long id);

    PageInfo<CmsPictureLibrary> findByPageAndParams(final CmsPictureLibrary param, int pageNumber, int pageSize, Date startTime, Date endTime);
}
