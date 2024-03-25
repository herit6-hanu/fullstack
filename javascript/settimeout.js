setTimeout(() => console.log("hello world..."), 3000);

let objInterval = setInterval(() => console.log("hello world..."), 3000);

setTimeout(() => clearInterval(objInterval), 9000);

let nameInterval = setInterval(() => {
    console.log("Hanumantha Reddy");
}, 2000);

setTimeout(() => {
    clearInterval(nameInterval);
}, 10000);