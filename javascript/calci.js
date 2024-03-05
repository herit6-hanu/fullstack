function addIntegers() {
    var num1Element = document.getElementById("num1");
    var num2Element = document.getElementById("num2");
    
    // Retrieve the values from input fields
    var num1 = parseInt(num1Element.value);
    var num2 = parseInt(num2Element.value);
    
    // Check if the values are numbers
    if (isNaN(num1) || isNaN(num2)) {
        alert("Please enter valid numbers.");
        return;
    }
    
    var sum = num1 + num2;
    var resInput=document.getElementById("result");
    resInput.value=BigInt(sum);
}

