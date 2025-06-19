

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] A = { {1, 2}, {3, 4} };
        int[][] B = { {2, 0}, {1, 3} };
        int[][] C = new int[2][2];

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                for(int k = 0; k < 2; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
