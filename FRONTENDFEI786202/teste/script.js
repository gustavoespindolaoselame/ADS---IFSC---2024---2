let testearray = ["banana", "laranja", "adroaldo"];

window.onload = function () {
    let tbodys = document.getElementsByClassName('body');
    Array.prototype.forEach.call(tbodys, function(element) {
        // Itera sobre os elementos do array testearray
        Array.prototype.forEach.call(testearray, function(fruit) {
            // Cria um novo elemento <td> para cada item em testearray
            let td = document.createElement('td');
            // Define o conteúdo do <td> como o item atual do array testearray
            td.textContent = fruit;
            // Anexa o novo <td> ao elemento <tbody>
            element.appendChild(td);
        });
    });
};
