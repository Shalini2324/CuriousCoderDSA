//https://www.geeksforgeeks.org/problems/special-series-sum0903/1
class Solution {
    static long sumOfTheSeries(long n) {
        // code here
        int sum=0,seriesTerm=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
            seriesTerm=seriesTerm+(sum);
        }
        return seriesTerm;
    }
}

//online compiler
class  SpecialSeriesSum {
    public static void main(String[] args) {
        int n=10; 
        int sum=0,seriesTerm=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
            seriesTerm=seriesTerm+(sum);
        }
        System.out.println(seriesTerm);
    }
}
