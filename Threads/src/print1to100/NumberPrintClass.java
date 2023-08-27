package print1to100;

public class NumberPrintClass implements Runnable {

    Integer numberToPrint;

    public NumberPrintClass(Integer numberToPrint){
        this.numberToPrint=numberToPrint;
    }


    @Override
    public void run() {
        System.out.println(numberToPrint);
    }
}
