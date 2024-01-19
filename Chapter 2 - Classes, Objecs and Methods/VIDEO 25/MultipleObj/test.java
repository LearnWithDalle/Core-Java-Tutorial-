package MultipleObj;

public class test {
    public static void main(String[] args) {
        // Student 1
        Student riya = new Student();
        riya.name = "Riya Pathak";
        riya.age = 19;
        riya.rollNo = 35;
        riya.showInfo();
        
        // Student 2
        Student pappu = new Student();
        pappu.name = "Pappu Chiwala";
        pappu.age = 30;
        pappu.rollNo = 52;
        pappu.showInfo();

        // Student 3
        Student Dalle = new Student();
        Dalle.name = "Mahesh Dalle";
        Dalle.age = 20;
        Dalle.rollNo = 10;
        Dalle.showInfo();
    }
}
