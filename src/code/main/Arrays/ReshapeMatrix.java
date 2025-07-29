package code.main.Arrays;

public class ReshapeMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int t = mat.length * mat[0].length;
        if (t != r * c || t % r != 0) {
            return mat;
        }
        final int[][] res = new int[r][c];
        int newR = 0;
        int newC = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                res[newR][newC] = mat[i][j];
                newC++;
                if (newC == c) {
                    newC = 0;
                    newR++;
                }
            }
        }
        return res;
    }
}
