Write a program to take x and print multiples of x till 1000.

import java.util.Scanner;
class program6{
    public static void main(String[] args){
        System.out.println("Enter input");
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        for(int i=1;i*x<=1000;i++){
            System.out.println(i*x);
        }
    }
}
