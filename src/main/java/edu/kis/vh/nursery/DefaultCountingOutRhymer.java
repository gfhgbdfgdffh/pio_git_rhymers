package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int ERROR = -1;

	private static final int NUMBERS_CAPACITY = 11;

	private int[] numbers = new int[12]; 
    
    public int total = ERROR;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == ERROR;
    }

    public boolean isFull() {
        return total == NUMBERS_CAPACITY;
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

}
