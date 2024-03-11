var arr = [2, 3, 6, 2, 4, 2];

arr.forEach((el,ind) => {
    console.log(`${el} , ${ind}`)
});



var resArr = arr.map((el) => {
    return el * 1;
});

console.log(resArr);

var resArr = arr.sort((a, b) => {
    return a - b;
});

console.log(resArr);

var res = arr.reduce((accu, curr) => {
    return accu + curr;
});

console.log(res);

