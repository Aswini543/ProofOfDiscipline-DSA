/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int cur_level=1;
        int level=1;
        int Max=Integer.MIN_VALUE;

        while(!q.isEmpty()){
            int sum=0;
            int s=q.size();
            for(int i=0;i<s;i++){
            TreeNode n=q.poll();
            if(n.left!=null) q.add(n.left);
            if(n.right!=null) q.add(n.right);
            sum+=n.val;
            }
            if(sum>Max){
            Max=sum;
            cur_level=level;
        }
            level++;

        }
        

        return cur_level;


    }
    }