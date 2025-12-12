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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> temp = new ArrayList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode node = q.remove();
            if(node==null){
                long sum = 0;
                int size = temp.size();
                for(int n:temp){
                    sum += n;
                    
                }
                double average = (double)sum/size;
                ans.add(average);
                temp.clear();
                q.remove(null);
            
                if(q.isEmpty()){
                  break;
                }else{
                  q.offer(null);
                }
            }else{
                temp.add(node.val);
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
        }

        return ans;
        
    }
}