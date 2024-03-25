"use strict"
let returnId = (id) => {
    return document.getElementById(id);
};

let classElement = (className) => {
    return document.getElementsByClassName(className);
};

var fname = returnId("fname"),
    lname = returnId("lname"),
    email = returnId("email"),
    password = returnId("pwd"),
    button = returnId("btn"),
    error = classElement("error");


button.addEventListener("click", () => {
    commonFun(fname, 0, "First Name should not be empty");
    commonFun(lname, 1, "Last Name should not be empty");
    commonFun(email, 2, "Email Address should not be empty");
    commonFun(password, 3, "Password should not be empty");
    


    let obj = {};
    obj["First Name"] = fname.value;
    obj["Last Name"] = lname.value;
    obj["Email"] = email.value;
    obj["Password"] = password.value;
    localStorage.setItem("Person Info", JSON.stringify(obj));
    console.log(JSON.parse(localStorage.getItem("Person Info")));
})

let commonFun = (element, index, errorMsg) => {
    if (element.value !== "") {
        element.style.border = "1px solid green";
        error[index].textContent = "";
    } else {
        element.style.border = "1px solid red";
        error[index].textContent = errorMsg;
        error[index].animation = "shakeAnimation 1s 1";
        throw new Error(errorMsg);
    }
    
}