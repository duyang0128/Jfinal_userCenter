/**
 * Created by wuhongxu on 2016/11/30 0030.
 */

var FormException = {
    forms: {},
    bufferKey: 'defaults',
    devMode: true,
    bindForm: function (selector, key) {
        if (key == null)
            key = this.bufferKey;
        this.bufferKey = key;
        if (this.forms[key] != null) {
            return this;
        }
        this.forms[this.bufferKey] = selector;
        if ($(selector).length == 0) {
            Dev().error("没有绑定到表单");
            return this;
        }
        if (!$(selector).is('form')) {
            Dev().warn("虽然你绑定的不是表单，但是这并没有什么关系~");
        }
        return this;
    },
    use: function (key) {
        if (this.forms[key] != null) {
            this.bufferKey = key;
            return this;
        }

        if ($(key).length == 0) {
            Dev().error("没有绑定到表单");
            return null;
        }

        if (!$(key).is('form')) {
            Dev().warn("虽然你使用的不是表单，但是这并没有什么关系~");
            this.bindForm($(key));
            return this;
        }
    },
    do: function (data) {
        var form = $(this.forms[this.bufferKey]);
        if (form.length == 0) {
            Dev().error('未查询到表单绑定');
            return;
        }
        data.map(function (val, index) {
            var input = form.find('[name=' + val.name + "]");
            var p = input.parent();
            p.addClass('has-' + val.state);
            var msg = p.find('.help-block');
            msg.remove();
            var span = '<span class="help-block"></span>';
            p.append(span);
            msg = p.find('.help-block');
            msg.text(val.msg);
            input.one('input propertychange', function () {
                msg.remove();
                p.removeClass('has-' + val.state);
            });
        })
    }

}