package code.main.Math;

public class NextGreaterElement {
    public int[] nextGreaterElement(int[] n1, int[] n2) {
        int e=0;
        int n1l=n1.length;
        int n2l=n2.length;
        int[] aa=new int[n1l];
        int k=0,ai=0;
        int max = -1;
        for(int i=0; i<n1l; i++){
            e=0;
            while(n2[e]!=n1[i] && e<(n2l-1)){
                e++;
            }
            k=n2[e];
            e++;
            while(e<n2l){
                if(k<n2[e]){
                    max = n2[e];
                    break;
                }
                e++;
            }
            aa[ai] = max;
            ai++;
            max = -1;

        }
        return aa;
    }
}
