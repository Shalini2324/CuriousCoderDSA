class Solution {
    public int nthFibonacci(int n) {
        // code here
        if(n==1)
        {
            return 1;
        }
        else if(n==0)
        {
            return 0;
        }
        return nthFibonacci(n-1)+nthFibonacci(n-2);
    }
}

//online compiler
import java.util.Scanner;
class Main{

static int fibo(int n)
{
   if(n==1)
   {
       return 1;
   }
   else if(n==0)
   {
       return 0;
      
   }
   return fibo(n-1)+fibo(n-2);
}

public static void main(String[]args)
{   
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(fibo(n));
}
}
