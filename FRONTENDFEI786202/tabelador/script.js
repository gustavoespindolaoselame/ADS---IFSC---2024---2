window.onload = function() {
    const button = document.getElementById('myButton');
    const button2 = document.getElementById('myButton2');
    const input1 = document.getElementById('myInput');
    const input2 = document.getElementById('myInput2');
    const input3 = document.getElementById('myInput3');
    const tbodys = document.getElementsByClassName('body');
    const tbodys2 = document.getElementsByClassName('body2');

    const testArray = [];

    function handleClick() {
        const inputValue1 = input1.value;
        const inputValue2 = input2.value;
        const inputValue3 = input3.value;
        Array.from(tbodys).forEach(tbody => {
            tbody.innerHTML = '';

            for (let i = 0; i < inputValue1; i++) {
                const tr = document.createElement('tr');
                for (let j = 0; j < inputValue2; j++) {
                    const td = document.createElement('td');
                    td.textContent = testArray[i*inputValue2+j];
                    tr.appendChild(td);
                }
                tbody.appendChild(tr);
            }
        });
    }

    function handleClick2() {
        const inputValue3 = input3.value;
        testArray.push(inputValue3);
        Array.from(tbodys2).forEach(tbody => {
            tbody.innerHTML = '';
            document.createElement('tr');
            for (let i = 0; i < testArray.length; i++) {
                const tar = document.createElement('td');
                tar.textContent=testArray[i];
                tbody.appendChild(tar);
            }
        });

    }

    button.addEventListener('click', handleClick);
    button2.addEventListener('click', handleClick2);
};
