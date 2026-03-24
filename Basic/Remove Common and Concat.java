class Solution{
    public String concatenatedString(String s1,String s2){
        String res="";
        for(char c:s1.toCharArray())
            if(s2.indexOf(c)== -1)res+=c;
        for(char c:s2.toCharArray())
            if(s1.indexOf(c)== -1)res+=c;
        return res.isEmpty()?"-1":res;
    }
}
