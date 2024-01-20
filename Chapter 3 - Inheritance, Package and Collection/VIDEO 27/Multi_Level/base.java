package Multi_Level;

    class Animal {
        void eat() {
            System.out.println("Eating..........");
        }
    }
    
    class Dog extends Animal {
        void bark() {
            System.out.println("Barking...... Bhau Bhau ");
        }
    }
    
    class BabyDog extends Dog {
        void weep() {
            System.out.println("Weeping........");
        }
    }
    
    public class base {
        public static void main(String[] args) {
            BabyDog d = new BabyDog();
            d.eat();
            d.bark();
            d.weep();
        }
    }
    
    