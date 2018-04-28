/**
 * Created by Administrator on 2018/1/16.
 */
$(document).ready(function () {
    //    图片预览操作
   $(".table").on('click','tbody td img',function () {
       var previewUrl = $(this).attr("src");
       $(".all-preview").attr('src',previewUrl);
       $('.rule').addClass('show');
   })
    $('.img-close').on('click', function() {
        $('.pop').removeClass('show');
    });

    //  返回按钮
    $(".tusual-need-back a").on('click',function () {
        history.go(-1);
    });
});

