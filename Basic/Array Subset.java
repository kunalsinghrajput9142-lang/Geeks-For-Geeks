class Solution{
    public boolean isSubset(int[] a,int[] b){
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0,j=0;
        int n=a.length,m=b.length;
        while(i<n&&j<m)
            if(a[i++]==b[j])j++;
        return j==m;
    }
}