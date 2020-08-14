public class Problem11{
    public void reverseString(char[] s) {
        //Two pointers
        int left = 0;
        int right = s.length-1;
        while(left<right){
            char temp = s[left];
            s[left++] = s[right];
            s[right--] = temp; 
        }
    }
}