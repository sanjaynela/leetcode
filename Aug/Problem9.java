public class Problem9{
    public int[] twoSum(int[] nums, int target) {
        /** Hash Table is the best optimal way to maintain
         * mapping of each element in the array to its index
         * NOTE: There is always tradeoff btw space and time
         */

        //Hash-Table - One Pass
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement)!=i){
                return new int[] {i,map.get(complement)};
            }
            map.put(nums[i],i);
        }

        throw new IllegalArgumentException("No two sum solution");

        //Hash-Table - Two Pass
        // Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],i);
        // }

        // for(int i=0;i<nums.length;i++){
        //     int complement = target - nums[i];
        //     if(map.containsKey(complement) && map.get(complement)!=i ){
        //         return new int[] {i,map.get(complement)};
        //     }
        // }
        // throw new IllegalArgumentException("No two sum solution");}
        // }

        //Brute Approach
        // int[] result = new int[2];
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums.length;j++){
        //         if(i!=j){
        //             if(nums[i] + nums[j] == target){
        //                 result[0] = i;
        //                 result[1] = j;
        //                 return result;
        //             }
        //         }
        //     }
        // }
        // return result;
    }
}