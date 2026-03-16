class Solution{
    public boolean isPalinArray(int[] arr){
        for(int n:arr){
            String s=n+"";
            if (!s.equals(new StringBuilder(s).reverse().toString()))
                return false;
        }
        return true;
    }
}