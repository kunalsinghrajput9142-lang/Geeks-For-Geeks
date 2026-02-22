class Solution{
    public static void printSquare(int n){
        String row="* ".repeat(n).trim();
        for(int i=0;i<n;i++){
            System.out.println(row);
        }
    }
}