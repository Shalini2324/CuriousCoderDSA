//https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1
class Solution {
    public static int gcd(int a, int b) {
        // code here
        if(a ==0) return b;
        if(b== 0) return a;
        while(a!=b)
        {
            if(a>b) 
            a = a-b;
            if(b>a) 
            b = b-a;
            
        }
        return a;
    }

//in online compiler
class GCD of two number {
    public static void main(String[]args) {
        // code here
        int a=20;
        int b=28;
        if(a ==0){
            System.out.println(b);
            
        }
        if(b== 0){
            System.out.println(a);
        } 
        while(a!=b)
        {
            if(a>b) 
            a = a-b;
            if(b>a) 
            b = b-a;
            
        }
        System.out.println(a);
    }
}
