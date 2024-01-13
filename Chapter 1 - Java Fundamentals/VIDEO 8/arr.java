/**
 * arr
 */
public class arr {

    public static void main(String[] args) {
        
        // int markes[] = {1,2,3,4,5,6};
        // // System.out.println(markes.length);

        // for(int i = 0; i < markes.length; i++){
        //     System.out.println(markes[i]);
        // }


        // Array Declaration
        int[] numbers;

        // Array Initialization
        numbers = new int[5];

        // Array Initialization with Values
        int[] otherNumbers = {1, 2, 3, 4, 5};

        // // Accessing Array Elements
        // int firstElement = numbers[0];
        // int secondElement = otherNumbers[1];

        // // Array Length
        // int lengthOfOtherNumbers = otherNumbers.length;

        // Printing Array Elements
        for (int i = 0; i < otherNumbers.length; i++) {
            System.out.println("Element at index " + i + ": " + otherNumbers[i]);
        }        

    }
}