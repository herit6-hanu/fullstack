document.getElementById("btn").addEventListener("click", () => {
    let number = Number(document.getElementById("input").value);
    let resultBody = document.getElementsByClassName("result-body")[0];

    clearChildElements(resultBody);
    let errorParagraph = document.getElementsByTagName("p")[0];
    errorParagraph.textContent="";
    let i = 0;
    if (number >0 && number !==NaN) {
        while (i < number) {
            i++;
            let resultBlock = document.createElement("div");
            resultBlock.className = "results";
            resultBlock.id = "results";
            resultBlock.textContent = i;
            resultBody.appendChild(resultBlock);   
        }
    } else {
        
        errorParagraph.textContent = "Oops...Invalid, Please enter valid number.";
        errorParagraph.style.color = "red";
        errorParagraph.style.animation="vibrate 0.2s 1";
    }
})

function clearChildElements(parentElement){
    while (parentElement.firstChild) {
        parentElement.removeChild(parentElement.firstChild);
    }
}