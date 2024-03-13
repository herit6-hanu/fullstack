var colors = ["red", "green", "orange", "white", "blue", "black", "pink", "grey", "yellow"];
var len = colors.length;
var randomNumber = () => {
    return Math.floor(Math.random() * len);
}
document.getElementById("btn").addEventListener("click", () => {
    let color = colors[randomNumber()];
    document.getElementsByTagName("span")[0].textContent = color;
    document.getElementsByTagName("h1")[0].style.color = color;
    document.body.style.backgroundColor = color;
});