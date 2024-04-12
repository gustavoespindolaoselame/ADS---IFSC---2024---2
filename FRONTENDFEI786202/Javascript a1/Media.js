alert(ok);
let entrada = new Array(5);
entrada[0]=new Array(10);
entrada[1]=[1,2];
entrada[2]=new Array(10);
entrada[3]=new Array(10);
let res = new Array(10);
for(let i=0;i<entrada.length;i++){
    for(let j=0;j<entrada.length;j++){
        res[i]+=entrada[i+2][j];
    }
}