package reenteredlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockMainClass {
    public static void main(String[] args) throws InterruptedException {
        int count=0;
        Lock lock = new ReentrantLock();
        Adder adder = new Adder(count,lock);
        Subractor subractor = new Subractor(count,lock);
        Thread thread1 =new Thread(adder);
        Thread thread2 = new Thread(subractor);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Final Value:");
        System.out.println(count);
    }
}
