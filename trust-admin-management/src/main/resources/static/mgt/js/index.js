$(document).ready(function () {
    var data = [
        {"menuId":1,"name":"首页","systemId":1,"parentId":0,"level":1,"pageId":0,"page":null,"childrenMenu":[{"menuId":9,"name":"首页管理","systemId":1,"parentId":1,"level":2,"pageId":0,"page":null,"childrenMenu":[{"menuId":17,"name":"我的首页","systemId":1,"parentId":9,"level":3,"pageId":0,"page":null,"childrenMenu":[],"url":null},{"menuId":18,"name":"我的账户","systemId":1,"parentId":9,"level":3,"pageId":0,"page":null,"childrenMenu":[{"menuId":44,"name":"基本信息","systemId":1,"parentId":18,"level":4,"pageId":0,"page":null,"childrenMenu":[],"url":null},{"menuId":45,"name":"操作日志","systemId":1,"parentId":18,"level":4,"pageId":0,"page":null,"childrenMenu":[],"url":null}],"url":null}],"url":null}],"url":null},
        {"menuId":2,"name":"账户","systemId":1,"parentId":0,"level":1,"pageId":0,"page":null,"childrenMenu":[{"menuId":10,"name":"账户管理","systemId":1,"parentId":2,"level":2,"pageId":0,"page":null,"childrenMenu":[{"menuId":19,"name":"角色信息","systemId":1,"parentId":10,"level":3,"pageId":0,"page":null,"childrenMenu":[{"menuId":46,"name":"角色列表","systemId":1,"parentId":19,"level":4,"pageId":1,"page":null,"childrenMenu":[],"url":"/role/manage"}],"url":null},{"menuId":20,"name":"部门信息","systemId":1,"parentId":10,"level":3,"pageId":0,"page":null,"childrenMenu":[],"url":null},{"menuId":21,"name":"账户信息","systemId":1,"parentId":10,"level":3,"pageId":0,"page":null,"childrenMenu":[{"menuId":48,"name":"账号列表","systemId":1,"parentId":21,"level":4,"pageId":0,"page":null,"childrenMenu":[],"url":null}],"url":null}],"url":null}],"url":null},
        {"menuId":3,"name":"用户","systemId":1,"parentId":0,"level":1,"pageId":0,"page":null,"childrenMenu":[{"menuId":11,"name":"用户管理","systemId":1,"parentId":3,"level":2,"pageId":0,"page":null,"childrenMenu":[{"menuId":22,"name":"用户信息","systemId":1,"parentId":11,"level":3,"pageId":0,"page":null,"childrenMenu":[],"url":null},{"menuId":23,"name":"实名待审核","systemId":1,"parentId":11,"level":3,"pageId":0,"page":null,"childrenMenu":[],"url":null},{"menuId":24,"name":"禁言黑名单","systemId":1,"parentId":11,"level":3,"pageId":0,"page":null,"childrenMenu":[{"menuId":49,"name":"私信黑名单","systemId":1,"parentId":24,"level":4,"pageId":0,"page":null,"childrenMenu":[],"url":null},{"menuId":50,"name":"供需发布黑名单","systemId":1,"parentId":24,"level":4,"pageId":0,"page":null,"childrenMenu":[],"url":null},{"menuId":51,"name":"评论黑名单","systemId":1,"parentId":24,"level":4,"pageId":0,"page":null,"childrenMenu":[],"url":null}],"url":null}],"url":null}],"url":null},
        {"menuId":4,"name":"内容","systemId":1,"parentId":0,"level":1,"pageId":0,"page":null,"childrenMenu":[{"menuId":12,"name":"内容管理","systemId":1,"parentId":4,"level":2,"pageId":0,"page":null,"childrenMenu":[{"menuId":25,"name":"爬虫库","systemId":1,"parentId":12,"level":3,"pageId":0,"page":null,"childrenMenu":[{"menuId":52,"name":"政策法规","systemId":1,"parentId":25,"level":4,"pageId":0,"page":null,"childrenMenu":[],"url":null},{"menuId":53,"name":"公告通知","systemId":1,"parentId":25,"level":4,"pageId":0,"page":null,"childrenMenu":[],"url":null},{"menuId":54,"name":"农业要闻","systemId":1,"parentId":25,"level":4,"pageId":0,"page":null,"childrenMenu":[],"url":null},{"menuId":55,"name":"病虫害集","systemId":1,"parentId":25,"level":4,"pageId":0,"page":null,"childrenMenu":[],"url":null}],"url":null},{"menuId":26,"name":"政策法规","systemId":1,"parentId":12,"level":3,"pageId":0,"page":null,"childrenMenu":[{"menuId":56,"name":"法规列表","systemId":1,"parentId":26,"level":4,"pageId":0,"page":null,"childrenMenu":[],"url":null}],"url":null},{"menuId":27,"name":"公告通知","systemId":1,"parentId":12,"level":3,"pageId":0,"page":null,"childrenMenu":[{"menuId":57,"name":"公告列表","systemId":1,"parentId":27,"level":4,"pageId":0,"page":null,"childrenMenu":[],"url":null}],"url":null},{"menuId":28,"name":"农业要闻","systemId":1,"parentId":12,"level":3,"pageId":0,"page":null,"childrenMenu":[{"menuId":58,"name":"要闻列表","systemId":1,"parentId":28,"level":4,"pageId":0,"page":null,"childrenMenu":[],"url":null}],"url":null},{"menuId":29,"name":"病虫害集","systemId":1,"parentId":12,"level":3,"pageId":0,"page":null,"childrenMenu":[{"menuId":59,"name":"病虫害列表","systemId":1,"parentId":29,"level":4,"pageId":0,"page":null,"childrenMenu":[],"url":null},{"menuId":60,"name":"病虫害类目","systemId":1,"parentId":29,"level":4,"pageId":0,"page":null,"childrenMenu":[],"url":null}],"url":null},{"menuId":30,"name":"农技视频","systemId":1,"parentId":12,"level":3,"pageId":0,"page":null,"childrenMenu":[{"menuId":61,"name":"视频列表","systemId":1,"parentId":30,"level":4,"pageId":0,"page":null,"childrenMenu":[],"url":null},{"menuId":62,"name":"农技视频类目","systemId":1,"parentId":30,"level":4,"pageId":0,"page":null,"childrenMenu":[],"url":null}],"url":null},{"menuId":31,"name":"APP前端设置","systemId":1,"parentId":12,"level":3,"pageId":0,"page":null,"childrenMenu":[{"menuId":63,"name":"客服电话","systemId":1,"parentId":31,"level":4,"pageId":0,"page":null,"childrenMenu":[],"url":null},{"menuId":64,"name":"版权申明","systemId":1,"parentId":31,"level":4,"pageId":0,"page":null,"childrenMenu":[],"url":null}],"url":null}],"url":null}],"url":null},
        {"menuId":5,"name":"集市","systemId":1,"parentId":0,"level":1,"pageId":0,"page":null,"childrenMenu":[{"menuId":13,"name":"集市管理","systemId":1,"parentId":5,"level":2,"pageId":0,"page":null,"childrenMenu":[{"menuId":32,"name":"敏感词库","systemId":1,"parentId":13,"level":3,"pageId":0,"page":null,"childrenMenu":[{"menuId":65,"name":"敏感词列表","systemId":1,"parentId":32,"level":4,"pageId":0,"page":null,"childrenMenu":[],"url":null}],"url":null},{"menuId":33,"name":"供需信息","systemId":1,"parentId":13,"level":3,"pageId":0,"page":null,"childrenMenu":[{"menuId":66,"name":"供应信息列表","systemId":1,"parentId":33,"level":4,"pageId":0,"page":null,"childrenMenu":[],"url":null},{"menuId":67,"name":"求购信息列表","systemId":1,"parentId":33,"level":4,"pageId":0,"page":null,"childrenMenu":[],"url":null}],"url":null},{"menuId":34,"name":"集市私信","systemId":1,"parentId":13,"level":3,"pageId":0,"page":null,"childrenMenu":[{"menuId":68,"name":"私信列表","systemId":1,"parentId":34,"level":4,"pageId":0,"page":null,"childrenMenu":[],"url":null}],"url":null}],"url":null}],"url":null},
        {"menuId":6,"name":"消息","systemId":1,"parentId":0,"level":1,"pageId":0,"page":null,"childrenMenu":[{"menuId":14,"name":"消息管理","systemId":1,"parentId":6,"level":2,"pageId":0,"page":null,"childrenMenu":[{"menuId":35,"name":"短信消息","systemId":1,"parentId":14,"level":3,"pageId":0,"page":null,"childrenMenu":[{"menuId":69,"name":"短信列表","systemId":1,"parentId":35,"level":4,"pageId":0,"page":null,"childrenMenu":[],"url":null}],"url":null},{"menuId":36,"name":"APP推送消息","systemId":1,"parentId":14,"level":3,"pageId":0,"page":null,"childrenMenu":[{"menuId":70,"name":"推送列表","systemId":1,"parentId":36,"level":4,"pageId":0,"page":null,"childrenMenu":[],"url":null}],"url":null},{"menuId":37,"name":"后台站内消息","systemId":1,"parentId":14,"level":3,"pageId":0,"page":null,"childrenMenu":[{"menuId":71,"name":"站内列表","systemId":1,"parentId":37,"level":4,"pageId":0,"page":null,"childrenMenu":[],"url":null}],"url":null}],"url":null}],"url":null},
        {"menuId":7,"name":"统计","systemId":1,"parentId":0,"level":1,"pageId":0,"page":null,"childrenMenu":[{"menuId":15,"name":"数据统计","systemId":1,"parentId":7,"level":2,"pageId":0,"page":null,"childrenMenu":[{"menuId":38,"name":"价格行情","systemId":1,"parentId":15,"level":3,"pageId":0,"page":null,"childrenMenu":[{"menuId":72,"name":"通海县蔬菜日交易价格行情","systemId":1,"parentId":38,"level":4,"pageId":0,"page":null,"childrenMenu":[],"url":null},{"menuId":73,"name":"通海县蔬菜价格走势","systemId":1,"parentId":38,"level":4,"pageId":0,"page":null,"childrenMenu":[],"url":null}],"url":null}],"url":null}],"url":null},
        {"menuId":8,"name":"配置","systemId":1,"parentId":0,"level":1,"pageId":0,"page":null,"childrenMenu":[{"menuId":16,"name":"系统配置","systemId":1,"parentId":8,"level":2,"pageId":0,"page":null,"childrenMenu":[{"menuId":39,"name":"版本管理","systemId":1,"parentId":16,"level":3,"pageId":0,"page":null,"childrenMenu":[{"menuId":74,"name":"版本信息","systemId":1,"parentId":39,"level":4,"pageId":0,"page":null,"childrenMenu":[],"url":null}],"url":null},{"menuId":40,"name":"账号权限","systemId":1,"parentId":16,"level":3,"pageId":0,"page":null,"childrenMenu":[{"menuId":75,"name":"权限信息","systemId":1,"parentId":40,"level":4,"pageId":0,"page":null,"childrenMenu":[],"url":null}],"url":null},{"menuId":41,"name":"图片库管理","systemId":1,"parentId":16,"level":3,"pageId":0,"page":null,"childrenMenu":[{"menuId":76,"name":"图片列表","systemId":1,"parentId":41,"level":4,"pageId":0,"page":null,"childrenMenu":[],"url":null}],"url":null},{"menuId":42,"name":"农作物分类","systemId":1,"parentId":16,"level":3,"pageId":0,"page":null,"childrenMenu":[{"menuId":77,"name":"分类信息","systemId":1,"parentId":42,"level":4,"pageId":0,"page":null,"childrenMenu":[],"url":null}],"url":null},{"menuId":43,"name":"区域管理","systemId":1,"parentId":16,"level":3,"pageId":0,"page":null,"childrenMenu":[{"menuId":78,"name":"区域设置","systemId":1,"parentId":43,"level":4,"pageId":0,"page":null,"childrenMenu":[],"url":null}],"url":null}],"url":null}],"url":null}];
    //请求菜单按钮
    $.ajax({
        url: '/mgt/user/menu',
        type:'post',
        data: {},
        dataType:'json',
        async : false, //默认为true 异步
        success: function (menudata) {
            if(menudata.code==200){
                data = menudata.data;
            }
        },
        error: function (data) {
        }
    });
    var firMenu = '',lastMenu = [],defaulLastMenu = [];
    for (var i = 0; i < data.length;i++){
        firMenu += '<li data-category="' + data[i].menuId + '"><a href="#"><img src="'+data[i].icon+'"/>' + data[i].name + '</a></li>';
    }
    $('.slideUl').html(firMenu);

    $('.slideUl').on('click','li',function () {
        lastMenu = []; //清空全局中的lastMenu数组
        var fouStr = '';
        var secMenu = '',secStr = '',thrMenu = '',thrStr = '',fouMenu = '';
        var pid = $(this).attr('data-category');

        // secMenu = '<div class="menu-box23" menuid="menuId"><div class="slideDiv"></div><ul class="finalUl"></ul></div>';
        for (var i = 0; i < data.length;i++){
            if (data[i].menuId == pid){
                secMenu = data[i].childrenMenu
            }
        }
        for(var i = 0; i < secMenu.length;i++){
            var secLi = "";
            if (secMenu[i].childrenMenu&&secMenu[i].childrenMenu.length > 0){
                for (var j = 0;j < secMenu[i].childrenMenu.length;j++){
                    secLi += '<li menuid="'+secMenu[i].childrenMenu[j].menuId+'"><a href="javascript:void(0);"><span></span>'+ secMenu[i].childrenMenu[j].name +'</a></li>';
                    lastMenu = lastMenu.concat(secMenu[i].childrenMenu[j].childrenMenu); //由于上面清空了全局中的lastMenu数组，现在又重新往全局中的lastMenu数组中赋值
                }
            }
            secStr += '<div class="menu-box23">'+
            '<div class="slideDiv">'+ secMenu[i].name +'</div>'+
            '<ul class="finalUl">'+ secLi +
            '</ul>'+
            '</div>'
        }
        $('.childrenSlide').html(secStr);
        //一级菜单点击时选中二级第一个三级菜单第一个
        //选中四级菜单第一个并显示页面
        $(".childrenSlide .menu-box23:nth-child(1) li:nth-child(1) a").addClass("twoSelect");
        var defA = secMenu[0].childrenMenu;
        var defB = defA[0].menuId;
        var fourSpecial = [];
        for(var i=0;i<lastMenu.length;i++){
            if(lastMenu[i].parentId == defB){
                fouStr += '<li class="fourMenu"><a href="javascript:;" data-url="' + lastMenu[i].url + '">' + lastMenu[i].name + '</a></li>';
                fourSpecial.push(lastMenu[i]);
            }
        }
        $('.fourCtrol').html(fouStr);
        $(".fourCtrol .fourMenu:nth-of-type(1) a").addClass("threeSelect");
        if (fourSpecial.length > 0){
            var getPageUrl = fourSpecial[0].url;
            if(getPageUrl == null || getPageUrl == undefined || getPageUrl == ''){
                $(".mainContent").html('<iframe src="/mgt/sys/readypage" frameborder="0" width="100%" height="100%"></iframe>')
            }else {
                $(".mainContent").html('<iframe src="' + getPageUrl + '" frameborder="0" width="100%" height="100%"></iframe>')
            }
        }else if (fourSpecial.length == 0){
            $(".mainContent").html('<iframe src="/mgt/sys/readypage" frameborder="0" width="100%" height="100%"></iframe>')
        }else {}
    });

    // 点击三级展示第四级菜单并选中第一个并显示页面
    $('.childrenSlide').on('click', '.finalUl li', function(){
        var pid = $(this).attr('menuid');
        var fouStr = '';
        var fourSpecial = [];
       if (lastMenu.length > 0){
           for(var i=0;i<lastMenu.length;i++){
               if(lastMenu[i].parentId == pid){
                   fouStr += '<li class="fourMenu"><a href="javascript:;" data-url="' + lastMenu[i].url + '">' + lastMenu[i].name + '</a></li>';
                   fourSpecial.push(lastMenu[i]);
               }
           }
       }
       if (lastMenu.length <= 0&&defaulLastMenu.length > 0){
           for(var i=0;i<defaulLastMenu.length;i++){
               if(defaulLastMenu[i].parentId == pid){
                   fouStr += '<li class="fourMenu"><a href="javascript:;" data-url="' + defaulLastMenu[i].url + '">' + defaulLastMenu[i].name + '</a></li>';
                   fourSpecial.push(defaulLastMenu[i]);
               }
           }
       }
        $('.fourCtrol').html(fouStr);
        $(".fourCtrol .fourMenu:nth-of-type(1) a").addClass("threeSelect");
        if (fourSpecial.length > 0){
            var getPageUrl = fourSpecial[0].url;
            // console.log(getPageUrl);
            if(getPageUrl == null || getPageUrl == undefined || getPageUrl == ''){
                $(".mainContent").html('<iframe src="/mgt/sys/readypage" frameborder="0" width="100%" height="100%"></iframe>')
            }else {
                $(".mainContent").html('<iframe src="' + getPageUrl + '" frameborder="0" width="100%" height="100%"></iframe>')
            }
        }else if (fourSpecial.length == 0){
            $(".mainContent").html('<iframe src="/mgt/sys/readypage" frameborder="0" width="100%" height="100%"></iframe>')
        }else {}
    });

    //点击四级菜单页面展示
    $(".fourCtrol").on('click','a',function () {
        var getPageUrl = $(this).attr('data-url');
        // console.log(getPageUrl);
        if(getPageUrl == 'null' || getPageUrl == 'undefined' || getPageUrl == ''){
            $(".mainContent").html('<iframe src="/mgt/sys/readypage" frameborder="0" width="100%" height="100%"></iframe>')
        }else {
            $(".mainContent").html('<iframe src="' + getPageUrl + '" frameborder="0" width="100%" height="100%"></iframe>')
        }
    });

    //刚进入页面时默认1-1-1-1
    $(".slideUl li:nth-of-type(1) a").addClass("select");
    var selectMenuA = data[0].childrenMenu;
    var selectMenuB = selectMenuA[0].childrenMenu;
    var selectMenuC = selectMenuB[0].childrenMenu;
    var defaulTwo = "";
    var defaultFour = "";
    // defaulLastMenu = [];
    for (var i = 0; i < selectMenuA.length; i++){
        var defaulTwoLi = "";
        if (selectMenuA[i].childrenMenu&&selectMenuA[i].childrenMenu.length > 0){
            for (var j = 0; j < selectMenuA[i].childrenMenu.length; j++){
                defaulTwoLi += '<li menuid="'+selectMenuA[i].childrenMenu[j].menuId+'"><a href="javascript:void(0);"><span></span>'+selectMenuA[i].childrenMenu[j].name +'</a></li>';
                defaulLastMenu = defaulLastMenu.concat(selectMenuA[i].childrenMenu[j].childrenMenu)
            }
        }
        defaulTwo += '<div class="menu-box23">'+
            '<div class="slideDiv">'+ selectMenuA[i].name +'</div>'+
            '<ul class="finalUl">'+ defaulTwoLi +
            '</ul>'+
            '</div>'
    }
    $('.childrenSlide').html(defaulTwo);
    $(".childrenSlide .menu-box23:nth-child(1) .finalUl li:nth-of-type(1) a").addClass("twoSelect");

    if (selectMenuC&&selectMenuC.length > 0){
        for (var i = 0; i < selectMenuC.length; i++){
            defaultFour += '<li  class="fourMenu"><a href="javascript:;">'+selectMenuC[i].name+'</a></li>'
        }
    }
    $('.fourCtrol').html(defaultFour);
    $(".fourCtrol .fourMenu:nth-of-type(1) a").addClass("threeSelect");
    $(".mainContent").html('<iframe src="' + selectMenuC[0].url + '" frameborder="0" width="100%" height="100%"></iframe>')
});