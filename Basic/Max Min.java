class Solution{
    public static int findSum(int A[],int N){
        int n=A.length;
        Arrays.sort(A);
        int min=A[0];
        int max=A[n-1];
        return min+max;
    }
}
