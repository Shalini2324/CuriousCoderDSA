import java.util.Scanner;
class Main{

static int countzero(int n)
{
    if(n%10==n){
        System.out.println(n);
        if(n%10==0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    System.out.println(n);
    if(n%10==0)
    {
        return 1+countzero(n/10);
    }
    else{
        return countzero(n/10);
    }
   
}

public static void main(String[]args)
{   
    System.out.println(countzero(203009));
    
}
}
