public class Example2 {
    public static void main(String[] args) {

        int threed[][][] = new int[3][4][5];
        int i, j, k;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++) {
                    // System.out.print(threed[i][j][k]);
                    threed[i][j][k] = i * j * k;
                }
                // System.out.println();
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++) {
                    System.out.print(threed[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}


