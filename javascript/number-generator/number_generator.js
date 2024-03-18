document.getElementById("btn").addEventListener("click", () => {
    let number = Number(document.getElementById("input").value);
    console.log(number);
    let i = 0;
    if (number >0 && number !==NaN) {
        while (i < number) {

            i++;
            
        }
    } else {
        let error= document.createElement("p");
        error.textContent="Please provide valid number...";
        document.appendChild(error);
    }
    
})