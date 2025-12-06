//https://www.geeksforgeeks.org/problems/special-odd-series-sum1235/1
class Solution {
    static long sumOfTheSeries(long n){
        // code here
        long sum=0;
        for(int i=1; i<=n; i++)
        {
            sum = sum + (i*i);
        }
        return sum;
    }
};

//another way
class Solution {
    static long sumOfTheSeries(long n) {
        // code here
        long x=0,sum=0;
        for(int i=1;i<=(2*n-1);i=i+2){
            x=x+i;
            sum=sum+(x);
        }
        return sum;
    }
}
