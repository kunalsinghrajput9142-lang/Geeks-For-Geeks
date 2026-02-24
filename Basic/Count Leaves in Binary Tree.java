class Solution{
    int countLeaves(Node root){
        return(root==null)?0:
            (root.left==null && root.right==null)?1:
            countLeaves(root.left)+countLeaves(root.right);
    }
}