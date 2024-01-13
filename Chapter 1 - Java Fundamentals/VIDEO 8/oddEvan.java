public class oddEvan {
    public static void main(String[] args) {
        int arr[] = { 10, 5, 54, 45, 4, 65, 465, 46, 4, 9864, 9, 8, 6, 46, 54, 6455, 65, 65, 65, 65, 6, 56, 98, 69, 56,40, 651, 6 + 3, 2 };
        System.out.println("Even Array No: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }

        System.out.println("Odd Array No: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
