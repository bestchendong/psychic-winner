$(function(){
    $('.dropdown li a').click(function(e){
        var val = $(this).html();
        var pvalObj = $(this).parents('ul').siblings('a');
        var pvalLen = pvalObj.length;
        var pval = '';
        pvalObj.each(function(){
            pval += $(this).html() + ' / ';
        });
        if(pval){
            $(this).parents('.dropdown').find('.classify').val(pval + val).click();
        }else{
            $(this).parents('.dropdown').find('.classify').val(val).click();
        }
        e.stopPropagation();
    });
    // 编辑时弹出框内容显示
    $('.edit-item').click(function(){
        $('#add-item .modal-body .info-section').eq(0).find('input').val($(this).parents('tr').find('td').eq(3).html());
        $('#add-item .modal-body .info-section').eq(1).find('input').val($(this).parents('tr').find('td').eq(1).html());
        $('#add-item .modal-body .info-section').eq(2).find('input').val($(this).parents('tr').find('td').eq(2).html());
        $('#add-item .modal-body .info-section').eq(3).find('input').val($(this).parents('tr').find('td').eq(4).html());
        $('#add-item .modal-body .info-section').eq(4).find('input').val($(this).parents('tr').find('td').eq(5).html());
        $('#add-item .modal-body .info-section').eq(5).find('input').val($(this).parents('tr').find('td').eq(6).html());
        if($(this).parents('tr').find('td').eq(7).html() === '启用'){
            $('.manager-status input[type=radio]').eq(0).attr('checked',true)
        }else{
            $('.manager-status input[type=radio]').eq(0).attr('checked',true)
        }
    });
});
