public class Problem4{
    public boolean containsDuplicate(int[] nums){
        //Naive linear search
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<i;j++){
        //         if(nums[j] == nums[i]){
        //             return true;
        //         }
        //     }
        // }

        //Sorting
        /**The implementation here modifies the original array by sorting it. 
         * In general, it is not a good practice to modify the input 
         * unless it is clear to the caller that the input will be modified.  */

        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i]==nums[i+1]){
        //         return true;
        //     }
        // }

        //Set
        Set<Integer> set = new HashSet<Integer>(nums.length);
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
        }
        return false;
    }
}