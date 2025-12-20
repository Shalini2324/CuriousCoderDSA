class Solution {
    public int findKRotation(int arr[]) {
     for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return i + 1;
            }
        }
        return 0;
        
    }
}

online compiler
import java.util.*;

class Main {
    public int findKRotation(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return i + 1;
            }
        }
        return 0;
    }


public static void main(String[] args) {

        int[] arr = {6, 9, 2, 4};   // you can change input here

        Main obj = new Main();
        int result = obj.findKRotation(arr);

        System.out.println(result);
    }
}

