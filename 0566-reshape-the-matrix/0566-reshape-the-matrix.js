/**
 * @param {number[][]} mat
 * @param {number} r
 * @param {number} c
 * @return {number[][]}
 */
var matrixReshape = function(mat, r, c) {
    if( mat.length*mat[0].length != r*c) return mat;
    const ans = new Array(r).fill(0).map(()=>new Array(c).fill(0));
    
    for(let idx = 0 ; idx < r*c ; idx++){
        ans[Math.floor(idx/c)][idx%c] = mat[Math.floor(idx/mat[0].length)][idx%mat[0].length];
    }
    return ans;
    

};