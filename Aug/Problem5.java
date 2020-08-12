public class Problem5{
    public int singleNumber(int[] nums) {
        //List operation
        // ArrayList<Integer> duplicateList = new ArrayList<Integer>();
        // for(int i=0;i<nums.length;i++){
        //     if(duplicateList.contains(nums[i])){
        //         duplicateList.remove(nums[i]);
        //     }
        //     else{
        //         duplicateList.add(nums[i]);
        //     }
        // }
        // return duplicateList.get(0);


        //HashMap Operation
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(int i : nums){
            if(map.get(i) ==1){
                return i;
            }
        }
        return 0;
    }
}