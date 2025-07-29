package code.main.Arrays;

public class RangeSumQuery {
    int n[];
    public RangeSumQuery(int[] nums) {
        n = nums;
        for(int i = 1; i<n.length; i++){
            n[i] = n[i-1] + n[i];
        }
    }

    public int sumRange(int left, int right) {
        return (left!=0?n[right] - n[left-1]:n[right]);
    }
}
