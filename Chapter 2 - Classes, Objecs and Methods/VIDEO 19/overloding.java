public class overloding {
    int id;
    String name;
    int age;

    overloding(int i, String n) {
        id = i;
        name = n;
    }
    overloding(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }
    void Display(){
        System.out.println(id + " " + name + " " + age);
    }
public static void main(String[] args) {
    overloding dalle = new overloding(1 , "dalle Mahesh", 18);
    overloding riya  = new overloding(2, "Riya Mukesh", 55);
    dalle.Display();
    riya.Display();
}
}
