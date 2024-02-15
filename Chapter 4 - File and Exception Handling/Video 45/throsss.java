import java.io.IOException;

public class throsss {
    void music() throws IOException {
        throw new IOException("IO Error");
    }
    void play() throws IOException {
        music();
    }
    void enjoy(){
        try{
            play();
        }catch(Exception e){
            System.out.println("Inside Catch : Exception Handle....");
        }
    }    
    public static void main(String[] args) {
        throsss err1 = new throsss();
        err1.enjoy();
        System.out.println("End of the code");
    }
}
