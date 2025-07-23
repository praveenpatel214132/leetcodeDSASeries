package code.main.Strings;

public class ExcelSheetColumnNumber {
    public int titleToNumber(String col) {
        int ans = 0;
        for(int j = 0; j < col.length(); j++){
            ans = ((ans*26) + (col.charAt(j) % 64));
        }
        return ans;
    }
}
