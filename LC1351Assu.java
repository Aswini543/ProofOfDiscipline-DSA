class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int[] num:grid){
            for(int i=num.length-1;i>=0;i--){
                if(num[i]<0){
                    count++;
                }else{
                    break;
                }
                
                
            }
        }
        return count;
        
    }
}