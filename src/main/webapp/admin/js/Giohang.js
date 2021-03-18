$( document ).ready(function() {
    $('.themGioHang').on('click', function() {
        let masanpham = $(this).attr('data-id');
        $('#masanpham_hidden').val(masanpham);
        $('#themVaoGioHang').submit();
    })
});