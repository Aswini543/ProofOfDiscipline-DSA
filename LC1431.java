class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int e) {
        int m = 0;
        for(int i : candies){
            m = Math.max(m,i);
        }
        List<Boolean> r = new ArrayList<>();
        for(int i : candies){
            r.add((i+e)>=m);
        } 
        return r;
    }
}