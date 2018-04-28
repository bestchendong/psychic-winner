/**
 * Created by Administrator on 2017/12/13.
 */
/**
 * Created by Administrator on 2017/12/12.
 */
$(document).ready(function () {
    //通用全选checkbox函数
    function doCheckbox() {
        var titleInput = document.querySelector(".usual-checked-all");
        var bottomInput = document.querySelector(".usual-checked-tall");
        var allInput = document.querySelectorAll(".usual-controll-tabel table tbody tr td input");
        // console.log(allInput);
//    使titleInput 或 bottomInput选中时 allInput集合内的所有元素都被选中
        titleInput.onclick = function () {
            if(titleInput.checked){
                bottomInput.checked = true;
            }
            else {
                bottomInput.checked = false;
            }
            for (var i = 0; i < allInput.length;i++){
                if (titleInput.checked){
                    allInput[i].checked = true;
                }
                else {
                    allInput[i].checked = false;
                }
            }
        };
        bottomInput.onclick = function () {
            if(bottomInput.checked){
                titleInput.checked = true;
            }
            else {
                titleInput.checked = false;
            }
            for (var i = 0; i < allInput.length;i++){
                if (bottomInput.checked){
                    allInput[i].checked = true;
                }
                else {
                    allInput[i].checked = false;
                }
            }
        };
//    每次点击一个allInput内的元素都判断一次是否allInput内的元素都已经是勾号了
        for (var i = 0; i < allInput.length;i++){
            allInput[i].onclick = function () {
                if (allSelected() == true){
                    titleInput.checked = true;
                    bottomInput.checked = true;
                }
                else {
                    titleInput.checked = false;
                    bottomInput.checked = false;
                }
            }
        }
//    封装一个方法，判断所有checkbox是否都被选中
//    全部被选中返回true 否则返回false
        function allSelected() {
            for (var i = 0; i < allInput.length; i++){
                if (allInput[i].checked == false){
                    return false;
                }
            }
            return true;
        }
    }
    doCheckbox();

    // $(".usual-delete-button").on('click',function () {
    //     var x = confirm("确定删除？");
    //     if (x == true){
    //         alert("你已成功删除");
    //         // var getValue = $(this).attr("value");
    //     }else {
    //
    //     }
    // });
//    图片预览操作
    $(".table").on('click','tbody td img',function () {
        var previewUrl = $(this).attr("src");
        $(".usual-preview").attr('src',previewUrl);
        $('.rule').addClass('show');
    });
    $('.img-close').on('click', function() {
        $('.pop').removeClass('show');
    });

});