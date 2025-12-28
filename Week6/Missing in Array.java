class Solution {
    int missingNum(int arr[]) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        int i = 0, j = n - 1;

        // Binary search to find the missing number
        while (i < j) {
            int mid = (i + j) / 2;
            if (arr[mid] == mid + 1) 
            {
                i = mid + 1;
            }
            else 
            {
                j = mid;
            }
        }

        // If the last element matches the expected value, return n + 1
        if (j + 1 == arr[n - 1]) {
            return n + 1;
        }
        return j + 1;
    }
}
