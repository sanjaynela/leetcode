public class Problem13{
    public int firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            char character = s.charAt(i);
            map.put(character,map.getOrDefault(character,0)+1);
        }
        for(int i=0;i<s.length();i++){
            char character = s.charAt(i);
            int count = map.get(character);
            if(count==1){
                return i;
            }
        }
        return -1;
    }
}