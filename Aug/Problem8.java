public class Problem8{
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;
        
        //Non-zero
        for(int i : nums){
            if(i != 0){
                nums[nonZeroIndex++] = i;
            }
        }
        
        //Zero
        for(int i=nonZeroIndex;i<nums.length;i++){
            nums[i] = 0;
        }

        // int[] newNums = new int[nums.length];
        // int newNumsIndex = 0;
        // //Add non zero to newNums while retaining same order
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]!=0){
        //         newNums[newNumsIndex++] = nums[i];
        //     }
        // }
        
        // //Count zeros
        // int zeroCount = 0;
        // for(int i : nums){
        //     if(i==0){
        //         zeroCount++;
        //     }
        // }
        
        // //Add zeros to back
        // int lastIndex = nums.length - 1;
        // while(zeroCount!=0){
        //     newNums[lastIndex] = 0;
        //     zeroCount--;
        //     lastIndex--;
        // }
        
        // //Copy to original array
        // for(int i=0;i<nums.length;i++){
        //     nums[i] = newNums[i];
        // }
    }
}