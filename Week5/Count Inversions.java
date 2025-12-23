class Solution {
    static int inversionCount(int arr[]) {
        // Code Here
        int n=arr.length;
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    count++;
                }
            }
        }
        return count;
    }
}
