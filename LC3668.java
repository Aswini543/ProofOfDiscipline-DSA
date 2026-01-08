class Solution {
    public int[] recoverOrder(int[] order, int[] f) {
        List<Integer> l = new ArrayList<>();
        int[] r = new int[f.length];
        for(int i : f){
            l.add(i);
        }
        int j = 0;
        for(int i = 0;i<order.length;i++){
            if(l.contains(order[i])) r[j++] = order[i];
        }
        return r;
    }
}