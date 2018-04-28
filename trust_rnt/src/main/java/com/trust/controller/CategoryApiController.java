package com.trust.controller;

import com.trust.controller.api.CategoryApi;
import com.trust.service.CategoryService;
import com.trust.utils.Result;
import com.trust.utils.ResultData;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-15T03:06:26.991Z")

/**
 * 内容分类信息
 */
@RestController
public class CategoryApiController implements CategoryApi {

    @Autowired
    private CategoryService categoryService;

    /**
     * 分局分类编码获取分类信息列表
     * @param categoryCode
     * @return
     */
    public Result getCategoryTreeList(@NotNull@ApiParam(value = "分类编码 病虫害：trust_insect_pests", required = true) @RequestParam(value = "categoryCode", required = true) String categoryCode) {
        if(!"".equals("categoryCode")){
            Result resultData = categoryService.getApiCategoryListByCode(categoryCode);
           if(resultData!=null){
               return resultData;
           }
        }
        return new ResultData("500","paramerror");

    }

}
