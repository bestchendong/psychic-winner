package com.trust.service.rnt;

import com.trust.common.PageInfo;
import com.trust.entity.rnt.Gallery;

public interface GalleryService {

    PageInfo getGalleryByPage(int pageNo, int pageSize);

    void add(Gallery gallery);

    Gallery getGalleryByName(String name);

    Gallery getGalleryById(long id);

    void deleteGallery(long id);
}
