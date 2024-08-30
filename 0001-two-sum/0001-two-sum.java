class Solution {
    // public int[] twoSum(int[] nums, int target) {
    //      int[] result=new int[2];


    //     for (int i=0;i<nums.length;i++){

    //         for (int j=i+1;j<=nums.length-1;j++){
         
    //             int sum =nums[i]+nums[ j];
    //             if(sum==target){
    //                 result[0]=i;
    //                 result[1]=j;
    //                 return result;
    //             }

    //         }
    //     }

    //     return nums;

    // }

    public int[] twoSum(int[] nums, int target) {
       // X = [2, 7, , 11, 15]
       // y = x + z 
       //z = y - x
       Map<Integer, Integer> map  = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }

        for (int i =0; i < nums.length; i++){
            int z = target -  nums[i];
            int val = map.getOrDefault(z, -1);
            if (val !=-1 && val!=i){
                return new int[]{ i, val };
            }
        }
        return new int[]{0, 0};

    }
}