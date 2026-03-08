class Solution{
    static ArrayList<Integer>preOrder(Node root){
        ArrayList<Integer>r=new ArrayList<>();
        if(root==null) return r;
        r.add(root.data);
        r.addAll(preOrder(root.left));
        r.addAll(preOrder(root.right));
        return r;
    }
}
