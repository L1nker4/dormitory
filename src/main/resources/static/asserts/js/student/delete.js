function deleteMutil() {
    var idArray = [];

    var _checkbox = App.getCheckbox();
    _checkbox.each(function () {
        var _id = $(this).attr("id");
        if (_id != null && _id !== "underfine" && $(this).is(":checked")) {
            idArray.push(_id);
        }
    });
    if (idArray.length === 0){
        $("#modal-default").modal("show");
    }
    var data = idArray.join(",");
    $.ajax({
        url:"/student/deleteMutil/",
        data: {"ids" : idArray.toString()},
        dataType: "JSON",
        type:"POST",
        success: function (result) {
            console.log("删除成功");
            alert(result.message);
            window.location.reload();
        }
    });
    console.log(idArray);
}

function deleteOne(id) {
    $.ajax({
        url: "/student/delete/"+id,
        type: "POST",
        success: function (result) {
            console.log("删除成功");
            alert(result.message);
            window.location.reload();
        }
    });
}
