package code.main.Strings;

public class RomanToInt {
    public int romanToInt(String s) {
        //Approach 1
//        Map<Character, Integer> mp = new HashMap<>();
//
//        mp.put('I', 1);
//        mp.put('V', 5);
//        mp.put('X', 10);
//        mp.put('L', 50);
//        mp.put('C', 100);
//        mp.put('D', 500);
//        mp.put('M', 1000);
//
//        int sum = mp.get(s.charAt(0));
//        for(int i=1;i<s.length();i++){
//
//            // System.out.println(sum + "\n");
//            // case 1: equals
//            if(mp.get(s.charAt(i)) == mp.get(s.charAt(i-1))){
//                sum += mp.get(s.charAt(i));
//            }
//            // case 2: more than
//            if(mp.get(s.charAt(i)) > mp.get(s.charAt(i-1))){
//                sum += mp.get(s.charAt(i)) - 2*mp.get(s.charAt(i-1));
//            }
//            // case 3: less than
//            if(mp.get(s.charAt(i)) < mp.get(s.charAt(i-1))){
//                sum += mp.get(s.charAt(i));
//            }
//
//        }
//
//        // System.out.println(sum + "\n");
//        return sum;
        //Approach 2 Enhanced
        int ans = 0, num = 0;
        for (int i = S.length()-1; i >= 0; i--) {
            switch(S.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    }

}
