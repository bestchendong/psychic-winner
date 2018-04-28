package com.trust.controller.api;

import com.trust.entity.api.Category;
import com.trust.service.CmsArticleCategoryService;
import com.trust.utils.ResultData;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.NotNull;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-15T03:06:26.991Z")

/**
 * 内容分类信息
 */
@Controller
public class CategoryApiController implements CategoryApi {
    @Autowired
    private CmsArticleCategoryService cmsArticleCategoryService;

    /**
     * 分局分类编码获取分类信息列表
     * @param categoryCode
     * @return
     */
    public ResultData getCategoryTreeList(@NotNull@ApiParam(value = "分类编码 病虫害：trust_insect_pests", required = true) @RequestParam(value = "categoryCode", required = true) String categoryCode) {
        if(!"".equals("categoryCode")){
            List<Category> list = cmsArticleCategoryService.getChildrenApiCategoryListByCode(categoryCode);
            if(list!=null&&list.size()>0){
                return new ResultData("200","success",list.get(0).getChildrenCategory());
            }
            return  new ResultData("200","success",list);
        }
        return new ResultData("500","paramerror");

    }

}
