package ConcurrentFactorial;

import java.math.BigInteger;

public class FactorialThread extends Thread{
    public Long Number;
    private BigInteger ans;
    private boolean executed;

    public FactorialThread(Long Number){
        this.Number=Number;
    }

    @Override
    public void run(){
        this.ans=factorial(Number);
        this.executed=true;
    }

    public BigInteger factorial(Long num){
        BigInteger ans=BigInteger.valueOf(1);
        for(Long i = 1L; i<=num; i++){
            ans=ans.multiply(BigInteger.valueOf(i));
        }
        return ans;
    }

    public boolean isExecuted() {
        return executed;
    }

    public BigInteger getFactorial(){
        return this.ans;
    }
}
