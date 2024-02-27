var arr = [1,1,1,1,1];

var res = arr.reduce((prev, curr,index) => {
    //console.log(prev,curr,index);
    return prev + curr;
}, 1)

console.log(res);

var arr2 = [1, 2, 3, 4, 5];
//if we dont give any accumulator then it consider the first element as the accumulator and the second element as the current
var res2 = arr2.reduce((prev, curr) => prev + curr, 1);

console.log(res2);