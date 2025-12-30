class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int l=0,h=n-1;
        while(l<=h){
            int mid=l+((h-l)/2);
            int i=(mid-1+n)%n;
            int j=(mid+1)%n;
            if(nums[mid]<nums[i] && nums[mid]<nums[j])
            {
                return nums[mid];
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
        return nums[0];
    }
}
