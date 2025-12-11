//https://www.geeksforgeeks.org/problems/find-the-smallest-and-second-smallest-element-in-an-array3226/1
class Solution {
    int smallest(int arr[], int n, int min) {
        int res = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < res && arr[i] != min) {
                res = arr[i];
            }
        }
        return res;
    }
        
    public ArrayList<Integer> minAnd2ndMin(int[] arr) 
    {

        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;

        if (n < 2) {
            ans.add(-1);
            ans.add(-1);
            return ans;
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int second = smallest(arr, n, min);

        if (second == Integer.MAX_VALUE) {
            ans.add(-1);
            
        } else {
            ans.add(min);
            ans.add(second);
        }
        return ans;
    }
}
