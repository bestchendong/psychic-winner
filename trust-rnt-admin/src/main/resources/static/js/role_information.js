/**
 * Created by Administrator on 2017/12/19.
 */
//添加角色
function rollAddFormSubmit(){
    if(addFormValidate()){
        $.post("/admin/role/add",$("#addForm").serialize(),function(data){
            if(data.code == 200){
                window.location.reload();
            } else {
                alert("增加失败");
            }
        });
    } else {
        alert("请输入名称");
    }
}
//编辑模态框赋值
function editModal(id) {
    //可以采用传参的方式而不向后台请求
    $.get("/admin/role/detail",{roleId:id},function(role){
        $("#editRoleId").val(role.roleId);
        $("#editSystemId").val(role.systemId);
        $("#editRoleName").val(role.name);
        $("#editRoleDescription").val(role.description);
        if(role.status == 1){
            $("#edit-radio1").attr("checked","checked");
        }else {
            $("#edit-radio2").attr("checked","checked");
        }
    });
}
function editFormSubmit(){
    if(editFormValidate()){
        $.post("/admin/role/edit",$("#editForm").serialize(),function(data){
            if(data.code == 200){
                window.location.reload();
            } else {
                alert("修改失败")
            }
        });
    } else {
        alert("请输入名称");
    }
}
var letters = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n'];
var idNumber = ['-one','-two','-three','-four','-five','-six','-seven','-eight','-ten','-eleven','-twelve'];
//页面（即菜单）权限树展示
function roleMenuModal(roleId){
    var roleIdInput = '<input name="roleId" type="hidden" value="'+roleId+'"/>';
    $.get("/admin/role/tree/menu",{"systemId":1,"roleId":roleId},function(tree){
        if(tree != null){
            var firstMenu = "";
            for(var i = 0; i < tree.length; i++){
                firstMenu += '<div class="page-set-one" id="'+'sign'+idNumber[i]+'">' +
                                '<div class="page-one-line">' +
                                    '<input type="checkbox" name="menuId" value="'+tree[i].id+'" id="'+letters[i]+'" '+((tree[i].checked)?'checked="true"':'')+'/>' +
                                    '<label for="'+letters[i]+'">'+tree[i].text+'</label>' +
                                '</div>'+
                            '</div>';
                var childrenMenu2 = tree[i].children;
                if(childrenMenu2.length > 0){
                    var secondMenu = "";
                    for(var j = 0; j < childrenMenu2.length; j++){
                        secondMenu += '<div class="page-set-two" id="'+'sign'+idNumber[i]+idNumber[j]+'">' +
                                        '<div class="page-two-content">' +
                                            '<div class="page-two-line">' +
                                                '<input type="checkbox" name="menuId" value="'+childrenMenu2[j].id+'"  id="'+letters[i]+letters[j]+'" '+((childrenMenu2[j].checked)?'checked="true"':'')+'/>' +
                                                '<label for="'+letters[i]+letters[j]+'">'+childrenMenu2[j].text+'</label>' +
                                            '</div>' +
                                        '</div>' +
                                      '</div>';
                        var childrenMenu3 = childrenMenu2[j].children;
                        if(childrenMenu3.length > 0){
                            var thirdMenu = "";
                            var thirdMenuPre = '<div class="page-set-three">';
                            var thirdMenuEnd =  '</div>';
                            for(var k = 0; k < childrenMenu3.length; k++){
                                thirdMenu +=  '<div class="page-three-content">' +
                                                    '<div class="page-three-line">' +
                                                        '<input type="checkbox" name="menuId" value="'+childrenMenu3[k].id+'"  id="'+letters[i]+letters[j]+letters[k]+'" '+((childrenMenu3[k].checked)?'checked="true"':'')+'/>' +
                                                        '<label for="'+letters[i]+letters[j]+letters[k]+'">'+childrenMenu3[k].text+'</label>' +
                                                    '</div>' +
                                                '</div>';
                                var childrenMenu4 = childrenMenu3[k].children;
                                if(childrenMenu4.length > 0){
                                    var forthMenu = "";
                                    var forthMenuPre = '<div class="page-set-four">';
                                    var forthMenuEnd = '</div>';
                                    for(var l = 0; l<childrenMenu4.length; l++){
                                        forthMenu += '<div class="page-four-content">' +
                                                            '<input type="checkbox" name="menuId" value="'+childrenMenu4[l].id+'"  id="'+letters[i]+letters[j]+letters[k]+letters[l]+'" '+((childrenMenu4[l].checked)?'checked="true"':'')+'/>' +
                                                            '<label for="'+letters[i]+letters[j]+letters[k]+letters[l]+'">'+childrenMenu4[l].text+'</label>' +
                                                        '</div>';
                                    }
                                    forthMenu = forthMenuPre + forthMenu + forthMenuEnd;
                                    thirdMenu = thirdMenu.substring(0,thirdMenu.length-6) + forthMenu + thirdMenu.substring(thirdMenu.length-6);
                                }
                            }
                            thirdMenu = thirdMenuPre + thirdMenu +thirdMenuEnd;
                            secondMenu = secondMenu.substring(0,secondMenu.length-6) + thirdMenu + secondMenu.substring(secondMenu.length-6);
                        }
                    }
                    firstMenu = firstMenu.substring(0,firstMenu.length-6)+secondMenu+firstMenu.substring(firstMenu.length-6);
                }
            }
            $("#roleMenuEditForm").html(firstMenu+roleIdInput);
            checkboxBlindClick();
        }
    });
}
//操作（即按钮）权限树展示
function roleOperationModal(roleId){
    $.get("/admin/role/tree/operation",{"roleId":roleId},function(tree){
        console.log(tree);
        var roleIdInput = '<input name="roleId" type="hidden" value="'+roleId+'"/>';
        var firstLevel = "";
        if(tree != null && tree.length > 0){
            for(var i = 0; i < tree.length; i++){
                firstLevel += '<div class="button-set-one">' +
                                '<div class="button-one-line">' +
                                    '<h4>'+tree[i].text+'</h4>' +
                                '</div>' +
                              '</div>';
                var operations = tree[i].children;
                if(operations.length > 0) {
                    var secondLevel = "";
                    var secondPre = '<div class="button-set-two">';
                    var secondEnd = '</div>';
                    for(var j = 0; j < operations.length; j++){
                        secondLevel +=  '<div class="button-two-content">' +
                                                '<input type="checkbox" value="'+operations[j].id+'" name="operationId" id="'+'o_'+operations[j].id+'" '+((operations[j].checked)?'checked="true"':'')+'/>' +
                                                '<label for="'+'o_'+operations[j].id+'">'+operations[j].text+'</label>' +
                                            '</div>' ;
                    }
                    secondLevel = secondPre +secondLevel +secondEnd;
                    firstLevel = firstLevel.substring(0,firstLevel.length-6) + secondLevel + firstLevel.substring(firstLevel.length-6);
                }
            }
            $("#roleOperationEditForm").html(firstLevel+roleIdInput);
        }else if(tree == null || tree.length == 0 || tree == undefined){
            var promptMessgae = '<div style="color: red">您未选择页面权限！请先选择页面权限</div>';
            $("#roleOperationEditForm").html(promptMessgae);
        }else {}
    });
}

