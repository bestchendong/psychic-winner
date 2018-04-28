package com.trust.controller;

import com.github.pagehelper.PageInfo;
import com.trust.entity.api.Category;
import com.trust.entity.cms.CmsArticleCategory;
import com.trust.service.CmsArticleCategoryService;
import com.trust.utils.Result;
import com.trust.utils.ResultData;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Yangcb
 * @Descrintion分类管理
 * @Date create 2017-11-22 18:59
 * @Version 1.0
 */
@RestController
@RequestMapping("/cms")
public class CmsArticleCategoryController {
    @Resource
    private CmsArticleCategoryService cmsArticleCategoryService;

    @ApiOperation(value = "新增分类信息", notes = "根据cmsArticleCategory对象创建用户信息")
    @ApiImplicitParam(name = "cmsArticleCategory", value = "分类信息", required = false, dataType = "cmsArticleCategoryVo", paramType = "body")
    @RequestMapping(value = "/category/add",method = RequestMethod.POST)
    public Result addCmsArticleCategory(@RequestBody CmsArticleCategory cmsArticleCategory){
        if(cmsArticleCategory!=null){
         int result =   cmsArticleCategoryService.save(cmsArticleCategory);
         if(result==1){
             return Result.success("200","success");
         }else{
             return Result.success("500","error");
         }
        }
       return Result.success("500","paramerror");
    }

    /**
     * 获取所有病虫害分类信息
     * @return
     */
    @RequestMapping(value = "/category/insectpests",method = RequestMethod.POST)
    public List<Category> getCmsArticleCategoryByInsectpests(@RequestParam(value = "categoryCode",required = true)String categoryCode){
        List<Category> list = cmsArticleCategoryService.getChildrenCategoryListByInsectpests(categoryCode);
        if(list!=null&&list.size()>0){
            return list.get(0).getChildrenCategory();
        }
        return  null;
}
    @ApiOperation(value = "查询所有分类信息", notes = "根据所有查询分类信息")
    @RequestMapping(value = "/category/all",method = RequestMethod.GET)
    public List<CmsArticleCategory> getcmsArticleCategoryByCode(){
        return cmsArticleCategoryService.getCmsArticleCategoryList();
    }

