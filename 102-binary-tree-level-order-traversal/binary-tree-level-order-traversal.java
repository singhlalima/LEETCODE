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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        List<Integer> temp = new ArrayList<>();
        while(!queue.isEmpty()){
            
            TreeNode node = queue.remove();
            
            if(node == null){
                ans.add(new ArrayList<>(temp));
                temp.clear();
                if(queue.isEmpty()) break;
                else queue.add(null);
                
            }else{
                temp.add(node.val);
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
        }

        return ans;
    }
}