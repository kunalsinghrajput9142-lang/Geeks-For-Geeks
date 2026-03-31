import java.util.*;

class Solution {
    public int doubleNum(String num) {
        return Integer.parseInt(num) * 2;
    }
}

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        
        Solution obj = new Solution();
        System.out.println(obj.doubleNum(num));
    }
}