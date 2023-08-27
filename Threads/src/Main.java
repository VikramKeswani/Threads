import print1to100.NumberPrintClass;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<100;i++){
            NumberPrintClass numberPrintClass = new NumberPrintClass(i);
            Thread thread = new Thread(numberPrintClass);
            thread.start();
            thread.join();
        }

    }
}