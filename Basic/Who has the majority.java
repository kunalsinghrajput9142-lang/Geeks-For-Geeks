class Solution{
    public int moreFrequent(List<Integer>arr,int x,int y){
        int countX=0,countY=0;
        for(int num:arr){
            if (num==x)
                countX++;
            if (num==y)
                countY++;
        }
        if(countX>countY)
            return x;
        if(countY>countX)
            return y;
        return Math.min(x, y);
    }
}
