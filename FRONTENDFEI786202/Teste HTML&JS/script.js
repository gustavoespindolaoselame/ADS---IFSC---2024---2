let principal = new Array(3);
principal[0] = ["volnei", "volnasso", "volnezinho", "volneizao"];
principal[1] = [1, 1, 2, 6];
principal[2] = [
    [6, 6, 6, 2],
    [5, 5, 5, 2],
    [3, 4, 7, 2],
    [6, 6, 6, 2]
];

function preencherTabela() {
    const tabela = document.getElementById('tabela');
    const thead = tabela.getElementsByTagName('thead')[0];
    const tbody = tabela.getElementsByTagName('tbody')[0];
    if (thead.innerHTML.trim() === "") {
        let cabecalhohtml = "<tr>";
        for (const nome of principal[0]) {
            cabecalhohtml += `<th>${nome}</th>`;
        }
        cabecalhohtml += "</tr>";
        thead.innerHTML = cabecalhohtml;
    }

    tbody.innerHTML = "";
    const tr = document.createElement('tr');
    let divisor = principal[1].reduce((acc, curr) => acc + curr, 0);

    let resultados = [];
    for (let i = 0; i < principal[1].length; i++) {
        let soma = 0;
        for (let j = 0; j < principal[2].length; j++) {
            soma += principal[2][j][i] * principal[1][j];
        }
        let resultado = soma / divisor;
        resultados.push({ nome: principal[0][i], resultado });
    }

    resultados.sort((a, b) => a.resultado - b.resultado);

    for (const { nome, resultado } of resultados) {
        const td = document.createElement('td');
        td.textContent =  resultado.toFixed(2);
        tr.appendChild(td);
    }

    tbody.appendChild(tr);
}

window.onload = function () {
    preencherTabela();
};
