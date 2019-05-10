function getDetail(nid) {
    $.ajax({
        url:"/notification/detail/"+nid,
        type: "POST",
        success:function (data) {
            var detail = data.map.detail.context;
            $("#detailNotifaction").html(detail);
            $("#modal-default").modal("show");
        }

    });

}

function deleteOne(nid) {
    $.ajax({
        url:"/notification/delete/"+nid,
        type:"POST",
        success:function (res) {
            console.log(res);
            if (res.status === 200){
                alert(res.message);
                window.location.reload();
            }else {
                alert(res.message);
            }
        }
    });
}