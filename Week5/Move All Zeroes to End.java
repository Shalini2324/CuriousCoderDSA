//https://www.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1
class Solution {
    void pushZerosToEnd(int[] arr) {
        int n=arr.length;
        int j=0;
       for(int i=0;i<n;i++){
           if(arr[i]!=0){
               arr[j] = arr[i];
               j++;
           }
       }
       for(int i=j;i<n;i++){
           arr[i] = 0;
       }
    }
}
//online compiler
class Main{
    void pushZerosToEnd(int[] arr) {
        // code here
        int n=arr.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0)
            {
                arr[j]=arr[i];
                j++;
            }
        }
        for(int i=j;i<n;i++){
            arr[i]=0;
        }
    }
public static void main(String[]args){
    int[] arr={1,2,0,4,3,0,5,0};
    Main obj=new Main();
    obj.pushZerosToEnd(arr);
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
}
