public class Problem4{
    public boolean containsDuplicate(int[] nums){
        //Naive linear search
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j] == nums[i]){
                    return true;
                }
            }
        }
        return false;
    }
}