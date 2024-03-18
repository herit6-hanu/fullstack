document.getElementById("btn").addEventListener("click", () => {
    console.log("clicked");
    let number = Number(document.getElementById("input").value);
    let i = 0;
    if (number !== NaN || number !== "" || number !== undefined) {
        while (i < number) {
        
        }
    } else {
        console.log(number);
        document.getElementById("results").textContent="Please provide valid number..."
    }
    
})