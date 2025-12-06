//https://www.geeksforgeeks.org/problems/find-n-th-term-of-series-1-3-6-10-15-215506/1
class Solution {
    static int findNthTerm(int n) {
        // code here
        int sum=0;
        for(int i=1;i<=n;i++){
            sum = sum+i;
        }
        return sum;
    }
};

//online compiler
class Main {
    public static void main(String[] args) {
        int n=4; 
        int sum=0;
        for(int i=1;i<=n;i++){
            sum = sum+ i;
        }
        System.out.println(sum);
    }
}
