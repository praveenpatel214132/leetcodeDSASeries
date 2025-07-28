package code.main.Arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        int c = 1;
        int pc = 0;
        if(nums.length == 1) return nums[0];
        int i;
        for(i = 1; i < nums.length; i++){

            if(nums[i - 1] != nums[i] && c > pc){
                max = nums[i - 1];
                pc = c;
                c = 1;
            } else c++;
        }

        if(c > pc){
            max = nums[i - 1];
        }
        return max;
    }
}
