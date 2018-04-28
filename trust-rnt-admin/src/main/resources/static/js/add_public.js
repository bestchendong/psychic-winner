

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
            '<input type="file" name="file" id="add-article-img' + inputIdIndex++ + '" class="add-article-img"/> ' +
            '<img src="/images/delete.png" class="delete-article-images"/>' +
            '<input type="text" class="clone-index tadd-article-img" value="2"/>' +
            '<input value="" type="text" id="only' + idIndex++ + '" class="sign-index tadd-article-img tadd-article-img2"/>' +
            '<span class="article-validate"><sup>*</sup>未添加图片或未成功添加图片</span>'
        );
            var  exactNumber = inputIdIndex -1;
            var getId = "add-article-img" + exactNumber;
            initFileInput(getId,"/rntadmin/sys/file/uploadfile");
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
            '<span class="supplemental-label">正文段落：</span>' +
            '<input type="text" class="clone-index tadd-article-piece" value="1"/>' +
            '<textarea data-animal="cat" class="form-control sign-index add-article-piece" rows="3"></textarea>' +
            '<img src="/images/delete.png" class="delete-article-section"/>' +
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
            autoReplace:true,
            deleteUrl:'',
            maxFileSize:5016,
            // minImageWidth: 50,
            // minImageHeight: 50,
            // maxImageWidth: 1000,
            // maxImageHeight: 1000,
            maxFileSize: 3000,
            // minFileCount: 0,
            multiple: false,
            //默认弹出附件上传窗口
            window:true,
            maxFileCount : 1,
            msgFilesTooMany:1,
            progressUploadThreshold:1,
            enctype:'multipart/from-data',
            validateInitialCount : true,
            previewFileIcon: "<i class='glyphicon glyphicon-king'></i>",
            msgFilesTooMany : "选择上传的文件数量({n}) 超过允许的最大数值{m}！",
            allowedFileTypes : [ 'image' ],//配置允许文件上传的类型
            allowedPreviewTypes : [ 'image' ],//配置所有的被预览文件类型
            allowedPreviewMimeTypes : [ 'jpg', 'png', 'gif'],//控制被预览的所有mime类型
            language : 'zh'
        })
    }
    initFileInput("add-cover-img","/rntadmin/sys/file/uploadfile");
    messageBackPoster("add-cover-img");

    function messageBackPoster(evId) {
        var messageInput = "#" + evId;
        var imgInput = "#only-cover";
        $(messageInput).click(function(event, files) {
           if($(imgInput).val()!=""){
               alert("请先删除上传图片");
               return false;
           }
        });

       $(messageInput).on("fileuploaded", function (event, data, previewId, index) {
            if (data.response.state) {
                var oldUrl = $(imgInput).val();
                if(oldUrl!=undefined&&oldUrl!=null&&oldUrl!=""){//删除原有图片
                    $(imgInput).val("");
                    deleteImgFile(oldUrl);
                }
                $(imgInput).val(data.response.url);
                $('.crop-picture').attr('src', data.response.url)

            }

       });

        $(messageInput).on('fileerror', function (event, data, msg) {
          alert("上传失败！");
        });
        //删除
        $(messageInput).on('filesuccessremove', function(event, id) {
           if($(imgInput).val()!=""&&$(imgInput).val()!=undefined&&$(imgInput).val()!=null){
               $(imgInput).val("");
               deleteImgFile($(imgInput).val());
           }
        });
    }
    function messageBack(evId,evNumber) {
        var messageInput = "#" + evId;
        var imgInput = "#only" + evNumber;
        $(messageInput).on("fileuploaded", function(event, data, previewId, index) {
            if(data.response.state){
                var oldUrl = $(imgInput).val();
                if(oldUrl!=undefined&&oldUrl!=null&&oldUrl!=""){//删除原有图片
                    $(imgInput).val("");
                    deleteImgFile(oldUrl);
                }
                $(imgInput).val(data.response.url);
            }
        });
        //error
        $(messageInput).on('fileerror', function(event, data, msg) {
            alert("上传失败")
        });

        $(messageInput).click(function(event, files) {
            if($(imgInput).val()!=""){
                alert("请先删除上传图片");
                return false;
            }
        });
        //删除
        $(messageInput).on('filesuccessremove', function(event, id) {
            if($(imgInput).val()!=""&&$(imgInput).val()!=undefined&&$(imgInput).val()!=null){
                $(imgInput).val("");
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
            },
            error: function (data) {
                alert("删除失败");
            }
        });
    }

});

