public class Problem16{
    public int strStr(String haystack, String needle) {
        //Approach : Linear Time Slice
        int L = needle.length(), n = haystack.length();
    
        for (int start = 0; start < n - L + 1; ++start) {
          if (haystack.substring(start, start + L).equals(needle)) {
            return start;
          }
        }
        return -1;
      }
}