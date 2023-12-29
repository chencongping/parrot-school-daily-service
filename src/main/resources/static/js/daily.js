$("#submit").click(function() {
    var formData = {
        'businessDate': $('#date').val(),
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
        },
        function(xhr, ajaxOptions, thrownError) {
            console.log(xhr.status);
            console.log(thrownError);
        })
});