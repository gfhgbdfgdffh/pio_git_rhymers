package edu.kis.vh.nursery;

/**
 * Rhymer that rejects elements smaller or equal
 * to the top element, like the Hanoi Tower
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    /**
     * @return Amount of rejected inputs
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Add param in to the rhymer if it's bigger than the last,
     * or it's the first element.
     * In other case reject it and increase the amount of rejected
     * inputs.
     *
     * @param in - input for the Rhymer
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
