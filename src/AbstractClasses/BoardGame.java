package AbstractClasses;

public abstract class BoardGame {
    public int Players;
    public BoardGame(int Players){
        this.Players=Players;
    }
    public abstract void play();
}
