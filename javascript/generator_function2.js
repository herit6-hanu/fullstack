//well usage of generator function

function* gen() {
    yield 1;
    yield 2;
    yield 3;
    // for (let i = 0; i < 200; i++) {
    //     yield i;
    // }
}

// var res = gen();
// console.log(typeof res);
// console.log(res.length);
// console.log(gen().next().done?"abort":gen().next());
// console.log(gen().next());
var { value, done } = gen();
for (let data of gen()) {
    console.log(data);
};