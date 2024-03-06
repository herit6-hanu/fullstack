document.getElementById("gen").addEventListener("click", () => {
    var exist = document.getElementsByTagName("p")[1];
    if (exist == undefined) {
        var exist=document.createElement("p");
        document.body.append(exist);
    }
    
    exist.textContent = Math.floor(Math.random() * 10 + 1);
})

document.getElementById("languages").addEventListener("change", () => {
    var selectedLanguage = document.getElementById("languages").options[document.getElementById("languages").selectedIndex].text;
    document.getElementById("reslanguage").value = selectedLanguage;
})

document.getElementById("textarea").addEventListener("keydown", (event) => {
    setTimeout(() => console.log("you pressed ",event.key),10)
})

document.getElementById("division").addEventListener("mouseover", () => document.getElementById("division").style.backgroundColor = "purple");

document.getElementById("division").addEventListener("mouseout", (event) => { document.getElementById("division").style.backgroundColor = "black"; console.log(event) });