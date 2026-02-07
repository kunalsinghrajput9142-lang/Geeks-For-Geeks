class Solution{
    static boolean searchInSorted(int arr[],int k){
        int m,l=0,r=arr.length-1;
        while(l<=r){
                m=(l+r)/2;
            if (arr[m]==k)
                return true;
            if (arr[m]<k)
                l=m+1;
            else 
                r=m-1;
        }
        return false;
    }
}