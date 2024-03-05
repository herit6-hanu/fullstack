function handleClick() {
    var name = prompt("Enter your name");
    if (name !== null && name !== "") {
        var table = document.getElementsByTagName("table")[0]; // Assuming only one table
        if (!table) {
            table = document.createElement("table");
            document.body.appendChild(table);
        }
        var row = table.insertRow(); // Insert a new row
        var cell = row.insertCell(); // Insert a new cell
        cell.innerHTML = name; // Set the content of the cell to the entered name
    }
}

function clearTable() {
    var table = document.getElementsByTagName("table")[0];
    if (table) {
        table.innerHTML = ""; // Clear the content of the table
    }
}
