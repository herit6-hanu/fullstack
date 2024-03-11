var buttons = [...document.getElementsByTagName("button")];
console.log(buttons);
var num1;
var num2;
buttons.forEach((el,index) => {
    el.addEventListener("click", ()=>{
        num1 = el.textContent;
        document.getElementById("input").value += num1;
    });
});