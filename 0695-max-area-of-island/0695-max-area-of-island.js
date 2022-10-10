/**
 * @param {number[][]} grid
 * @return {number}
 */
var maxAreaOfIsland = function(grid) {
    let ans = 0;
    for(let i = 0 ; i<grid.length ; i++){
        for(let j = 0 ; j<grid[0].length ; j++){
            if(grid[i][j] == 0) continue;
            ans = Math.max(ans,dfs(grid,i,j));
        }
    }
    return ans;
};


const dirs = [[0,1],[1,0],[0,-1],[-1,0]];
const dfs = (grid,r,c)=>{
    if(r <0 || c<0 || r >= grid.length || c >= grid[0].length) return 0;
    if(grid[r][c] == 0) return 0;
    
    
    grid[r][c] = 0;
    let sum = 1;
    for(let dir of dirs){
        sum += dfs(grid,r+dir[0], c+dir[1]);
    }
    return sum;
}