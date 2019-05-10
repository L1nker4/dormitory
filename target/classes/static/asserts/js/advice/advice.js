function openDetail(aid) {
    $.ajax({
        url: "/advice/detail/"+aid,
        type: "POST",
        success:function (data) {
            var detailAdvice = data.map.detail.context;
            $('#detailContext').html(detailAdvice);
            console.log(detailAdvice);
            $('#modal-default').modal({
                show:true
            });
        }
    });


}