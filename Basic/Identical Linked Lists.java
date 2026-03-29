class Solution{
    public boolean areIdentical(Node a,Node b){
        for(;a!=null&&b!=null;a=a.next,b=b.next)
            if (a.data!=b.data)return false;
        return a==null&&b==null;
    }
}
