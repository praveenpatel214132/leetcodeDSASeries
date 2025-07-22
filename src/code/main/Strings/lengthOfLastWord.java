package code.main.Strings;

public class lengthOfLastWord {
    public int lengthOfLastWord(String s) {

        String[] arr = s.split(" ");
        int k = arr[arr.length - 1].length();
        return k;
    }
}
