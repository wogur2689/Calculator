/* 입력한 숫자 가져오기 */
function fn_number() {
    $(".box").click(function() {
        var num = $(".box").children("span").text()
        console.log(num)
    })
}
