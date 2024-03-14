var createCounter = function (init) {
    var res = init;
    return {
        increment: () => {
            return ++init;
        },
        decrement: () => {
            //var init = res;
            return --init;
        },
        reset: () => {
            init = res;
            return init;
        }
    }
};

const counter = createCounter(0);
console.log(counter.increment());// 1
console.log(counter.increment()); // 2
console.log(counter.decrement()); // 1
console.log(counter.reset()); // 0
console.log(counter.reset()); // 0
