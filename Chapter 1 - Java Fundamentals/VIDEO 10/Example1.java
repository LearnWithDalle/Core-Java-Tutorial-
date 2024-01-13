public class Example1 {

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 },
                        { 4, 5, 6 }, 
                        { 7, 8, 9 } };

            for (int i =0;i < 3;i++){
                for (int j =0;j < 3;j++){
                    System.out.println("\tarr[" + i + "][" + j + "] : " + arr[i][j]);
                }
            }
            
            System.out.println("\tArray Element:");
            for (int i =0;i < 3;i++){
                for (int j =0;j < 3;j++){
                    System.out.print("\t " + arr[i][j]);                    
                }
                System.out.println();
            }

                
    }
}