function getDetail(eid) {
    $.ajax({
        url: "detail/"+eid,
        method: "GET",
        success:function (result) {
            if (result.status === 200){
                var context = result.map.event.context;
                $(".modal-body").html(context);
                $("#modal-default").modal("show");
            }
        }
    });
}