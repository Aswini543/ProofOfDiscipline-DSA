class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] a : accounts){
            int s = 0;
            for(int i = 0;i<a.length;i++){
                s+=a[i];
            }
            max = Math.max(max,s);
        }
        return max;
    }
}