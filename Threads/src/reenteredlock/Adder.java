package reenteredlock;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{

    int counter;

    Lock lock;

    Count count;

    public Adder(int counter, Lock lock){
        this.counter=counter;
        this.lock=lock;
        count = new Count();
    }

    @Override
    public void run() {
        for(int i=0;i<100;i++){
            lock.lock();
            System.out.println("Adding " + i);
            count.count(i);
            lock.unlock();
        }
    }
}
