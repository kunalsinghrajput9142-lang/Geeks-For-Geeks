class Solution{
    public String longest(List<String> arr){
        String res=arr.get(0);
    for(String s:arr)
    if(s.length()>res.length())res=s;
        return res;
    }
}
