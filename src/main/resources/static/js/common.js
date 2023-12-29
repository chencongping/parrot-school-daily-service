
var today = new Date();
var year = today.getFullYear();
var month = today.getMonth() + 1;
var day = today.getDate();
var formattedDate = year + "-" + (month < 10 ? "0" + month : month) + "-" + (day < 10 ? "0" + day : day);
$("#businessDate").val(formattedDate)

function request(url, formData, success, error){
    $.ajax({
        type: 'POST',
        url: url,
        data: JSON.stringify(formData),
        contentType: 'application/json',
        success: success,
        error: error
    });
}