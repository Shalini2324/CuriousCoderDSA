import java.util.Scanner;
class Main{
    public static void main(String[] args){
         System.out.println("Enter input");
    Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
    int b=scan.nextInt();
    int c=scan.nextInt();
    int sum=a+b+c;
    if(sum==180){
        System.out.println("Triangle can be formed");
    }
    else{
        System.out.println("Triangle cannot be formed");
    }
    }
}
