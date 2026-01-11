class Solution {
    public int finalValueAfterOperations(String[] o) {
        int s = 0;
        for(String i : o){
            if(i.indexOf('+') != -1 || i.indexOf('+') != -1) s++;
            else s--;
        }
        return s;
    }
}