package com.trust.service.impl;

import com.github.pagehelper.PageInfo;
import com.trust.entity.Category;
import com.trust.service.CategoryService;
import com.trust.utils.ResultData;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author Yangcb
 * @Descrintion
 * @Date create 2018-01-17 9:14
 * @Version 1.0
 */
@Component
public class CategoryServiceImpl implements CategoryService {

    @Override
    public List<Category> getChildrenApiCategoryListByCode(String categoryCode) {
        return null;
    }

    @Override
    public ResultData getApiCategoryListByCode(String categoryCode) {
        return null;
    }

}
