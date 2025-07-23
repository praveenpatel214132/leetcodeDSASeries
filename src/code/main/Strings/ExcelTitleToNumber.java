package code.main.Strings;

import static java.lang.Math.pow;

public class ExcelTitleToNumber {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        int len = columnTitle.length();
        if(len == 1){
            ans = columnTitle.charAt(0) % 64;
        } else {
            for(int i = (len - 1), j = 0; i >= 0 && j <= (len -1) ; i--, j++){
                if(j > 0){
                    ans += (int) ((columnTitle.charAt(i) % 64)*(pow(26,j)));
                } else {
                    ans += (columnTitle.charAt(i) % 64);
                }
            }
        }
        return ans;
    }
}
