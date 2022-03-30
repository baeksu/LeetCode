class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        // 우선 각 row 를 for문을 돌림
        // index = 0 ~ n-1 범위에 있다면 이분탐색 후 찾으면 return true
        
        // 다음 row 의 첫번째 값보다 target 이 작으면 return false
        
        // 위에서 못찾았는데 그 다음칸 0 ~ n-1 범위에 있다면 다시 이분탐색 
        
        int m = matrix.length - 1;
        int n = matrix[0].length - 1;
        for(int i = 0 ; i<= m ; i++){
            if(matrix[i][0] <= target && target <= matrix[i][ n] ){
                //이분탐색
                if(binarySearch(matrix,i,0,n,target) == true){
                    return true;
                }   
            }    
        }
        
        return false;
    }
    
    public static boolean binarySearch(int[][] matrix,int row, int left, int right, int target){
        
        while(left <= right){
            int mid = left + (right - left)/2;
            if(matrix[row][mid] < target){
                left = mid+1;
            }else if(matrix[row][mid] > target){
                right = mid-1;
            }else{
                return true;
            }
        }
        
        return false;
    }
    
}