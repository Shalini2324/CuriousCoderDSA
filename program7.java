Write a program to get firstName and lastName and n as input and print fullName that is firstName+lastName for n times.

import java.util.Scanner;
class program7{
    public static void main(String[] args){
        System.out.println("Enter input");
        Scanner scan=new Scanner(System.in);
        String firstname=scan.nextLine();
        String lastname=scan.nextLine();
        int n = scan.nextInt();
        String fullname=firstname+lastname;
        for(int i=0;i<n;i++){
            System.out.println(fullname);
        }
    }
}
