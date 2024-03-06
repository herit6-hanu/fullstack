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
function afterSelection(event) {
    var selectElement = document.getElementById("countries");
    console.log(event);
    var selectedCountry = selectElement.options[selectElement.selectedIndex].text;
    counbox.value=selectedCountry;
}

function keyDown(event) {
    console.log("you pressed ", event.key, event)
    setTimeout(() => {
        var inputText = document.getElementById("keydowninput").value;
        console.log(inputText);
    },1)
    

    
}

function mouseOver(event) {
    var division = document.getElementById("division");
    division.style.backgroundColor = "pink";
    console.log("Hovered on division",event);
}


function mouseOut(event) {
    var division = document.getElementById("division");
    division.style.backgroundColor = "green";
    console.log("Hoveredout on division",event);
}