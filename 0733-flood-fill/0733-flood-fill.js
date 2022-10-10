/**
 * @param {number[][]} image
 * @param {number} sr
 * @param {number} sc
 * @param {number} color
 * @return {number[][]}
 */
var floodFill = function(image, sr, sc, color) {
    if(image[sr][sc] == color) return image;
    return bfs(image,sr,sc,color);
};

const bfs = (image,sr,sc,color)=>{
    const queue = [[sr,sc]];
    const prevColor = image[sr][sc];
    image[sr][sc] = color;
    const dirs = [[0,1],[0,-1],[1,0],[-1,0]];
    
    while(queue.length > 0){
        const cur = queue.pop();
        
        for(let dir of dirs){
            let nr = cur[0] + dir[0];
            let nc = cur[1] + dir[1];
            
            if(nr <0 || nc < 0 || nr >= image.length || nc >= image[0].length)continue;
            if(image[nr][nc] != prevColor) continue;
            image[nr][nc] = color;
            queue.unshift([nr,nc]);
        }
    }
    
    return image;
}