package Single;

public class test {

    public static void main(String[] args) {
        String name = "Darshan";
        int rollNo = 20;
        String course = "Java";
        int mark = 40;

        info s1 = new info();
        s1.data(name, rollNo, course);
        s1.getMark(mark);
        s1.show();
        s1.showMark();
    }

}