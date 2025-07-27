package code.main.Arrays;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int l = nums.length;
        int c = 0;
        int s = 0;
        List<Integer> t = new ArrayList<>();
        if(l == 3){
            if((nums[0] + nums[1] + nums[2]) == 0){
                t.add(nums[0]);
                t.add(nums[1]);
                t.add(nums[2]);
                res.add(t);
                return res;
            }
        }
        for(int i = 0; i < l; i++){
            c = 1;
            t = new ArrayList<>();
            s = nums[i];
            t.add(nums[i]);
            for(int j = 0; j < l; j++){
                if(i==j){
                    continue;
                } else {
                    s += nums[j];
                    c++;
                    t.add(nums[j]);
                    if(c == 3 && s == 0){
                        Collections.sort(t);
                        if(!res.contains(t)){
                            res.add(t);
                        }
                        t = new ArrayList<>();
                        t.add(nums[i]);
                        c = 1;
                        s = nums[i];
                    } else if(c == 3 && s != 0){
                        t = new ArrayList<>();
                        t.add(nums[i]);
                        c = 1;
                        s = nums[i];
                    }
                }
            }
        }
        return res;
    }
}
