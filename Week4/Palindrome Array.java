
class Solution {
    public static boolean isPerfect(int[] arr) {
        // code here
        int n = arr.length;

        for(int i = 0; i < n / 2; i++) {
            if(arr[i] != arr[n - 1 - i]) {
                return false;
            }
        }
        return true;
        
    }
}

//online compiler
import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;

        boolean flag = true;

        for(int i = 0; i < n / 2; i++) {
            if(arr[i] != arr[n - 1 - i]) {
                flag = false;
                break;
            }
        }

        System.out.println(flag);
    }
}
