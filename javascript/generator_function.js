//generator function declaration

function* generator() {
    yield 1;
    yield 2;
    yield 3;
}

console.log(generator().next().value);