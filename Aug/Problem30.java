public class Problem30{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] newArray = new int[m+n];
        int a = 0;
        int b = 0;
        int k = 0;
        while(a<m && b<n){
            if(nums1[a]<nums2[b]){
                newArray[k++] = nums1[a++];
            }
            else{
                newArray[k++] = nums2[b++];
            }
        }
        if(a<m){
            while(k!=newArray.length){
                newArray[k++] = nums1[a++];
            }
        }
        else{
            while(k!=newArray.length){
                newArray[k++] = nums2[b++];
            }
        }
        //nums1=newArray;  DO NOT DO THIS!!!!!
        for(int i=0;i<newArray.length;i++){
            nums1[i] = newArray[i];
        }

        //Space Complexity : O(1)
        // int[] newArray = new int[m+n];
        // int a = m - 1;
        // int b = n - 1;
        // int k = m+n-1;
        
        // while(a>=0 && b>=0){
        //     if(nums1[a]>nums2[b]){
        //         nums1[k--] =  nums1[a--];
        //     }
        //     else{
        //         nums1[k--] = nums2[b--];
        //     }
        // }
        
        // //Copy from nums2
        // while(b>=0){
        //     nums1[k--] = nums2[b--];
        // }
    }
}