package AbstractClasses;

public class Chess extends BoardGame{
    public Chess(){
        super(2);
    }
    @Override
    public void play(){
        System.out.println("This is chess board game played by "+super.Players);
    }
}
