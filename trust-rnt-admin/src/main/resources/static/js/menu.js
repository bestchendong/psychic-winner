/**
 * Created by Administrator on 2017/11/30.
 */
$(document).ready(function () {
    $(".slideUl").on('click','li a',function () {
        $(".slideUl li a").removeClass("select");
        $(this).addClass("select");
        $(".fourCtrol").empty();
    });

    $(".childrenSlide").on('click','.finalUl a',function () {
        $(".finalUl li a").removeClass("twoSelect");
        $(this).addClass("twoSelect");
        // $(".fourCtrol .fourMenu a").removeClass("threeSelect");
        // $(".fourCtrol .fourMenu:nth-child(1) a").addClass("threeSelect");
    });

    $(".fourCtrol").on('click','.fourMenu a',function () {
        $(".fourCtrol .fourMenu a").removeClass("threeSelect");
        $(this).addClass("threeSelect");
    });
});

//---

// $('.allContent').html('<iframe src="http://www.baidu.com" width="100%" height="100%"></iframe>')