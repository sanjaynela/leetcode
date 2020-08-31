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
    }
}