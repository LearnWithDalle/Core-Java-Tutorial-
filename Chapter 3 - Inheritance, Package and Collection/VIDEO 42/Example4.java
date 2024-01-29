/*
 * In this Example we have a base class Teacher and a sub class PhysicsTeacher.
 * Since class PhysicsTeacher exteds the designation and collage properties and work()
 * method from base class, we need not to declare these property and method in sub class.
 */

class Teacher {
    String designation = "Teacher";
    String collageName = "LostStudent University of NoWhere";

    void work() {
        System.out.println("Teaching of envisible Student");
    }
}

public class Example4 extends Teacher { // Suppose this class is PhysicsTeacher exteds a Teacher Class
    String mainSubject = "Physics";

    public static void main(String[] args) {
        Example4 physicsTeacher = new Example4();
        System.out.println("collage Name : " + physicsTeacher.collageName);
        System.out.println("collage Designation : " + physicsTeacher.designation);
        System.out.println("collage Main Subject : " + physicsTeacher.mainSubject);
        physicsTeacher.work();
    }
}