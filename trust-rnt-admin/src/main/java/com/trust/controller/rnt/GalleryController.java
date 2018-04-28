package com.trust.controller.rnt;

import com.trust.entity.rnt.Gallery;
import com.trust.oss.service.FileService;
import com.trust.oss.util.GalleryPage;
import com.trust.oss.util.OssTools;
import com.trust.service.rnt.GalleryService;
import com.trust.utils.Result;
import net.sf.json.JSONObject;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/rnt/gallery")
public class GalleryController {

    @Autowired
    private GalleryService galleryService;
    @Autowired
    private FileService fileService;

    @RequestMapping(value = "/manage/list")
    @RequiresPermissions("rnt:gallery:manage:list")
    public String galleryManageListPage(Model model, @RequestParam(value = "pageNo", defaultValue = "1") int pageNo,
                                        @RequestParam(value = "pageSize", defaultValue = "10") int pageSize){
        GalleryPage pageInfo = fileService.getFileByPage(OssTools.Bucket.RNT,pageNo,pageSize);
        model.addAttribute("pageInfo", pageInfo);
        return "/rnt/gallery/gallery_list";
    }

    @RequestMapping(value = "/manage/add")
    @RequiresPermissions("rnt:gallery:add")
    public String galleryManageAddPage(){
        return "/rnt/gallery/gallery_add";
    }

    @RequestMapping(value = "/add")
    @ResponseBody
    @RequiresPermissions("rnt:gallery:add")
    public Result addGallery(Gallery gallery){
        Gallery gallerydata = galleryService.getGalleryByName(gallery.getName());
        if(gallerydata != null){
            return Result.error();
        }else{
            galleryService.add(gallery);
            return new Result();
        }
    }

    @RequestMapping(value = "/delete")
    @ResponseBody
    @RequiresPermissions("rnt:gallery:delete")
    public Result deleteImage(@RequestParam("url") String url){
        String key = url.split("oss-cn-hangzhou.aliyuncs.com/")[1];
        String resultjson = fileService.deleteFile(OssTools.Bucket.RNT, key);
        JSONObject json = JSONObject.fromObject(resultjson);
        if(json.getString("success").equals("true")){
            return new Result();
        } else {
            return Result.error();
        }
    }
}
