//https://www.geeksforgeeks.org/problems/print-alternate-elements-of-an-array/1
class Solution {
    // function to print alternate elements of an array
    public ArrayList<Integer> getAlternates(int arr[]) {
        // Code Here
         ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i=i+2) {
            ans.add(arr[i]);
        }
        return ans;
    }
}

//online compiler
import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // take size of array
        int n = sc.nextInt();
        int[] arr = new int[n];

        // take array input
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i=i+2){
            System.out.print(arr[i]+" ");
        }
       
    }
}

