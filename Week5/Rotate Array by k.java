class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        int j = 0;

        k = k % n;

        int[] b = new int[n - k];

        // store first n-k elements
        for (int i = 0; i < n - k; i++) {
            b[i] = nums[i];
        }

        // move last k elements to front
        for (int i = n - k; i < n; i++) {
            nums[j] = nums[i];
            j++;
        }

        // copy stored elements back
        for (int i = 0; i < n - k; i++) {
            nums[j] = b[i];
            j++;
        }
    }
}

    
