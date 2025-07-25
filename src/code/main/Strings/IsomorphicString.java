package code.main.Strings;

public class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        int sl = s.length();
        int tl = t.length();
        if(sl != tl) return false;
        HashMap<Character, Character> m = new HashMap<Character, Character>();
        for(int i = 0; i < sl; i++){
            if((!(m.containsKey(s.charAt(i))) && m.containsValue(t.charAt(i))) || (m.containsKey(s.charAt(i)) && m.get(s.charAt(i)) != t.charAt(i))){
                return false;
            }
            m.put(s.charAt(i), t.charAt(i));
        }
        return true;
    }
}
