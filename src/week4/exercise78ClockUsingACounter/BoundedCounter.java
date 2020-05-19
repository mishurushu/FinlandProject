package week4.exercise78ClockUsingACounter;

public class BoundedCounter {

    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public void next() {
        value ++;
        if (value > upperLimit){
            ;
        }
    }

    @Override
    public String toString() {
        return "BoundedCounter{" +
                "value=" + value +
                '}';
    }
}
