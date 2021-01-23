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
   
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer>a=new ArrayList<>();
        if(root==null){return a;}
        Stack<TreeNode>s= new Stack<>();
        TreeNode curr=root;
        while(curr!=null ||  s.isEmpty()==false)
        {
            while(curr!=null)
            {
                s.push(curr); curr=curr.left;
            }
            curr=s.pop();
            a.add(curr.val);
            curr=curr.right;
            
        }
        return a;
        

   
}}
