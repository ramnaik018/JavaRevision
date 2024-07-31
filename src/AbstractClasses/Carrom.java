package AbstractClasses;

public class Carrom extends BoardGame{
    Carrom(){
        super(4);
    }
    public void play(){
        System.out.println("This is carrom and played by "+super.Players);
    }
}
