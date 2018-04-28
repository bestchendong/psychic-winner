

/**
 * Created by Administrator on 2017/12/22.
 */
$(document).ready(function () {
    //增加和删除图片
    var labelIndex = 1;
    var inputIdIndex = 1;
    var idIndex = 1;
    var oneName = 1;
    $(".add-article-images").on('click',function () {
        $(".add-form .add-form-div").append('<div class="form-single-part add-single-imgcontent">' +
            '<label for="add-article-img' + labelIndex++ + '">正文图片：</label>' +
            '<input type="file"  name="file" id="add-article-img' + inputIdIndex++ + '" class="add-article-img"/> ' +
            '<span class="delete-article-images">x</span>' +
            '<input type="text" class="clone-index tadd-article-img" value="2"/>' +
            '<input value="" type="text" id="only' + idIndex++ + '" class="sign-index tadd-article-img tadd-article-img2"/>' +
            '<span class="article-validate"><sup>*</sup>未添加图片或未成功添加图片</span>'
        );
            var  exactNumber = inputIdIndex -1;
            var getId = "add-article-img" + exactNumber;
            initFileInput(getId,"/mgt/sys/file/uploadfile");
            messageBack(getId,exactNumber);
    });
    $(".add-form-div").on('click','.delete-article-images',function () {
        var x = confirm("确定删除？");
        if (x == true){
            $(this).parent().remove();
        }else {

        }
    });

    //增加或删除段落
    $(".add-article-section").on('click',function () {
        $(".add-form .add-form-div").append('<div class="form-single-part add-single-piececontent">' +
            '<input type="text" class="clone-index tadd-article-piece" value="1"/>' +
            '<textarea data-animal="cat" class="form-control sign-index add-article-piece" rows="3"></textarea>' +
            '<div class="delete-article-section">x</div>' +
            '<span class="article-validate"><sup>*</sup>未添加内容</span>' +
            '</div>'
        )
    });

    $(".add-form-div").on('click','.delete-article-section',function () {
        var x = confirm("确定删除？");
        if (x == true){
            $(this).parent().remove();
        }else {

        }
    });

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
    initFileInput("add-cover-img","/rntadmin/sys/file/uploadfile");
    messageBackPoster("add-cover-img");
    function messageBackPoster(evId) {
        var messageInput = "#" + evId;
        var imgInput = "#only-cover";
        $(messageInput).on("fileuploaded", function (event, data, previewId, index) {
            if (data.response.state) {
                $(imgInput).val(data.response.url);
            }
        });
        $(messageInput).on('fileerror', function (event, data, msg) {
          alert("上传失败！");
        });
        //删除
        $(messageInput).on('filesuccessremove', function(event, id) {
           if($(imgInput).val()!=""&&$(imgInput).val()!=undefined&&$(imgInput).val()!=null){
               deleteImgFile($(imgInput).val());
           }
        });
    }
    function messageBack(evId,evNumber) {
        var messageInput = "#" + evId;
        var imgInput = "#only" + evNumber;
        $(messageInput).on("fileuploaded", function(event, data, previewId, index) {
            if(data.response.state){
                alert("UTL=" + data.response.url);
                $(imgInput).val(data.response.url);
                //$(imgInput).attr('value',data.response.url);
            }
        });
        //error
        $(messageInput).on('fileerror', function(event, data, msg) {
            alert("上传失败")
        });

        //删除
        $(messageInput).on('filesuccessremove', function(event, id) {
            if($(imgInput).val()!=""&&$(imgInput).val()!=undefined&&$(imgInput).val()!=null){
                deleteImgFile($(imgInput).val());
            }
        });
    }

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

