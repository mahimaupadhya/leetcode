class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0)
        {
            return 0;
        }
        int a=0;
        int b=nums.length-1;
        int length=nums.length;
        while(a<=b)
        {
            if(nums[a]==val )
            {
                if(nums[b]!=val)
                {
                    int temp=nums[b];
                    nums[b]=nums[a];
                    nums[a]=temp;
                    b--;
                    a++;
                
                }
                else{
                    b--;}
                
            }
            else{a++;}
         }
        if(a==0)
        {return 0;}
        return a;
        
    }
}
