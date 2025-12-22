//https://www.geeksforgeeks.org/problems/move-all-negative-elements-to-end1813/1
class Solution {
    public void segregateElements(int[] arr) {
        // Your code goes here
        List<Integer> pos = new ArrayList<>();
    List<Integer> neg = new ArrayList<>();

    // Separate positive and negative elements
    for (int num : arr) {
        if (num < 0) {
            neg.add(num);
        } else {
            pos.add(num);
        }
    }

    // Merge them back into the original array
    int j = 0;
    for (int num : pos) {
        arr[j++] = num;
    }
    for (int num : neg) {
        arr[j++] = num;
    }
    }
}
//other solution
class Solution {
  public void segregateElements(int[] arr) {
        int n=arr.length;
        int[] temp = new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=0)
            {
                temp[j]=arr[i];
                j++;
            }
        }
       for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                temp[j++] = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
  }
}
