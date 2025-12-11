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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> q= new LinkedList<>();
        List<Integer> temp = new ArrayList<>();
        int flag = 0;
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode node = q.remove();
            if(node == null) {
                if (flag ==0 ){ ans.add(new ArrayList<>(temp)); flag = 1;temp.clear();}
                else {Collections.reverse(temp);ans.add(new ArrayList<>(temp)); flag =0;temp.clear();}
                
                q.remove(null);
                if(q.isEmpty()) break;
                else q.add(null);
            }else{
                temp.add(node.val);
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);

            }
            
        }

        return ans;
        
    }
}