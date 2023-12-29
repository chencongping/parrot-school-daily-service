$("#submitDaily").click(function() {
    var formData = {
        'businessDate': $('#businessDate').val(),
        'tea': $('#tea').val(),
        'longRun': $('#longRun').val(),
        'shortRun': $('#shortRun').val(),
        'words': $('#words').val(),
        'texts': $('#texts').val(),
        'questions': $('#questions').val(),
        'praise': $('#praise').val(),
        'improvement': $('#improvement').val(),
        'other': $('#other').val()
    };
    request(
        '/daily/save',
        formData,
        function(response) {
            console.log(response);
            $('#dailyModal').modal('hide');
        },
        function(xhr, ajaxOptions, thrownError) {
            console.log(xhr.status);
            console.log(thrownError);
        })
});