//https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1
class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int Min=arr[0];
        int Max=arr[0];
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<Min){
                Min=arr[i];
            }
            
            if(arr[i]>Max){
                Max=arr[i];
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(Min);
        ans.add(Max);
        return ans;
    }
}

//online compiler
class Main {
    public static void main(String[] args) {
        
        int[] arr = {3, 7, 1, 9, 5}; 
        
        int Min = arr[0];
        int Max = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < Min) {
                Min = arr[i];
            }
            if(arr[i] > Max) {
                Max = arr[i];
            }
        }

        System.out.println("[" + Min + ", " + Max + "]");
    }
}

