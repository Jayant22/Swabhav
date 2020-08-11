var btn = document.querySelector("#hidden");
console.log(btn);

btn.onclick = Hide(function hideParagraph() {

    var para = document.querySelector("#myDiv");

    if (para.style.display == "none") {
        para.style.display = 'block';
    } else {
        para.style.display = 'none';
    }

});
function Hide(callback){
    callback();
}
