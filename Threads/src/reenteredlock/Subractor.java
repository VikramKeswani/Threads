package reenteredlock;

import java.util.concurrent.locks.Lock;

public class Subractor implements Runnable {
    int counter;

    Lock lock;

    Count count;

    public Subractor(int counter, Lock lock){
        this.counter=counter;
        this.lock=lock;
        count = new Count();
    }


    @Override
    public void run() {
        for(int i=0;i<100;i++){
            lock.lock();
            System.out.println("Subtracting " + i);
            count.count(-1*i);
            lock.unlock();
        }
    }
}
