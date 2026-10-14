class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum>9*num)
        return "";
        int x=sum/9;
        int y=sum%9;
        return("9".repeat(x)+y+"0".repeat(num)).substring(0,num);
    }
}