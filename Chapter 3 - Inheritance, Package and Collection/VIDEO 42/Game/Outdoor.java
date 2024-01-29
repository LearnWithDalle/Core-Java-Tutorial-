package Game;

public class Outdoor {
    protected String player;
    public Outdoor(){}
    public Outdoor(String player){
        this.player = player;
    }
    public void Display(){
        System.out.println(player);
    }
    public void finalized(){

        System.out.println("\n Terminating Outdoor Class");
    }
}
