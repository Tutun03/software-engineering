import org.w3c.dom.ls.LSOutput;

public class A26 {
    public static void main(String[] args) {
        int rows = 2;
        int column = 2;
        int[][] x = new int[rows][column];
        int[][] y = new int[rows][column];
        int[][] z = new int[rows][column];
        x[0] = new int[]{3, 4};
        x[1] = new int[]{6, 7};
        y[0] = new int[]{8, 9};
        y[1] = new int[]{7, 3};

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                z[i][j] = 0;
                for (int k = 0; k < column; k++) {
                    z[i][j] += x[i][k] * y[k][j];
                }
            }
        }
        for (int[] row : z) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}



