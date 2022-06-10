package de.fhdw.auebung.adapter.BeispielHerrSchulz;

/**
 * This is some class to be adapted.
 */
public class Adaptee {
    private int result;

    /**
     * Adds {@code x} and {@code y}.
     * @param x The first number.
     * @param y The second number.
     */
    public void add(final int x, final int y) {
        this.result = x + y;
    }

    /**
     * Returns the last result.
     */
    public int getLastResult() {
        return this.result;
    }
}
