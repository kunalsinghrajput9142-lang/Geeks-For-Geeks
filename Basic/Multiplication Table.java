import java.util.*;
class Solution{
    public ArrayList<Integer>getTable(int n){
        ArrayList<Integer>list=new ArrayList<>();
        for (int i=1;i<=10;i++)
            list.add(n*i);
        return list;
    }
}
