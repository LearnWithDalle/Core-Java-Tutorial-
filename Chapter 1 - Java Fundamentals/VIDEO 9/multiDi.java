public class multiDi {
public static void main(String[] args) {
    
    int ok[][] = new int[4][5];
    int a, b, c = 0;
    for (a = 0;a < 4; a++){
        for(b = 0; b < 5; b++){
            ok[a][b] = c;
            c++;
        }
    }
    // System.out.println(ok[1][3]);
    
    for (a = 0;a < 4; a++){
        for(b = 0; b < 5; b++){
            System.out.print(ok[a][b] + " ");
        }
        System.out.println();
    }





}    
}
