/**
 * Created by Administrator on 2017/12/18.
 */
$(document).ready(function () {
    // 内容区对操作加的图片input框设置初始id号
    var originImg = $(".edit-article-img");
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
    //增加和删除正文图片
    $(".edit-article-images").on('click',function () {
        $(".tusual-article-content .edit-content-area").append(
            '<div class="edit-single-imgcontent">' +
            '<label for="edit-article-img' + labelIndex++ + '">正文图片：</label>' +
            '<input type="file" name="file" id="edit-article-img' + inputIdIndex++ + '" class="edit-article-img"/> ' +
            '<img src="/images/delete.png" class="delete-article-images"/>' +
            '<input type="text" class="clone-index tedit-article-img" value="2"/>' +
            '<input type="text" id="only' + idIndex++ + '" class="sign-index tedit-article-img tedit-article-img2"/>' +
            '<input type="hidden" class="tedit-article-article_id"/>'+
            '<span class="article-validate"><i class="star-validate">*</i>未添加图片或未成功添加图片</span>' +
            '</div>'
        );
        var  exactNumber = inputIdIndex -1;
        var getId = "edit-article-img" + exactNumber;
        initFileInput(getId,"/rntadmin/sys/file/uploadfile");
        messageBack(getId,exactNumber);
    });
    //新增正文图片的删除
    $(".edit-content-area").on('click','.delete-article-images',function () {
        var x = confirm("确定删除？");
        if (x == true){
            var articleNeedUrl = $(this).next().next().val();
            if (articleNeedUrl){
                deleteImgFile(articleNeedUrl);
            }
            $(this).parent().remove();
        }else {

        }
    });
    //origin图片的删除
    $(".edit-content-area").on('click','.deleteorigin-article-images',function () {
        var x = confirm("确定删除？");
        if (x == true){
            var originNeedUrl = $(this).next().next().val();
            if (originNeedUrl){
                deleteImgFile(originNeedUrl);
            }
            $(this).parent().parent().remove();
        }else {

        }
    });

    //封面图片删除
    $(".edit-show-coverimg").on('click','.delete-cover-images',function () {
        var x = confirm("确定删除？");
        if (x == true){
            $(this).parent().remove();
            var coverNeedUrl = $("#only-cover").val();
            $("#only-cover").val("");
           if(coverNeedUrl){
               deleteImgFile(coverNeedUrl);
           }
        }else {

        }
    });
    //增加或删除正文段落
    $(".edit-article-section").on('click',function () {
        $(".tusual-article-content .edit-content-area").append(
            '<div class="edit-single-piececontent">' +
            '<input type="text" class="clone-index tedit-article-piece" value="1"/>' +
            '<textarea data-animal="cat" class="form-control sign-index edit-article-piece" rows="3"></textarea>' +
            '<input type="hidden" class="tedit-article-article_id"/>'+
            '<img src="/images/delete.png" class="delete-article-section"/>' +
            '<span class="article-validate"><i class="star-validate">*</i>未添加内容</span>' +
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
        });
    }
    initFileInput("edit-cover-img","/rntadmin/sys/file/uploadfile");
    messageBackPoster("edit-cover-img");
    function messageBackPoster(evId) {
        var messageInput = "#" + evId;
        var imgInput = "#only-cover";
        $(messageInput).click(function(event, files) {
            if ($(this).attr('data-category') == "corigin"){
                $(this).on('change',function () {
                    $(this).attr('data-category','');
                    $(imgInput).val("");
                })
            }else {
                if($(imgInput).val()!=""){
                    alert("请先删除上传图片");
                    return false;
                }
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
    /**
     * @author ycb
     * @description 回调
     */
    function messageBack(evId,evNumber) {
        var messageInput = "#" + evId;
        var imgInput = "#only" + evNumber;
        $(messageInput).on("fileuploaded", function (event, data, previewId, index) {
            if(data.response.state){
                var oldUrl = $(imgInput).val();
                if(oldUrl!=undefined&&oldUrl!=null&&oldUrl!=""){//删除原有图片
                    $(imgInput).val("");
                    deleteImgFile(oldUrl);
                }
                $(imgInput).val(data.response.url);
            }
        });
        $(messageInput).on('fileerror', function (event, data, msg) {
            alert("上传失败！");
        });
        $(messageInput).click(function(event, files) {
            if ($(this).attr('data-category') == "origin"){
                $(this).on('change',function () {
                    $(this).attr('data-category','');
                    $(imgInput).val("");
                })
            }else {
                if($(imgInput).val()!=""){
                    alert("请先删除上传图片");
                    return false;
                }
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

    /**
     * @author ycb
     * @description 删除图片
     */
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
    // 替换原封面图片的处理
    $(".edit-single-coverimg").on('change','.edit-cover-img',function () {
        var deleteShowImg = $(this).parents(".edit-single-coverimg");
        deleteShowImg.prev(".edit-show-coverimg").remove();
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
        initFileInput(getId,"/rntadmin/sys/file/uploadfile");
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