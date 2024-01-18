public class newKey {

    public static void main(String[] args) {
        double[] mylist = new double[] { 1.2, 5.5, 58.1, 6.5, 144.1, 5.1, 52.2 };
        for (int i = 0;i < mylist.length;i++){
            System.out.println(mylist[i] + " ");
        }
        double total = 0; 
        for (int i = 0; i < mylist.length; i++ ){
            total += mylist[i];
        }
        System.out.println("total is: " + total);
        double max = mylist[0];
        for (int i = 0;i < mylist.length; i++){
            if (mylist[i] > max)max = mylist[i];
        }
        System.out.println("MAX is: " + max);
    }
}