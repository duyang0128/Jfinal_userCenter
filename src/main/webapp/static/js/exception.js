/**
 * Created by wuhongxu on 2016/11/30 0030.
 */

var FormException = {
    forms:{},
    bufferKey:'defaults',
    devMode:true,
    bindForm:function(selector,key){

        if(key != null)
            FormException.bufferKey = key;
        key = FormException.bufferKey;
        if(FormException.forms[key] != null){
            Dev().error("试图绑定多个表单时,key值不唯一");
            return FormException;
        }
        FormException.forms[key] = selector;
        if($(selector).length == 0){
            Dev().error("没有绑定到表单");
            return FormException;
        }
        if(!$(selector).is('form')){
            Dev().warn("虽然你绑定的不是表单，但是这并没有什么关系~");
        }
        return FormException;
    },
    use:function (key) {
        if(FormException.forms[key] != null){
            FormException.bufferKey = key;
            return FormException;
        }

        if($(key).length == 0){
            Dev().error("没有绑定到表单");
            return null;
        }

        if(!$(key).is('form')){
            Dev().warn("虽然你使用的不是表单，但是这并没有什么关系~");
            FormException.bindForm($(key));
            return FormException;
        }
    },
    do:function (data) {
        var form = $(FormException.forms[FormException.bufferKey]);
        if(form.length == 0){
            Dev().error('未查询到表单绑定');
            return ;
        }
        form.find('[name='+data.name+"]").parent().addClass('has-'+data.state);
    }

}