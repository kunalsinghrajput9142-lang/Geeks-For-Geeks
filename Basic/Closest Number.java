class Solution{
    static int closestNumber(int n,int m){
        int a=(n/m)*m;
        int b=a+(n*m>0?m:-m);
        return Math.abs(n-a)<Math.abs(n-b)?a:
               Math.abs(n-a)>Math.abs(n-b)?b:
               (Math.abs(a)>Math.abs(b)?a:b);
    }
}
