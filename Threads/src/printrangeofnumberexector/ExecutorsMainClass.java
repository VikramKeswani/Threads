package printrangeofnumberexector;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsMainClass {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i <= 100; i++) {
            executorService.execute(new NumberPrintClassExecutor(i));
        }
    }
}
