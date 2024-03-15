var map = function(arr, fn) {
    return arr.map(fn);
};
arr = [3, 34, 343];
function fn(n) {
    return n + 1;
}
console.log(map(arr,fn));