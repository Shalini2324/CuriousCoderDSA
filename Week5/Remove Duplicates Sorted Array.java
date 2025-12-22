class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int n=arr.length;
        int j=0;
        if (n == 0){
            return list;
        } 
       
        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                arr[j]=arr[i];
                j++;
            }
        }
        arr[j++]=arr[n-1];
        
        for (int i = 0; i < j; i++) {
            list.add(arr[i]);
        }

        return list;
    }
}


class Solution {
    // Function to remove duplicates from the given sorted array
    public int removeDuplicates(int[] a) {
        int n = a.length;
        if (n == 0) return 0;

        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j++] = a[i];
            }
        }
        a[j++] = a[n - 1];
        
        return j; // new length of array without duplicates
    }
}
