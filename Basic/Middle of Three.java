class Solution{
    int middle(int a,int b,int c){
        return a+b+c-Math.max(a,Math.max(b,c))-Math.min(a,Math.min(b,c));
    }
}
