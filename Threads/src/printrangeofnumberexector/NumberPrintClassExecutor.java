package printrangeofnumberexector;

import java.util.concurrent.Executors;

public class NumberPrintClassExecutor implements Runnable {

    int numberToPrint;
    private static final Object LOCK = new Object();
    public NumberPrintClassExecutor(int i) {
        this.numberToPrint = i;
    }

    @Override
    public void run() {
        synchronized (LOCK){
            System.out.println(numberToPrint);
        }

    }
}
