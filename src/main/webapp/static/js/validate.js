/**
 * Created by wuhongxu on 2016/11/30 0030.
 */

var Validate = {
    toValidate: function (data) {
        var tipHTML = '';
        for (var i = 0; i < data.length; i++) {
            if (!Validate.validate(data[i])) {
                tipHTML += data[i].msg;
                return false;
            }
        }
        return true;
    },
    validate: function (data) {
        var isValidate = true,
            val = '';
        if (data.type === 'imgSrc') {
            val = data.target.attr('src');
        } else if (data.type === 'imgStyle') {
            val = data.target.data('imageurl');
        } else if (data.type === 'num') {
            val = data.target.text().replace(/(^\s*)|(\s*$)/g, "");
        } else {
            val = data.target.val().toString().replace(/(^\s*)|(\s*$)/g, "");
        }
        switch (data.type) {
            case "email":
                if (!/^((([a-z]|\d|[!#\$%&'\*\+\-\/=\?\^_`{\|}~]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])+(\.([a-z]|\d|[!#\$%&'\*\+\-\/=\?\^_`{\|}~]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])+)*)|((\x22)((((\x20|\x09)*(\x0d\x0a))?(\x20|\x09)+)?(([\x01-\x08\x0b\x0c\x0e-\x1f\x7f]|\x21|[\x23-\x5b]|[\x5d-\x7e]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(\\([\x01-\x09\x0b\x0c\x0d-\x7f]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]))))*(((\x20|\x09)*(\x0d\x0a))?(\x20|\x09)+)?(\x22)))@((([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])*([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])))\.)+(([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])*([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])))\.?$/i.test(data.target.val())) {
                    isValidate = false;
                }
                break;
            case "password":
                if (data.target.val().length === 0 || data.target.val().length > 16) {
                    isValidate = false;
                }
                break;
            case "confirmPassword":
                if (data.target.val() !== data.original.val()) {
                    isValidate = false;
                }
                break;
            case "tags":
                var tagList = val.split(",");
                if (val === "" || tagList.length > 7) {
                    isValidate = false;
                }

                for (var i = 0; i < tagList.length; i++) {
                    if (tagList[i].replace(/(^\s*)|(\s*$)/g, "") === ""
                        || tagList[i].replace(/(^\s*)|(\s*$)/g, "").length > 50) {
                        isValidate = false;
                        break;
                    }
                }
                break;
            case "num":
                if (val === '' || val === ' ' || val.length < 1) {
                    isValidate = false;
                    break;
                }
                isValidate = true;
                break;
            case "url":
            case "imgSrc":
            case "imgStyle":
                if (val === '' || (val !== "" && (!/^\w+:\/\//.test(val) || val.length > 100))) {
                    isValidate = false;
                }
                break;
            default:
                if (val.length <= data.max && val.length >= (data.min ? data.min : 0)) {
                    isValidate = true;
                } else {
                    isValidate = false;
                }
                break;
        }
        return isValidate;
    },
    isNum: function (str) {
        var reg = new RegExp("^[0-9]*$");
        return reg.test(str);
    }
};