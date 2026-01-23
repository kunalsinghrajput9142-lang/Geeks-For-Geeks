class Solution{
    public ArrayList<Integer>getMinMax(int[] arr){
        ArrayList<Integer>element=new ArrayList<>();
        int n=arr.length;
        Arrays.sort(arr);
        element.add(arr[0]);       
        element.add(arr[n- 1]);    
        return element;
    }
}
