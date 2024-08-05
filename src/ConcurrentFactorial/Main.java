package ConcurrentFactorial;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Long> lis= Arrays.asList(1000L,5L,35L,46L,23L,55L);
        List<FactorialThread> instances=new ArrayList<>();
        for(Long ele:lis){
            instances.add(new FactorialThread(ele));
        }

        for(FactorialThread ft:instances){
            //Thread t=new Thread(ft);
            ft.start();
        }

        for(FactorialThread ft:instances){
            ft.join(2000);
        }

        for(FactorialThread ft:instances){
            if(ft.isExecuted()){
                System.out.println("Factorial of "+ft.Number +" is "+ft.getFactorial());
            }else{
                System.out.println("Sorry , Factorial of "+ft.Number +" Could not be calculated in 2secs ");
            }
        }

//        ThreadExp te=new ThreadExp();
//        te.start();
        System.out.println("Main thread completed");
    }
}
