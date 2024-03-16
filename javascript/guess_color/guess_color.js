const colors = ["tomato", "orange", "blue", "black", "grey", "white", "violet", "purple", "dodgerblue","green"];
let randomNumber = () => {
    return Math.floor(Math.random() * colors.length);
};
localStorage.setItem("color", "black");
document.getElementById("btn1").addEventListener("click", () => {
    let pickedColor = colors[randomNumber()];
    document.getElementById("box").style.backgroundColor = pickedColor;
    localStorage.setItem("color",pickedColor);
});

document.getElementById("btn2").addEventListener("click", () => {
    let pickedColor = localStorage.getItem("color");
    var result = document.getElementById("input-box").value;
    if (equalsIgnoreCase(result,pickedColor)) {
        document.getElementsByClassName("result-text")[0].textContent = "Correct!";
    } else {
        document.getElementsByClassName("result-text")[0].textContent = "Try Again...";
    }
});

let equalsIgnoreCase = (str1, str2) => {
    return str1.toLowerCase() == str2.toLowerCase();
};
