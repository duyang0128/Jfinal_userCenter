/**
 * Created by wuhongxu on 2016/8/30 0030.
 */
jQuery.fn.showLoading = function () {
    if ($(this).attr('data-lb') == '1')
        return;
    var width = $(this).width();
    var height = $(this).height();
    var str = '<div style="position:relative; width:' + width + 'px;height:' + height + 'px" class="panel_loading"><div class="sk-circle"> <div class="sk-circle1 sk-child"></div> <div class="sk-circle2 sk-child"></div> <div class="sk-circle3 sk-child"></div> <div class="sk-circle4 sk-child"></div> <div class="sk-circle5 sk-child"></div> <div class="sk-circle6 sk-child"></div> <div class="sk-circle7 sk-child"></div> <div class="sk-circle8 sk-child"></div> <div class="sk-circle9 sk-child"></div> <div class="sk-circle10 sk-child"></div> <div class="sk-circle11 sk-child"></div> <div class="sk-circle12 sk-child"></div> </div></div>';
    $(this).children().addClass('sr-only');
    $(this).append(str);
    $(this).attr('data-lb', '1');
    var dom = $(this);
    setTimeout(function () {
        dom.attr('data-lb', '0');
    }, 500);
};
jQuery.fn.closeLoading = function () {
    var dom = $(this);
    if (dom.attr('data-lb') == '1') {
        setTimeout(function () {
            dom.closeLoading();
        }, 100);
        return;
    }
    dom.find('.panel_loading').fadeOut(500, function () {
        $(this).remove();
        dom.children().removeClass('sr-only');
    });
};

jQuery.fn.formToJson = function (options) {
    var dom = $(this);
    var data = $(this).serializeArray();
    if(options.length > 0)
    data.map(function (val, index) {
        var op = dom.find('[name="'+val.name+'"]');
        
    });
    return data;
}