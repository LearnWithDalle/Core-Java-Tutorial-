public class test{
    public static void main(String[] args) {
        demo demo1 = new demo(100, 22);
        demo demo2 = new demo(100, 22);
        demo demo3 = new demo(11, 10);
        System.out.println("demo1 == demo2: " + demo1.equalTo(demo2));
        System.out.println("demo1 == demo3: " + demo1.equalTo(demo3));
    }
}