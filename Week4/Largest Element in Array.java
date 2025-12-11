//https://www.geeksforgeeks.org/problems/largest-element-in-array4009/1
class Solution {
    public static int largest(int[] arr) {
        // code here
        int large=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(large<arr[i]){
                large=arr[i];
            }
        }
        return large;
        
    }
}

//online compiler
class Largest Element in Array {
    public static void main(String[] args) {
        int n=6;
        int[] arr={1,8,7,100,56,90};
        int large=arr[0];
        for(int i=0;i<n;i++){
            if(large<arr[i])
            {
                large=arr[i];
            }
        }
        System.out.println(large);
    }
}
