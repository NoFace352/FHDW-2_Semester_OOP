package de.fhdw.auebung.adapter.BeispielHerrSchulz;

/**
 * Client using an Adder.
 */
public class Client {
    private final Adder adder;

    public Client(final Adder adder) {
        this.adder = adder;
    }

    public int compute() {
        return this.adder.add(42, 23);
    }

    public static void main(final String[] args) {
        // TODO: how to use Adaptee?
        final Adaptee adaptee = new Adaptee();
        final Adder adder = new Adapter(adaptee);
        System.out.print("Result = " + new Client(adder).compute());
    }
}
