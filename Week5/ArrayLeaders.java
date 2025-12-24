class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();

        int n = arr.length;

        // Last element is always a leader
        int max = arr[n - 1];
        res.add(max);

        // Traverse from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= max) {
                max = arr[i];
                res.add(arr[i]);
            }
        }

        // Reverse to maintain original order
        Collections.reverse(res);

        return res;
    }
}
