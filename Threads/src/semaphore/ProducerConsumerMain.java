package semaphore;

import java.util.concurrent.Semaphore;

public class ProducerConsumerMain {
    private static final Semaphore producerSemaphore = new Semaphore(5);
    private static final Semaphore consumerSemaphore = new Semaphore(0);

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter(0);
         Producer producer = new Producer(producerSemaphore, consumerSemaphore,counter);
        Consumer consumer = new Consumer(producerSemaphore, consumerSemaphore,counter);

        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);
        thread1.start();
        thread2.start();
    }
}
