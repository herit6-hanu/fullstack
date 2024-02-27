// for each method
"use strict"
var arr = [34325, 245, 23434, 34, 324,"rewrt"];

arr.forEach((el,index) => {
    console.log(el);
});

var res=arr.map((el) => {
    return el+5
})
console.log(res);

var arr2 = [342432, 43, 4324, 4, 25, 3, 4];

var res2 = arr2.reduce((prev, curr) => {
    return prev + curr;
}, 1)

console.log(res2);

var asortedArray = arr2.sort((a, b) => {
    return a - b;
});
console.log(asortedArray);

var dsortedArray = arr2.sort((a, b) => {
    return b - a;
});
console.log(dsortedArray);
// console.log(arr2);
var res3 = arr2.filter((el) => {
    return el > 453;
});


console.log(res3);