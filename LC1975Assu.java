class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum=0;
        int min=Integer.MAX_VALUE;
        int count=0;
        for(int[] num:matrix){
            for(int n:num){
                sum=sum+Math.abs(n);
                if(n<0) count++;
                min=Math.min(min,Math.abs(n));
            }

        }
        if(count%2!=0) sum-=2L*min;
        return sum;
    }
}