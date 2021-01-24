
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isSem(root,root);
        
    }
    public boolean isSem(TreeNode root1,TreeNode root2)
    {
        if(root1==null && root2==null){return true;}
        if(root1==null && root2!=null){return false;}
        if(root2==null && root1!=null){return false;}
        
        if(root1.val==root2.val)
        {
            return (isSem(root1.left,root2.right) && isSem(root1.right,root2.left));
        }
        else{return false;}
    }
}
