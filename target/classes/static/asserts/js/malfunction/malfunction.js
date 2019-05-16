function getDetail(id) {
    $.ajax({
        url:"detail/"+id,
        method: "GET",
        success:function (result) {
            if (result.status === 200){
                var context = result.map.malfunction.context;
                $(".modal-body").html(context);
                $("#modal-default").modal("show");
            }
        }
    });
}