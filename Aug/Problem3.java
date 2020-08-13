public class Problem3{
    public void rotate(int[] nums, int k) {
        //Brute Force

        // //Speed rotation
        // k %= nums.length;
        // int previous = 0;
        // int temp = 0;
        // for(int i=0;i<k;i++){
        //     previous = nums[nums.length - 1];
        //     for(int j=0;j<nums.length;j++){
        //         temp = nums[j];
        //         nums[j] = previous;
        //         previous = temp;
        //     }
        // }

        //Extra Array
        int[] extraArray = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            extraArray[(i+k) % nums.length] = nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = extraArray[i];
        }
    }
}