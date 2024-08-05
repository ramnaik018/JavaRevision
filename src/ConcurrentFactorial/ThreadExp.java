package ConcurrentFactorial;

public class ThreadExp extends Thread{
    public void run(){
        for(int i=0;i<=10000;i++){
            System.out.println("Hi");

        }
    }
}
