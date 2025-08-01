package code.main.Math;

public class ClimbStairsFibbonaci {
    public int climbStairs(int n) {
        if(n<=3) return n;
        int f1=2;
        int f2=3;
        int a=0;
        for(int i=3; i<n;i++){
            a=f1+f2;
            f1=f2;
            f2=a;
        }
        return a;
        
    }
}
