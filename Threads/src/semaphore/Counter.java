package semaphore;

public class Counter {
    int count;

    public Counter(int count){
        this.count=count;
    }

    public void addValue(int i){
        count+=i;
    }

    public int getValue(){
        return count;
    }
}
