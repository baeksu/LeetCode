class Solution {
    public void setZeroes(int[][] matrix) {
        
        Map<Integer,Integer> mapRow = new HashMap<>();
        Map<Integer,Integer> mapCol = new HashMap<>();
        
        for(int i = 0 ; i< matrix.length ; i++){
            for(int j = 0 ; j< matrix[0].length ; j++){
                if(matrix[i][j] == 0){
                    // save i,j in the hashmap
                    
                    mapRow.put(i,1);
                    mapCol.put(j,1);
                }
            }
        }
        
        for(int i = 0 ; i< matrix.length ; i++){
            for(int j = 0 ; j< matrix[0].length ; j++){
                if(mapRow.containsKey(i) || mapCol.containsKey(j)){
                    matrix[i][j] = 0;
                }
            }
        }
        
        
    }
}