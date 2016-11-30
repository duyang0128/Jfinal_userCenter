/**
 * Created by wuhongxu on 2016/11/30 0030.
 */


var Log = {
    log: function (val) {
    },
    error: function (val) {
    },
    warn: function (val) {
    }
};

var Dev = function () {
    return Label.devMode ? console : Log;
};

var config = [
    "static/js/exception.js",
    "static/js/test.js"
];

config.map(function ( val,index) {
    document.write("<script src='" + Label.staticServePath + "/" + val + "'></script>");
});