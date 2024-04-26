
window.onload = function() {
var nomes = ["Ana", "Carlos", "Bruna", "Juca", "Zezé", "Lulu"];
var notas = [8.3, 7.2, 9.0, 7.5, 8.2, 10.0];
let p = document.getElementById("paragrafo");
const pe = document.createElement('p');
p.appendChild(pe);

let parainverter = [1,2,3,4,5,6,7,8,9];

function maiorNota(nomes, notas){
    let maiorNota = 0;
    let melhorAluno = "nenhum";
    for(let i=0;i<nomes.length;i++){
        if(notas[i]>maiorNota){
            maiorNota=notas[i];
            melhorAluno=nomes[i];
        }
    }
    console.log(maiorNota,melhorAluno)
    pe.append(melhorAluno+maiorNota);
}

function inversor(parainverter){
    let invertido = [];

    for (i of parainverter) {
        invertido.unshift(i);
    }

    for (const numero of invertido) {
        pe.append("|" + invertido[numero]);
    }
    
}

let array1 = [1,2,3,4,5,6];
let array2 = [9,8,7,6,5,4];

function juntararrays(array1, array2){
    let array3 = new Array(array1.length+array2.length);
    for(let i = 0 ;i<=array1.length+array2.length;i++){
        if(i<array1.length){
        array3[i]= array1[i];
        } else {
            array3[i]= array2[i-array1.length];
        }
    }
    pe.append("|" + array3);
}

function unearrays(array1, array2){
    let array4 = [...array1, ...array2];
    pe.append("|" + array4);
}

maiorNota(nomes, notas);
inversor(parainverter);
juntararrays(array1,array2);
unearrays(array1,array2);
}