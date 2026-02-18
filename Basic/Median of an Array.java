class Solution{
    double findMedian(int[] arr){
        Arrays.sort(arr);
        int n=arr.length;
        return n%2==0 
            ?(arr[n/2- 1]+arr[n/2])/2.0 
            : arr[n/2];
    }
}
