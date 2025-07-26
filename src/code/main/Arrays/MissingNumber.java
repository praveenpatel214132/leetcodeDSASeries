package code.main.Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int s = (n*(n+1))/2;
        for(int i = 0; i < nums.length; i++){
            s-=nums[i];
        }
        return s;
    }
}
