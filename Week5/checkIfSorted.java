https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1

class Solution {
    public boolean arraySortedOrNot(int[] arr) {
        // code here
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}

//online compiler
class Main{
    public static boolean isSorted(int[] arr) {
        // code here
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
public static void main(String[] args){
    int[] arr={10,20,30,40,50};
    
    boolean result=Main.isSorted(arr);
        System.out.println(result);
  }
}
