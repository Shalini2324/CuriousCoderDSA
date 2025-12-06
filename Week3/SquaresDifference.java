//https://www.geeksforgeeks.org/problems/squares-difference0939/1
class Solution {
    static long squaresDiff(int N) {
        // code here
        long sumSquares = 0; 
        long sum = 0;        

        for (int i = 1; i <= N; i++) {
            sumSquares=sumSquares+ (i * i);
            sum =sum+ i;
        }

        long squareOfSum = sum * sum;
        return Math.abs(sumSquares - squareOfSum);
    }

}//online compiler
class Main {
    public static void main(String[]args){
        int n=5;
        long sumSquares = 0; 
        long sum = 0;        

        for (int i = 1; i <= n; i++) {
            sumSquares=sumSquares+ (i * i);
            sum =sum+ i;
        }

        long squareOfSum = sum * sum;
        System.out.println(Math.abs(sumSquares - squareOfSum));
    }
    
}
