public class Rectangle {
    int length = 5;
    int breadth = 6;
    
    Rectangle() {
        breadth = 6;
        length = 5;
    }
 
    int areaRectangle() {
       int var1 = this.length * this.breadth;
       return var1;
    }
 }