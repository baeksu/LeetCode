class Solution {
    public int[] replaceElements(int[] arr) {
        int max = arr[arr.length - 1];
        arr[arr.length - 1] = -1;
        
        for(int i = arr.length-2 ; i >= 0 ; i--){
            
            if(max < arr[i]){         
                int tmp = arr[i];
                arr[i] = max;
                max = tmp;
            }else{
                arr[i] = max;
            }
            
        }
        
        return arr;
    }
}