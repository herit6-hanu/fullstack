var resbox = document.getElementById("resbox");
resbox.value = 0;
function counter(event) {
    resbox.value++;
    console.log(event);
}
function reset(event) {
    resbox.value = 0;
    console.log(event);
}
var counbox = document.getElementById("selectedcountry");
counbox.value = "--None--";
function afterSelection() {
    var selectElement = document.getElementById("countries");
    var selectedCountry = selectElement.options[selectElement.selectedIndex].text;
    counbox.value=selectedCountry;
}