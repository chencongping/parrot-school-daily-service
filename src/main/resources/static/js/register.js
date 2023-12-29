$("#submit").click(function() {
    var formData = {
        'userName': $('#userName').val(),
        'nickName': $('#nickName').val(),
        'email': $('#email').val()
    };
    request(
        '/user/register',
        formData,
        function(response) {
            console.log(response);
        },
        function(xhr, ajaxOptions, thrownError) {
            console.log(xhr.status);
            console.log(thrownError);
        })
});