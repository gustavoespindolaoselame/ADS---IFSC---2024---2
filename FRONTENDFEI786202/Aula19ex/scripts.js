
window.onload = function () {
    let p = document.getElementById("paragrafo");
    const pe = document.createElement('p');
    p.appendChild(pe);

    var array1 = [25, 25, 25, 5, 5, 5, 5, 5];
    var array2 = [2, 4, 6, 8];
    var array3 = [2, 4, 6, 3, 5, 7, 1, 3, 5];
    var array4 = [4, 6, 3, 5, 7, 1, 3, 5, 2];
    var array5 = [6, 3, 5, 7, 1, 3, 5, 2, 4];
    var array6 = [3, 5, 7, 1, 3, 5, 2, 4, 6];
    var array7 = [5, 7, 1, 3, 5, 2, 4, 6, 3];


    function somadoselementos(array1) {
        var soma = 0;
        for (const iterator of array1) {
            soma += iterator;
        }
        pe.append("|1:" + soma);
    }

    function mediadoselementos(array2) {
        var soma = 0;
        for (const iterator of array2) {
            soma += iterator;
        }
        pe.append("|2:" + soma / array2.length);
    }

    function menordoselementos(array3) {
        var menor = 999999999999999999999999999999999999999999999;
        for (const iterator of array3) {
            if (menor > iterator) {
                menor = iterator;
            }
        }
        pe.append("|3:" + menor);
    }

    function segundomaiordoselementos(array4) {
        var maiores = [0, 0];
        for (const iterator of array4) {
            if (maiores[0] < iterator) {
                maiores[1] = maiores[0];
                maiores[0] = iterator;
            }
        }
        pe.append("|4:" + maiores);
    }

    function contagemdeelementosimpares(array5) {
        var impares = 0;
        for (const iterator of array5) {
            if (iterator%2!=0) {
                impares++;
            }
        }
        pe.append("|5:" + impares);
    }

    function frequenciadeumnumero(array6) {
        var numero = 4;
        var freq = 0;
        for (const iterator of array6) {
            if (iterator==numero) {
                freq++;
            }
        }
        pe.append("|6:" + freq);
    }

    function inversaodearray(array7) {
        var array71 = new Array(array7.length);
        for (let i = 0; i<array7.length; i++) {
            array71[array7.length-i]=array7[i];
        }
        pe.append("|7:" + array71);
    }

    somadoselementos(array1);
    mediadoselementos(array2);
    menordoselementos(array3);
    segundomaiordoselementos(array4);
    contagemdeelementosimpares(array5);
    frequenciadeumnumero(array6);
    inversaodearray(array7);





















}