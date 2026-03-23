class Solution {
    public int binarySubstring(String s) {
        int count=0;
        for(char c:s.toCharArray())
            if(c=='1')count++;
        return count*(count - 1)/2;
    }
}
