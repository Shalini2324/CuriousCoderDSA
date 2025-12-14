class Solution {
    public void printNos(int n) {
        // Code here
        if(n==0)
        {
            return;
        }
       printNos(n-1);
       System.out.print(n+" ");
    }
}

//online compiler
import java.util.Scanner;
class Main{

static void reversen(int n)
{
   if(n==0)
   {
       return;
   }
   else
   {
       System.out.print(n+" ");
       reversen(n-1);
      
   }
}

public static void main(String[]args)
{   
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    reversen(n);
}
}
