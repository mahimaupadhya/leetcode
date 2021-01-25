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
        List<List<Integer>>l= new ArrayList<>();
        if(root==null){return l;}
        Queue<TreeNode> k= new LinkedList<>();
        k.add(root);
        while(k.isEmpty()==false)
        {
            int len=k.size();
            List<Integer>l1= new ArrayList<>();
            for(int i=0;i<len;i++)
            {
                TreeNode p=k.poll();
                l1.add(p.val);
                if(p.left!=null){k.add(p.left);}
                if(p.right!=null){k.add(p.right);}
            }
            l.add(l1);
        }
        return l;
        
    }
}
