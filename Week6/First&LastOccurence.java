class GFG{
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();

        int first = occurrence(arr, x, true);
        int last  = occurrence(arr, x, false);

        res.add(first);
        res.add(last);

        return res;
    }

  
    int occurrence(int[] arr, int x, boolean first) {
        int i = 0, j = arr.length - 1;
        int ans = -1;

        while (i <= j) {
            int mid = (i + j) / 2;

            if (arr[mid] == x) {
                ans = mid;
                if (first) {
                    j = mid - 1;   // move left
                } else {
                    i = mid + 1;   // move right
                }
            }
            else if (arr[mid] > x) {
                j = mid - 1;
            }
            else {
                i = mid + 1;
            }
        }
        return ans;
    }
}

