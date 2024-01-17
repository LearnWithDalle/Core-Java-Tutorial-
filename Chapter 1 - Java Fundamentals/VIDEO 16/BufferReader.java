import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferReader {
    public static void main(String[] args) throws Exception {
        int i, j, k = 0, n;
        int r[] = new int[10];
        int prime[] = new int[10];
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the Number of Elements: ");
        n = Integer.parseInt(br.readLine());
        
        for (i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + " Number of the Array: ");
            r[i] = Integer.parseInt(br.readLine());
        }
        
        for (j = 0; j < n; j++) {
            int flag = 0;
            if (r[j] == 0 || r[j] == 1) {
                continue;
            } else {
                for (i = 2; i < r[j]; i++) {
                    if (r[j] % i == 0) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    prime[k] = r[j];
                    k++;
                }
            }
        }

        System.out.println("Prime Numbers are: ");
        for (i = 0; i < k; i++) {
            System.out.print(prime[i] + " ");
        }
    }
}
