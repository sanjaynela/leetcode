public class Problem1{
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        //Two - Pointers Approach
        int i = 0;
        for(int j=1;j<nums.length;j++){
            //Iterate as long it is duplicate. If duplicate ends, update i
            if(nums[i]!=nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}