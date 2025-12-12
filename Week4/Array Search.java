//https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1
class Solution {
    public int search(int arr[], int x) {
        // code here
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
              return i;
            }
        }
        return -1;
    }
}

//online compiler
class Main {
    public static void main(String[] args) {
        int[] arr={3,546,456,45,23,345,456,342};
        int n=8,x=456;
        int flag=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {   
                flag=i;
                break;
            }
        }
        if(flag==-1){
        System.out.println(-1);
        }
        else{
            System.out.println(flag);
        }
    }
