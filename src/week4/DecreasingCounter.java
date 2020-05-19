package week4;

public class DecreasingCounter {
    private int value;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        if(this.value == 0){
            System.out.println("No more decrease");
        }else this.value --;
    }

    public void reset(){
        this.value = 0;
    }


}
