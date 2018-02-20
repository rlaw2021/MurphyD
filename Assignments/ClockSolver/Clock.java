public class Clock {
    /**
     * Constructs a Clock with a 60.0 second timeslice.
     */
    public Clock() {
        throw new UnsupportedOperationException();
    }

    /**
     * Constructs a Clock with the given timeslice in seconds.
     *
     * @param timeslice                  the number of seconds the Clock will 
     *                                   tick forward by in each tick increment
     * @throws IllegalArgumentException  if the timeslice isn't positive and
     *                                   less than 1800.0 seconds
     */
    public Clock(double timeslice) {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns the number of hours simulated by the Clock since its
     * construction. For example, if 8156.6 seconds have passed, getHoursPassed
     * returns 2.
     *
     * @return the number of hours simulated
     */
    public int getHoursPassed() {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns the number of minutes (excluding hours) simulated by the Clock
     * since its construction. For example, if 8156.6 seconds have passed,
     * getMinutesPassed returns 15.
     *
     * @return the number of minutes simulated
     */
    public int getMinutesPassed() {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns the number of seconds (excluding minutes) simulated by the Clock
     * since its construction. For example, if 8156.6 seconds have passed,
     * getSecondsPassed returns 56.6.
     *
     * @return the number of minutes simulated
     */
    public double getSecondsPassed() {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns the timelice that the Clock ticks forward by in seconds.
     *
     * @return the Clock's timeslice
     */
    public double getTimeslice() {
        throw new UnsupportedOperationException();
    }

    /**
     * Ticks the Clock forward once, increasing the time passed by the
     * timeslice.
     */
    public void tick() {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns a String representation of the Clock, showing the time passed in
     * military time and hh:mm:ss.s format.
     *
     * @return a String representation of the Clock
     */
    public String toString() {
        throw new UnsupportedOperationException();
    }
}
