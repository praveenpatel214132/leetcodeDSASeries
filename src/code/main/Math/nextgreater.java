package code.main.Math;

public class nextgreater {
    public int[] nextGreaterElement(int[] n1, int[] n2) {
        int e = 0;
        int n1l=n1.length;
        int n2l=n2.length;

        int[] n= new int[n1l];
        for(int i = 0; i<n1l; i++){
            e=0;
            while(n2[e]!=n1[i] && e<(n2l-1)){
                e++;
            }
            if(e==(n2l-1) || n2[e+1]<n1[i]){
                n1[i]=-1;
            } else {
                n1[i]=n2[e+1];
            }

        }
        return n1;
    }
}
