//https://www.geeksforgeeks.org/problems/sum-of-series2811/1
class Solution {
    public static int findSum(int n) {
        // code here
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }
}
//online compiler
class Main {
    public static void main(String[] args) {
        int n=2;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
        
    }
}

//another method
class Solution {
    public static int seriesSum(int n) {
        // code here
        int sum=0;
        while(n>0){
            sum=n+sum;
            n--;
        }
        return sum;
    }
}
