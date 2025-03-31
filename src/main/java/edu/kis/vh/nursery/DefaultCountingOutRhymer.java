package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int ERROR = -1;
    private static final int NUMBERS_CAPACITY = 12;

    private int[] numbers = new int[NUMBERS_CAPACITY]; 
    
    private int total = ERROR;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == ERROR;
    }

    public boolean isFull() {
        return total == NUMBERS_CAPACITY-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }
}
