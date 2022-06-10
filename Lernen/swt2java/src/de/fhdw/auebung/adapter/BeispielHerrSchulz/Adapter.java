package de.fhdw.auebung.adapter.BeispielHerrSchulz;

public class Adapter implements Adder {

    private final Adaptee adaptee;

    public Adapter(final Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public int add(int x, int y) {
        this.adaptee.add(x, y);
        return this.adaptee.getLastResult();
    }
}
