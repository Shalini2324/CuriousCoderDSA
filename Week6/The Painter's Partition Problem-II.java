//https://www.geeksforgeeks.org/problems/the-painters-partition-problem1535/1
class Solution {
    public int getTime(int[] arr, int n, int times, int k)
    {
        int paint=1,sum=0;
        for(int i=0;i<n;i++)
        {
            if(sum+arr[i]<=times)
            {
                sum=sum+arr[i];
            }
            else
            {
                sum=arr[i];
                paint++;
            }
        }
        return paint;
    }
    public int minTime(int[] arr, int k)
    {
        int low=arr[0],high=0,n=arr.length;
        for(int i=0;i<n;i++)
        {
            low=Math.max(arr[i],low);
            high=high+arr[i];
        }
        int ans=low;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int paint=getTime(arr,n,mid,k);
            if(paint<=k)
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
                
            }
        }
        return ans;
    }
    
}
