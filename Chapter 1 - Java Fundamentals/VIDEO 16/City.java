import java.util.*;

class City {
    String a[];
    int n;

    City() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter how many cities you want to enter: ");
        n = s.nextInt();
        //redeclaration of array
        a = new String[n];
        //To accept values
        for (int i = 0; i < n; i++) {
            System.out.print("Enter city " + (i + 1) + " element: ");
            a[i] = s.next();
        }
    }

    //To display values.
    void display() {
        String temp = "";
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if (a[i].compareTo(a[j]) > 0) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
        System.out.println("Sorted Cities are ");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }

    //To create object
    public static void main(String args[]) {
        City obj = new City();
        obj.display();
    }
}
