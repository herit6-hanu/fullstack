//usage of map

// map function creates new array with values

var arr = [4, 24532, null, 3452, 45, 2343, 5, 32, "fggfdgd", false];

var res=arr.map((el) => {
    return el * 5+1;
});

console.log(res);