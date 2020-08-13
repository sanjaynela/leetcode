public class Problem6{
    public int[] intersect(int[] nums1, int[] nums2) {
        //HashMap Approach
        if(nums1.length>nums2.length){
            return intersect(nums2,nums2);
        }
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i : nums1){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        int indexOfNums1 = 0;
        for(int j : nums2){
            if(map.getOrDefault(j,0) > 0){
                nums1[indexOfNums1++] = j;
                map.put(j,map.getOrDefault(j,0) - 1);
            }
        }

        return Arrays.copyOfRange(nums1,0,indexOfNums1);


        //Sorting
        // Arrays.sort(nums1);
        // Arrays.sort(nums2);

        // int i=0, j=0, k=0;
        // while(i<nums1.length && j<nums2.length){
        //     if(nums1[i]<nums2[j]){
        //         i++;
        //     }
        //     else if(nums1[i]>nums2[j]){
        //         j++;
        //     }
        //     else{
        //         //Modify exisiting array so that you can copy it later
        //         nums1[i++] = nums2[j++];
        //         k++;
        //     }
        // }
        // //Copy existing array to k and return it
        // return Arrays.copyOfRange(nums1,0,k);
    }
}