//https://www.geeksforgeeks.org/problems/middle-of-three2926/1
class Solution {
    int middle(int A, int B, int C) {
        // code here
        if (A>B && A>C){
            return B>C ? B:C;
        }
        else if (B>A && B>C){
            return A>C ? A:C;
        }
        else{
             return A>B ? A:B;
        }
    }
}

//online compiler
 class Middle of Three {
     public static void main(String[]args){
         int A=978, B=518, C=300;
         int middle;
          if (A>B && A>C){
            middle= B>C ? B:C;
        }
        else if (B>A && B>C){
            middle= A>C ? A:C;
        }
        else{
             middle= A>B ? A:B;
        }
        System.out.println(middle);
         
     } 
}
