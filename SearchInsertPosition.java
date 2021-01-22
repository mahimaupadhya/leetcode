class Solution {
    public int searchInsert(int[] nums, int target) {
        boolean flag=false;
        int position=-1;
        if(nums[0]==target || target<nums[0]){return 0;}
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>target &&nums[i-1]<target)
            {
                position=i;
                break;
            }
            if(nums[i]==target)
            {
                return i;
            }
            
            
        }
        if(position==-1){return nums.length;}
        return position;
        
    }
}