    @ApiOperation(value = "分页查询分类信息", notes = "根据page和size分页查询分类信息",produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "页数", required = false,  paramType = "query",dataType = "int"),
            @ApiImplicitParam(name = "size", value = "条数", required = false, paramType = "query")

    })
    @RequestMapping(value = "/category/page",method = RequestMethod.GET)
    public PageInfo getcmsArticleCategoryPage(@RequestParam("cmsArticleCategory") CmsArticleCategory cmsArticleCategory, @RequestParam(value = "page", defaultValue = "1") Integer page,
                                              @RequestParam(value = "size", defaultValue = "10") Integer size) {
       return cmsArticleCategoryService.findByPageAndParams(cmsArticleCategory,page,size);
    }

    @ApiOperation(value = "查询分类信息", notes = "根据ID查询某个分类信息",produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "分类ID", required = true,  paramType = "query",dataType = "Long"),
    })
    @RequestMapping(value = "/category/detail",method = RequestMethod.GET)
    public Result getCmsArticleCategory(@RequestParam(value = "id",required = true,defaultValue = "0") Long id){
        CmsArticleCategory cmsArticleCategory  = cmsArticleCategoryService.findCmsArticleCategoryById(id);
        if(cmsArticleCategory!=null){
            return  new ResultData("200","success",cmsArticleCategory);
        }
        return new ResultData("500","error",cmsArticleCategory);
    }

    @ApiOperation(value = "删除分类信息", notes = "根据ID删除某个分类信息",produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "分类ID", required = true,  paramType = "query",dataType = "Long"),
    })
    @RequestMapping(value = "/category/delete",method = RequestMethod.DELETE)
    public Result deleteCmsArticleCategory(@RequestParam(value = "id",required = true,defaultValue = "0") Long id){
        int result = cmsArticleCategoryService.delete(id);
        if(result==3){
            return Result.success("401","该分类在内容中被使用");
        }else if(result==1){
            return Result.success("200","success");

        }
        return Result.success("400","error");
    }

    @ApiOperation(value = "保存分类信息", notes = "根据cmsArticleCategory对象修改用户信息")
    @ApiImplicitParam(name = "cmsArticleCategory", value = "分类信息", required = true, dataType = "cmsArticleCategory", paramType = "cmsArticleCategory")
    @RequestMapping(value = "/category/save",method = RequestMethod.POST)
    public Result saveCmsArticleCategory(@RequestParam(value = "cmsArticleCategory") CmsArticleCategory cmsArticleCategory){
        if(cmsArticleCategory!=null){
            cmsArticleCategoryService.edit(cmsArticleCategory);
        }
        return  Result.success("200","");
    }


    @ApiOperation(value = "查询分类子类信息", notes = "根据分类Code查询分类zi信息lication/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "categoryCode", value = "分类编码", required = false,  paramType = "query",dataType = "String"),
    })
    @RequestMapping(value = "/category/childrens",method = RequestMethod.GET)
    public Result getChildrenCategoryListByCode(@RequestParam(value = "categoryCode",required = false,defaultValue = "")String categoryCode){
        if(!"".equals("categoryCode")){
            List<CmsArticleCategory> list = cmsArticleCategoryService.getChildrenCategoryListByCode(categoryCode);
           if(list!=null&&list.size()>0){
               return new ResultData("200","success",list.get(0).getChildrenCategory());
           }
           return  new ResultData("200","success",list);
        }
        return new ResultData("500","paramerror");
    }

    @ApiOperation(value = "查询农作物分类列表", notes = "查询level>指定值的农作物分类列表，默认值为1（查询二级以下）")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "level", value = "分类", required = false, paramType = "query",dataType = "int"),
            @ApiImplicitParam(name = "page", value = "页数", required = false,  paramType = "query",dataType = "int"),
            @ApiImplicitParam(name = "size", value = "条数", required = false, paramType = "query",dataType = "int")
    })
    @RequestMapping(value = "/all/level",method = RequestMethod.GET)
    @ResponseBody
    public PageInfo<CmsArticleCategory> getCmsArticleCategoryAllByLevel(@RequestParam(value="level",defaultValue = "1") Integer level,@RequestParam(value = "page",defaultValue = "1") Integer page,@RequestParam(value = "size",defaultValue = "5") Integer size){
        PageInfo<CmsArticleCategory> pageInfo = cmsArticleCategoryService.getCmsArticleCategoryAllByLevel(level, page, size);
        if (pageInfo!=null && pageInfo.getList()!=null && pageInfo.getList().size()!=0){
            return pageInfo;
        }
        return null;
    }

    @ApiOperation(value = "查询农作物分类树状图", notes = "查询level=指定值的农作物分类列表，默认值为1（查询一级及其子类）")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "level", value = "分类", required = false, paramType = "query",dataType = "int"),
    })
    @RequestMapping(value = "/children/level",method = RequestMethod.GET)
    @ResponseBody
    public List<Category> getChildrenCategoryListByLevel(@RequestParam(value="level",defaultValue = "1") Integer level){
        List<Category> childrenCategoryListByLevel = cmsArticleCategoryService.getChildrenCategoryListByLevel(level);
        if (childrenCategoryListByLevel!=null && childrenCategoryListByLevel.size()!=0){
            return childrenCategoryListByLevel;
        }
        return null;
    }

    @ApiOperation(value = "按分类名称查询", notes = "按照分类名称查询分类信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "categoryName", value = "分类名称", required = true, paramType = "query",dataType = "String"),
    })
    @RequestMapping(value = "/category/categoryName",method = RequestMethod.GET)
    @ResponseBody
    public List<CmsArticleCategory> getCmsArticleCategoryByCategoryName(String categoryName){
        if(categoryName!=null){
            List<CmsArticleCategory> cmsArticleCategoryByCategoryName = cmsArticleCategoryService.findCmsArticleCategoryByCategoryName(categoryName);
            if(cmsArticleCategoryByCategoryName!=null && cmsArticleCategoryByCategoryName.size()!=0){
                return cmsArticleCategoryByCategoryName;
            }
        }
        return null;
    }

    @ApiOperation(value = "根据id查询分类信息", notes = "根据ID查询某个分类信息",produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "分类ID", required = true,  paramType = "query",dataType = "Long"),
    })
    @RequestMapping(value = "/category/byId",method = RequestMethod.GET)
    public CmsArticleCategory getCmsArticleCategoryById(@RequestParam(value = "id") Long id){
        if (id!=null){
            CmsArticleCategory cmsArticleCategory  = cmsArticleCategoryService.findCmsArticleCategoryById(id);
            if(cmsArticleCategory!=null){
                return cmsArticleCategory;
            }
        }
        return null;
    }

}
