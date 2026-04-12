class Solution{
    public void utility(String s){
        StringBuilder r= new StringBuilder();
        for(int i=0;i<s.length();i+=2){
            r.append(s.charAt(i));
        }
        System.out.print(r.toString());
    }
}
