class Solution {
    public int distributeCandies(int[] candyType) {
        int sug=(candyType.length)/2;
        HashSet<Integer> set= new HashSet<>();


        for(int n:candyType){
            if(!set.contains(n)){
                set.add(n);
                if(set.size()==sug){
                    break;
                }
            }
        }

        return set.size();

    }
}