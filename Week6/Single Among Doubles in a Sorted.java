//https://www.geeksforgeeks.org/problems/find-the-element-that-appears-once-in-sorted-array0624/1
class Solution {
    int single(int[] arr) {
        // code here
        int n=arr.length;
        int i=0,j=n-2;
        while(i<=j){
            int mid=(i+j)/2;
            if(mid%2==0)
            {
                if(arr[mid]==arr[mid+1])
                {
                    i=mid+1;
                }
                else
                {
                    j=mid-1;
                }
            }
            else
            {
                if(mid%2!=0){
                    if(arr[mid]==arr[mid-1])
                    {
                        i=mid+1;
                    }
                    else{
                        j=mid-1;
                    }
                }
            }
        }
        return arr[i];
    }
}
