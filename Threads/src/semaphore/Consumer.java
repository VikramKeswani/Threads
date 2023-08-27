package semaphore;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {

    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;
    Counter counter;

    public Consumer(Semaphore producerSemaphore, Semaphore consumerSemaphore, Counter counter) {
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
        this.counter = counter;
    }

    @Override
    public void run() {
        while (true) {
            try {
                consumerSemaphore.acquire();
                if(counter.getValue()>0) {
                    counter.addValue(-1);
                    System.out.println("consumer value:"+counter.getValue());
               }
                producerSemaphore.release();
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
