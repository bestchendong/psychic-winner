/**
 * Created by Administrator on 2017/12/18.
 */
$(document).ready(function () {
    var originImg = $(".edit-article-img");
    // console.log(originImg);
    var originImgLength = originImg.length;
    // console.log(originImgLength);
    if (originImgLength > 0){
        var getOriginId = originImg[originImgLength-1].getAttribute("id");
        var getOriginNumber = getOriginId.substring(16);
        var originNumber = parseInt(getOriginNumber);
        // console.log(originNumber);
        var labelIndex = originNumber + 1;
        var inputIdIndex = originNumber + 1;
        var idIndex = originNumber + 1;
    }else {
        var labelIndex = 1;
        var inputIdIndex = 1;
        var idIndex = 1;
    }
    //增加和删除图片
    $(".edit-article-images").on('click',function () {
        $(".tusual-article-content .edit-content-area").append(
            '<div class="edit-single-imgcontent">' +
            '<label for="edit-article-img' + labelIndex++ + '">正文图片：</label>' +
            '<input type="file" name="file" id="edit-article-img' + inputIdIndex++ + '" class="edit-article-img"/> ' +
            '<span class="delete-article-images">x</span>' +
            '<input type="text" class="clone-index tedit-article-img" value="2"/>' +
            '<input type="text" id="only' + idIndex++ + '" class="sign-index tedit-article-img tedit-article-img2"/>' +
            '<input type="hidden" class="tedit-article-article_id"/>'+
            '<span class="article-validate"><sup>*</sup>未添加图片或未成功添加图片</span>' +
            '</div>'
        );
        var  exactNumber = inputIdIndex -1;
        var getId = "edit-article-img" + exactNumber;
        initFileInput(getId,"/mgt/sys/file/uploadfile");
        messageBack(getId,exactNumber);
    });
    $(".edit-content-area").on('click','.delete-article-images',function () {
        var x = confirm("确定删除？");
        if (x == true){
            $(this).parent().remove();
        }else {

        }
    });

    //增加或删除段落
    $(".edit-article-section").on('click',function () {
        $(".tusual-article-content .edit-content-area").append(
            '<div class="edit-single-piececontent">' +
            '<input type="text" class="clone-index tedit-article-piece" value="1"/>' +
            '<textarea data-animal="cat" class="form-control sign-index edit-article-piece" rows="3"></textarea>' +
            '<input type="hidden" class="tedit-article-article_id"/>'+
            '<div class="delete-article-section">x</div>' +
            '<span class="article-validate"><sup>*</sup>未添加内容</span>' +
            '</div>'
        )
    });
    $(".edit-content-area").on('click','.delete-article-section',function () {
        var x = confirm("确定删除？");
        if (x == true){
            $(this).parent().remove();
        }else {

        }
    });

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
    initFileInput("edit-cover-img","/mgt/sys/file/uploadfile");
    messageBackPoster("edit-cover-img");
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
    /**
     * @author ycb
     * @description 回调
     */
    function messageBack(evId,evNumber) {
        var messageInput = "#" + evId;
        var imgInput = "#only" + evNumber;
        $(messageInput).on("fileuploaded", function (event, data, previewId, index) {
            if(data.response.state){
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

    /**
     * @author ycb
     * @description 删除图片
     */
    function deleteImgFile(pathUrl){
        $.ajax({
            url: '/mgt/sys/file/deletefile',
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
    // 替换原正文图片的处理
    $(".edit-single-coverimg").on('change','.edit-cover-img',function () {
        var deleteShowImg = $(this).parents(".edit-single-coverimg");
        deleteShowImg.prev().remove();
    })
    // 替换原正文图片的处理
    $(".edit-content-area").on('change','.edit-article-img',function () {
        var deleteShowImg = $(this).parents(".edit-origin-imgcontent");
        deleteShowImg.prev().remove();
    })
    /**
     * @author ycb
     * @description 模糊绑定
     */
    $("input[id^='edit-article-img']").each(function (i) {
        var getId = $(this).attr("id");
        initFileInput(getId,"/mgt/sys/file/uploadfile");
        var arry = getId.split("edit-article-img");
        if(arry.length==2){
            messageBack(getId,arry[1]);
        }
    });
    //  返回按钮
    $(".tusual-need-back a").on('click',function () {
        history.go(-1);
    });
});