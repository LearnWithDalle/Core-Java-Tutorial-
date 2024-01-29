
/*
 * (Define an abstract class shape with abstract method area, And volume.)
 * Write a java Program to calculate area and volume of cone and Cylinder
 */
import java.util.*;

abstract class shape {
    final Float PI = 3.14F;
    Scanner sc = new Scanner(System.in);

    abstract void Area();

    abstract void Volume();
}

class Cylinder extends shape {
    float area, radius, height, volume;

    void accept() {
        System.out.println("Please Enter Radius and Height");
        radius = sc.nextFloat();
        height = sc.nextFloat();
    }

    void Area() {
        area = (2 * PI * radius * height) + (2 * PI * radius * radius);
        System.out.println("Area of Cylinder is: " + area);
    }

    void Volume() {
        volume = PI * radius * radius * height;
        System.out.println("Volume of Cylinder is: " + volume);

    }
}

class Cone extends shape {
    float area, radius, height, volume;

    void accept() {
        System.out.println("Please Enter Radius and Height");
        radius = sc.nextFloat();
        height = sc.nextFloat();
    }

    void Area() {
        area = PI * radius * (radius + (float) Math.sqrt(height * height + radius * radius));
        System.out.println("Area of Cone is: " + area);
    }

    void Volume() {
        volume = PI * radius * radius * (height / 3);
        System.out.println("Volume of Cone is: " + volume);

    }

}


public class Example1 {

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        Cone cone = new Cone();
        cylinder.accept();
        cone.accept();
        cylinder.Area();
        cylinder.Volume();
        cone.Area();
        cone.Volume();

    }
}