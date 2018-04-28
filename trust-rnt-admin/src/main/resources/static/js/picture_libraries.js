/**
 * Created by Administrator on 2018/1/18.
 */
$(document).ready(function () {
    //    bootstrap文件上传
    function initFileInput(ctrlName,uploadUrl) {
        var control = $("#" + ctrlName);
        control.fileinput({
            uploadUrl: uploadUrl,
            uploadAsync: true, //默认异步上传
            showUpload: false,
            showRemove: false,
            showCaption: true,
            showPreview: true,
            dropZoneEnabled: false,
            // minImageWidth: 50,
            // minImageHeight: 50,
            // maxImageWidth: 1000,
            // maxImageHeight: 1000,
            maxFileSize: 3000,
            // minFileCount: 0,
            maxFileCount : 1,
            enctype:'multipart/from-data',
            validateInitialCount : true,
            previewFileIcon: "<i class='glyphicon glyphicon-king'></i>",
            msgFilesTooMany : "选择上传的文件数量({n}) 超过允许的最大数值{m}！",
            allowedFileTypes : [ 'image' ],//配置允许文件上传的类型
            allowedPreviewTypes : [ 'image' ],//配置所有的被预览文件类型
            allowedPreviewMimeTypes : [ 'jpg', 'png', 'gif'],//控制被预览的所有mime类型
            language : 'zh'
        });
    }
    initFileInput("pl-library-img0","/rntadmin/sys/file/uploadfile");
    messageBack("pl-library-img0",0);
    function messageBack(evId,evNumber) {
        var messageInput = "#" + evId;
        //success
        var oldUrl = $("#only0").val();
        if(oldUrl!=undefined&&oldUrl!=null&&oldUrl!=""){//删除原有图片
            deleteImgFile(oldUrl);
        }
        $(messageInput).on("fileuploaded", function(event, data, previewId, index) {
            console.log(data);
            if(data.response.state){
                console.log(data);
                console.log(data.response);
                $("#only0").val(data.response.url);
            }
        });
        //error
        $(messageInput).on('fileerror', function(event, data, msg) {
           alert("上传失败！");
        });

        //删除
        $(messageInput).on('filesuccessremove', function(event, id) {
            if($("#only0").val()!=""&&$("#only0").val()!=undefined&&$("#only0").val()!=null){
                deleteImgFile($("#only0").val());
            }
        });
    }
    //验证
    $(".add-library-submit").on('click',function () {
        var libraryImg;
        if ($(".tadd-library-img2").val() == ''){
            libraryImg = 0;
            $(".tadd-library-img2").next().slideDown();
        }else {
            libraryImg = 1;
            $(".tadd-library-img2").next().slideUp();
        }

        if (libraryImg == 1){
            window.location.href = "/rnt/gallery/manage/list?pageNo=1&pageSize=10";
        }else {
            return false
        }
    });

    //返回按钮
    $(".tusual-need-back a").on('click',function () {
        history.go(-1);
    });

    function deleteImgFile(pathUrl){
        $.ajax({
            url: '/rntadmin/sys/file/deletefile',
            data: {'pathUrl':pathUrl,},
            type:'post',
            dataType:'json',
            async : true, //默认为true 异步
            success: function (data) {
                if(data.response.state==true){
                    alert("删除成功");
                    searchFormSubmit();
                }else{
                    alert("删除失败");
                }
            },
            error: function (data) {
                alert("删除失败");
            }
        });
    }
});