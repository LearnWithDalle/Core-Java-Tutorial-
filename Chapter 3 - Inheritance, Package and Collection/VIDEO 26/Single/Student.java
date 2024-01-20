package Single;

class Student {
    String name;
    int rollNo;
    String course;

    public void data(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    public void show() {
        System.out.println("Name: " + name + "\nRoll No: " + rollNo + "\nCourse: " + course);
    }
}

class info extends Student {
    int mark;

    public void getMark(int mark) {
        this.mark = mark;
    }

    public void showMark() {
        System.out.println("Marks: " + mark);
    }
}
