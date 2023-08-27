package semaphore;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;

    Counter counter;
    public Producer(Semaphore producerSemaphore, Semaphore consumerSemaphore,Counter counter) {
        this.producerSemaphore=producerSemaphore;
        this.consumerSemaphore=consumerSemaphore;
        this.counter=counter;
    }


    @Override
    public void run() {
        while (true) {
            try {
                producerSemaphore.acquire();
                if(counter.getValue()<5) {
                    counter.addValue(1);
                    System.out.println("producer value:"+counter.getValue());
                }
                consumerSemaphore.release();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
