class Solution {
    public int searchInsert(int[] nums, int target) {
        int count =0;
        int targeted = 0;

        for(int a:nums){
            if(a==target)return count;
            if(nums[count]>target)return count;       
          ++count;
          ++targeted;
        }
        return targeted;
        
    }
}