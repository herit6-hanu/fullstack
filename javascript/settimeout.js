setTimeout(() => console.log("hello world..."), 3000);

let objInterval = setInterval(() => console.log("hello world..."), 3000);

setTimeout(()=>clearInterval(objInterval),9000)