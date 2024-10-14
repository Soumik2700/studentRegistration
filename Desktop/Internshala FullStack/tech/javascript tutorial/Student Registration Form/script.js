
const studentName = document.querySelector("#name");
const studentId = document.querySelector(".ID");
const studentClass = document.querySelector(".class");
const studentRoll = document.querySelector(".roll");

const addButton = document.querySelector(".addButton");
const studentTable = document.querySelector(".studentTable");
const inputValues = [];

// Function to add a new student row
addButton.addEventListener("click", addRow);

function addRow() {
    const inputs = {
        name: studentName.value.trim(),
        id: studentId.value.trim(),
        class: studentClass.value.trim(),
        roll: studentRoll.value.trim()
    };

    // Validate if any field is empty
    if (!inputs.name || !inputs.id || !inputs.class || !inputs.roll) {
        alert("Please fill in all fields.");
        return;
    }


    if (inputValues.some(student => student.id === inputs.id || student.roll === inputs.roll)) {
        alert("A student with this ID or Roll No already exists.");
        return;
    }

    inputValues.push(inputs);

    const tableRow = document.createElement("tr");
    tableRow.classList.add("addedRow");

    Object.values(inputs).forEach(value => {
        const tableData = document.createElement("td");
        tableData.textContent = value;
        tableRow.appendChild(tableData);
    });

    // Add Edit and Delete buttons
    const editButton = document.createElement("button");
    editButton.classList.add("editButton");
    editButton.innerHTML = `<svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke="currentColor" width="24" height="24">
                                <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                    d="M11 4H6a2 2 0 00-2 2v12a2 2 0 002 2h12a2 2 0 002-2v-5m-6-4l5-5m0 0l-5-5m5 5L9.5 16.5" />
                            </svg>`;

    const deleteButton = document.createElement("button");
    deleteButton.classList.add("deleteButton");
    deleteButton.innerHTML = `<svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke="currentColor" width="24" height="24">
                                <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                    d="M6 18L18 6M6 6l12 12" />
                            </svg>`;

    const tableDataEdit = document.createElement("td");
    const tableDataDelete = document.createElement("td");

    tableDataEdit.appendChild(editButton);
    tableDataDelete.appendChild(deleteButton);

    tableRow.appendChild(tableDataEdit);
    tableRow.appendChild(tableDataDelete);

    studentTable.appendChild(tableRow);

    //clear the form inputs
    studentName.value = '';
    studentId.value = '';
    studentClass.value = '';
    studentRoll.value = '';

    // Delete functionality
    deleteButton.addEventListener("click", () => {
        tableRow.remove();

        const index = inputValues.findIndex(student => student.id === inputs.id);
        if (index > -1) {
            inputValues.splice(index, 1);
        }
    });

}
