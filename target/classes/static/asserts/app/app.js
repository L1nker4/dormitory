var App = function () {
    var _masterCheckbox;
    var _checkbox;

    /**
     * 初始化ICkeck
     */
    var handlerInitCheckbox = function () {
        //激活
        $('input[type="checkbox"].minimal, input[type="radio"].minimal').iCheck({
            checkboxClass: 'icheckbox_minimal-blue',
            radioClass   : 'iradio_minimal-blue'
        });

        _masterCheckbox = $('input[type="checkbox"].minimal.icheck_master');
        _checkbox = $('input[type="checkbox"].minimal');
    };

    //多选框的实现
    var handlerCheckboxAll = function () {
        _masterCheckbox.on("ifClicked",function (e) {
            if (e.target.checked){
                _checkbox.iCheck("uncheck");
            }else {
                _checkbox.iCheck("check");
            }
        })
    };

    //删除单个
    var handlerdeleteOne = function (obj) {

    };


    return {
        init: function () {
            handlerInitCheckbox();
            handlerCheckboxAll();
        },

        getCheckbox: function () {
            return _checkbox;
        }
    }
}();

$(document).ready(function () {
    App.init();
});