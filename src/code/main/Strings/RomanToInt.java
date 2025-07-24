package code.main.Strings;

public class RomanToInt {
    public int romanToInt(String s) {
        Map<Character, Integer> mp = new HashMap<>();

        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);

        int sum = mp.get(s.charAt(0));
        for(int i=1;i<s.length();i++){

            // System.out.println(sum + "\n");
            // case 1: equals
            if(mp.get(s.charAt(i)) == mp.get(s.charAt(i-1))){
                sum += mp.get(s.charAt(i));
            }
            // case 2: more than
            if(mp.get(s.charAt(i)) > mp.get(s.charAt(i-1))){
                sum += mp.get(s.charAt(i)) - 2*mp.get(s.charAt(i-1));
            }
            // case 3: less than
            if(mp.get(s.charAt(i)) < mp.get(s.charAt(i-1))){
                sum += mp.get(s.charAt(i));
            }

        }

        // System.out.println(sum + "\n");
        return sum;
    }

}
