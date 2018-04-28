/**
 * Created by Administrator on 2018/1/16.
 */
$(document).ready(function () {
    //    图片预览操作
    $(".table").on('click','tbody td img',function (ev) {
        var previewUrl = $(this).attr("src");
        if (previewUrl == "暂无数据" || previewUrl == "" || !isHasImg(previewUrl)){
            $(".forImges img").attr('src', '');
            ev.stopPropagation();
            return false;
        }
        if (isHasImg(previewUrl)){
            $(".forImges img").attr('src', previewUrl);
        }
    });

    function isHasImg(pathImg){
        var ImgObj=new Image();
        ImgObj.src= pathImg;
        if(ImgObj.fileSize > 0 || (ImgObj.width > 0 && ImgObj.height > 0))
        {
            return true;
        } else {
            return false;
        }
    }

    //  返回按钮
    $(".tusual-need-back a").on('click',function () {
        history.go(-1);
    });
});

