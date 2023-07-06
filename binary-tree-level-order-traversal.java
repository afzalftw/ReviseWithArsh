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
//https://leetcode.com/problems/binary-tree-level-order-traversal/
class Solution {
    static List<List<Integer>> ans;
    static Queue<TreeNode> q;
    static void bfs(TreeNode root){
        q.add(root);
        int i=1;
        int j=1;
        while(!q.isEmpty()){
            List<Integer> t=new ArrayList<>();
            i=j;
            j=0;
            while(i-->0){
                TreeNode temp=q.poll();
                t.add(temp.val);
                if(temp.left!=null){
                    j++;
                    q.add(temp.left);
                } 
                if(temp.right!=null){
                    j++;
                    q.add(temp.right);
                }
            }
            ans.add(new ArrayList<>(t));
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        q=new LinkedList<>();
        ans=new ArrayList<>();
        if(root==null) return ans;
        bfs(root);
        return ans;
    }
}
