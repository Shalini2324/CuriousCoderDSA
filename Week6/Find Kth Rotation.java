class Solution {
    public int findKRotation(int nums[]) {
     int n=nums.length;
        int l=0,h=n-1;
        while(l<=h){
            int mid=l+((h-l)/2);
            int i=(mid-1+n)%n;
            int j=(mid+1)%n;
            if(nums[mid]<nums[i] && nums[mid]<nums[j])
            {
                return mid;
            }
            if(nums[h]>nums[mid])
            {
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return 0;
        
    }
}
