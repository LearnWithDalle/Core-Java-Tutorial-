package Game;

public class Indoor {
    protected String player;
    public Indoor(){}
    public Indoor(String player){
        this.player = player;
    }
    public void Display(){
        System.out.println(player);
    }
    public void finalized(){

        System.out.println("\n Terminating Indoor Class");
    }

}
