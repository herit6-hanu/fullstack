try {
    throw new Error("This is the error in exception handling");
} catch {
    console.log("Handling the exception");
} finally {
    console.log("Exception code has been completed");
}
