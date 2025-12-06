//https://www.geeksforgeeks.org/problems/print-elements-of-array4910/1
class Solution {
    // Just print the space seperated array elements
    void printArray(int arr[]) {
        //   code here
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }
    }
}

//online compiler
class Main {
    public static void main(String[] args) {
      int n;
      int[] a={24,567,45,36,78,789,67,453};
      n=8;
      for(int i=0;i<n;i++){
          System.out.print(a[i]+" ");
      }
    }
}
