class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->{
            return a[0] != b[0] ? a[0] - b[0] : a[1] - b[1];
        });
        
        int a = -1;
        int b = -1;
        for(int i = 0 ; i< intervals.length ; i++){
            //init new item 
            if(a == -1 || b == -1){
                a = intervals[i][0];
                b = intervals[i][1];
            }
            
            //check duplication
            if(intervals[i][0] > b){
                //add ans
                ans.add(new int[]{a,b});
                
                //set the new item
                a = intervals[i][0];
                b = intervals[i][1];
            }else{
                if(intervals[i][1] > b) b = intervals[i][1];
            }
        }
        ans.add(new int[]{a,b});
        int[][] result = new int[ans.size()][2];
        for(int i = 0 ; i< ans.size() ; i++){
            result[i][0] = ans.get(i)[0];
            result[i][1] = ans.get(i)[1];
        }
        return result;
    }
}