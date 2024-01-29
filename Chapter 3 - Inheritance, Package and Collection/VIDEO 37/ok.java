import java.util.*;

public class ok {
    public static void main(String[] args) {
        // ArrayList create karna
        ArrayList<String> myList = new ArrayList<>();

        // Elements add karna
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");
        myList.add("WaterMelan");
        System.out.println(myList);
        // Elements access karna
        System.out.println("First element: " + myList.get(0));

        // Size check karna
        System.out.println("Size of ArrayList: " + myList.size());

        // Loop ke through elements print karna
        System.out.println("Elements in ArrayList:");
        for (String fruit : myList) {
            System.out.println(fruit);
        }

        // Element remove karna
        myList.clear();

        // Updated elements print karna
        System.out.println("Updated elements in ArrayList:");
        for (String fruit : myList) {
            System.out.println(fruit);
        }
    }
}