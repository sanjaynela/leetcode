public class Problem15{
    public boolean isPalindrome(String s) {
        int j = s.length() - 1;
        for(int i=0;i<j;i++){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if(i<j && Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
                return false;
            }
            j--;
        }
        return true;
    }
}