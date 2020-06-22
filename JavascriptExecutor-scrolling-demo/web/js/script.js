document.addEventListener("DOMContentLoaded", function(event) {
    var myElement = document.getElementById("inject");
    var text = "Lorem Ipsum ";

    for (var i = 0; i < 4000; i++) {
        myElement.innerHTML += text;
    }
});
