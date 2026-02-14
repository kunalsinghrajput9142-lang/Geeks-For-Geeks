class Solution{
    int sumExceptFirstLast(int[] arr){
        int sum=0,n=arr.length;
        for(int i=1;i<n-1;i++){
            sum+=arr[i];
        }
        return sum;
    }
}