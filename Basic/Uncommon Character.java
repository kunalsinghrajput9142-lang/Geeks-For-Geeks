class Solution{
    String uncommonChars(String s1,String s2){
        Set<Character>a=new HashSet<>(),b=new HashSet<>();
        for(char c:s1.toCharArray()) a.add(c);
        for(char c:s2.toCharArray()) b.add(c);
        StringBuilder r=new StringBuilder();
        for(char c='a';c<='z';c++)
            if(a.contains(c)^b.contains(c)) r.append(c);
        return r.toString();
    }
}
