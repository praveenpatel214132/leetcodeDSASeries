package code.main.Arrays;


import java.util.ArrayList;
import java.util.List;

public class MajorityElement {
    public int majorityElement(int[] n) {
        //Approach 1 All Test Cases Passed 6ms
        /*Arrays.sort(nums);
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
        return max;*/
        //Approach 2 All Test Cases Passed 9ms
        if(n.length == 1) return n[0];
        else{
            int l = n.length;
            List<Integer> v = new ArrayList<>();
            int c[] = new int[l];
            int max = 0;
            c[0] = 1;
            v.add(n[0]);
            int i;
            int ans = n[0];
            int x = 1;
            for(i = 1; i < l; i++){
                if(v.indexOf(n[i]) == -1){
                    v.add(n[i]);
                    c[x++] = 1;
                } else c[v.indexOf(n[i])]++;
            }
            for(i = 0; i < c.length; i++){
                if(max < c[i]){
                    max = c[i];
                    ans = v.get(i);
                }
            }
            return ans;
        }
    }
}