function roleMenuFormSubmit(){
    var menuIds = "";
    var roleId = $("form[id=roleMenuEditForm] input[name='roleId']")[0].value;
    var checkedMenu = $("form[id=roleMenuEditForm] input[name='menuId']:checked");
    if(checkedMenu.length > 0){
        for(var i = 0; i < checkedMenu.length; i++){
            menuIds += checkedMenu[i].value + ",";
        }
    }
    $.post("/admin/role/set/menu",{"roleId":roleId,"menuIds":menuIds},function(data){
        if(data.code == 200){
            $("#myModal2").modal('hide');
            //window.location.reload();
        } else {
            alert("操作失败");
        }
    });
}
function roleOperationFormSubmit(){
    var operationIds = "";
    var roleId = $("form[id=roleOperationEditForm] input[name='roleId']")[0].value;
    var checkedOperation = $("form[id=roleOperationEditForm] input[name='operationId']:checked");
    if(checkedOperation.length > 0){
        for(var i = 0; i < checkedOperation.length; i++){
            operationIds += checkedOperation[i].value + ",";
        }
    }
    $.post("/admin/role/set/operation",{"roleId":roleId,"operationIds":operationIds},function(data){
        if(data.code == 200){
            $("#myModal3").modal('hide');
            //window.location.reload();
        } else {
            alert("操作失败");
        }
    })
}
function deleteRole(roleId){
    var x = confirm("确定删除该角色吗？");
    if(x == true){
        $.post("/admin/role/delete",{"roleId":roleId},function(data){
            if(data.code == 200){
                window.location.reload();
            } else {
                alert("删除失败");
            }
        })
    }
}
function checkboxBlindClick() {
    $(".page-one-line input").on('click',function () {
        var getSignId = $(this).parent().parent().attr("id");
        // console.log(getSignId);
        if (this.checked){
            $("#" + getSignId + " .page-two-line :checkbox").prop("checked",true);
            $("#" + getSignId + " .page-three-line :checkbox").prop("checked",true);
            $("#" + getSignId + " .page-four-content :checkbox").prop("checked",true);
        }
        else {
            $("#" + getSignId + " .page-two-line :checkbox").prop("checked",false);
            $("#" + getSignId + " .page-three-line :checkbox").prop("checked",false);
            $("#" + getSignId + " .page-four-content :checkbox").prop("checked",false);
        }
    });
    //    点击二级
    $(".page-two-line input").on('click',function () {
        var getSignId = $(this).parent().parent().parent().prev().parent().attr("id");
        // console.log(getSignId);
        var getSignChildId = $(this).parent().parent().parent().attr("id");
        //  if ($(this).prop("checked") == true){ 亦可，js的this对应checked，jq的$(this)对应prop方法
        if (this.checked){
            $("#" + getSignChildId + " .page-three-line :checkbox").prop("checked",true);
            $("#" + getSignChildId + " .page-four-content :checkbox").prop("checked",true);
        }
        else {
            $("#" + getSignChildId + " .page-three-line :checkbox").prop("checked",false);
            $("#" + getSignChildId + " .page-four-content :checkbox").prop("checked",false);
        }
        var getAllTwoInput = $("#" + getSignId + " .page-set-two .page-two-line input");
        if (allTwoJudge(getAllTwoInput) == true){
            $("#" + getSignId + " .page-one-line :checkbox").prop("checked",true);
        }else if (allTwoJudge(getAllTwoInput) == false){
            $("#" + getSignId + " .page-one-line :checkbox").prop("checked",false);
        }else {}
    });

    //  点击三级
    $(".page-three-line input").on('click',function () {
        var getSignId = $(this).parent().parent().parent().parent().parent().attr("id");
        // console.log(getSignId);
        var getSignChildId = $(this).parent().parent().parent().parent().attr("id");
        var getFourDiv = $(this).parent().next();   // <div class="page-set-four">
        var getFourInput = getFourDiv.find("input");
        if (this.checked){
            getFourInput.prop("checked",true);
        }else {
            getFourInput.prop("checked",false);
        }
        var getThreeDiv = $(this).parent().parent().parent();
        var getThreeInput = getThreeDiv.find(".page-three-line input");
        // console.log(getThreeInput);
        if (allThreeJudge(getThreeInput) == true){
            $("#" + getSignChildId + " .page-two-line :checkbox").prop("checked",true);
        }else if(allThreeJudge(getThreeInput) == false){
            $("#" + getSignChildId + " .page-two-line :checkbox").prop("checked",false);
        }else {}
        var getAllThreeInput = $("#" + getSignId + " .page-set-two .page-three-line input");
        if (allThreeJudge(getAllThreeInput) == true){
            $("#" + getSignId + " .page-one-line :checkbox").prop("checked",true);
        }else if(allThreeJudge(getAllThreeInput) == false){
            $("#" + getSignId + " .page-one-line :checkbox").prop("checked",false);
        }else {}
    });

    //点击第四级
    $(".page-four-content input").on('click', function () {
        var getSignId = $(this).parent().parent().parent().parent().parent().parent().attr("id");
        // console.log(getSignId);
        var getSignChildId = $(this).parent().parent().parent().parent().parent().attr("id");
        var getFourDiv2 = $(this).parent().parent();  // <div class="page-set-four">
        var getFourInput2 = getFourDiv2.find("input");
        // console.log(getFourInput2);
        var getPreDiv = getFourDiv2.prev();
        if (allFourJudge(getFourInput2) == true) {
            getPreDiv.find("input").prop("checked", true);
        } else if (allFourJudge(getFourInput2) == false) {
            getPreDiv.find("input").prop("checked", false);
        } else {
        }
        var getThreeDiv2 = $(this).parent().parent().parent().parent();
        var getThreeInput2 = getThreeDiv2.find(".page-three-line input");
        // console.log(getThreeInput2);
        if (allThreeJudge(getThreeInput2) == true) {
            $("#" + getSignId + " .page-one-line :checkbox").prop("checked", true);
            $("#" + getSignChildId + " .page-two-line :checkbox").prop("checked", true);
        } else if (allThreeJudge(getThreeInput2) == false) {
            $("#" + getSignId + " .page-one-line :checkbox").prop("checked", false);
            $("#" + getSignChildId + " .page-two-line :checkbox").prop("checked", false);
        } else {
        }
        var getAllFourInput = $("#" + getSignId + " .page-set-two .page-set-three .page-set-four input");
        if (allFourJudge(getAllFourInput) == true) {
            $("#" + getSignId + " .page-one-line :checkbox").prop("checked", true);
        } else if (allFourJudge(getAllFourInput) == false) {
            $("#" + getSignId + " .page-one-line :checkbox").prop("checked", false);
        } else {
        }
    });
    //  判断二级全选情况
    function allTwoJudge(getAllTwoInput) {
        for (var i = 0;  i < getAllTwoInput.length; i++){
            if (getAllTwoInput[i].checked == true){
                return true;
            }
        }
        return false;
    }

//判断三级的全选情况
    function allThreeJudge(getAllThreeInput) {
        for (var i = 0;  i < getAllThreeInput.length; i++){
            if (getAllThreeInput[i].checked == true){
                return true;
            }
        }
        return false;
    }

//判断四级的全选情况
    function allFourJudge(getFourInput2) {
        for (var i = 0; i < getFourInput2.length; i++) {
            if (getFourInput2[i].checked == true) {
                return true;
            }
        }
        return false;
    }
}

function addFormValidate(){
    var roleName = $("#addForm input[name='name']").val();
    if(roleName == null || roleName == ""){
        return false;
    } else {
        //后端在执行增加操作前进行了角色名称重复验证，此处不再做验重
        return true;
    }
}

function editFormValidate(){
    var roleName = $("#editForm input[name='name']").val();
    if(roleName == null || roleName == ""){
        return false;
    } else {
        //后端在执行编辑操作前进行了角色名称重复验证，此处不再做验重
        return true;
    }
}