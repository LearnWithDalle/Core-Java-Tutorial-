import java.util.Arrays;

public class Example3 {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 5, 6, 3, 1, 8, 9, 0 };
        System.out.println();
        System.out.print("\tOrignal Array: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(" " + arr1[i]);
        }
        Arrays.sort(arr1);
        System.out.println();
        System.out.print("\tSorted Array: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(" " + arr1[i]);
        }

        System.out.println();
    }
}
