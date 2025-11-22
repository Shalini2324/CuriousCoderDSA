 Write a program that takes an integer, then a string, then a char from the user and prints them in the screen.

import java.util.Scanner;
class program1{
    public static void main(String[] args){
        System.out.println("Enter input");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        scan.nextLine();
        String str=scan.nextLine();
        char ch=scan.next().charAt(0);
        System.out.println(num);
        System.out.println(str);
        System.out.println(ch);
    }
}
 
