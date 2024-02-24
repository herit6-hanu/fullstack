var student={
    name:"pedha gorre",
    price:25000,
    age:24,
    dept:"bachelor of technology",
}

var {name,price,...restInfo}=student;

console.log(name ,price);
console.log(restInfo);

var company={
    comName:"cigniti",
    noEmp:25000,
    branches:25,
    hydInfo:{
        location:"madhapur",
        noEmp:2400,
        hod:"raghu krovireddy"
    }
}

//in object destructing the variable should be same as the key value otherwise it wont work

var { comName ,noEmp, branches,hydInfo}=company;

var {location,noEmp,hod}=hydInfo;
console.log("==================================");
console.log(comName ,noEmp, branches,hydInfo);

console.log(location,noEmp,hod);