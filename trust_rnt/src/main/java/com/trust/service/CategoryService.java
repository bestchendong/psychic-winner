package com.trust.service;

import com.trust.entity.Category;
import com.trust.service.impl.CategoryServiceImpl;
import com.trust.utils.Result;
import com.trust.utils.ResultData;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "trust-cms-service",fallback = CategoryServiceImpl.class)
public interface CategoryService {
    @RequestMapping(value = "/cms/category/insectpests",method = RequestMethod.POST)
    List<Category> getChildrenApiCategoryListByCode(@RequestParam(value = "categoryCode", required = true) String categoryCode);

    @RequestMapping(value = "/cms/api/category/list",method = RequestMethod.POST)
    Result getApiCategoryListByCode(@RequestParam(value = "categoryCode", required = true) String categoryCode);
}
