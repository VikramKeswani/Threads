package reenteredlock;

public class Count {

    int finalValue;
    public Count(){
        finalValue=0;
    }
    public void count(int i){
        finalValue=finalValue+i;
    }
}
