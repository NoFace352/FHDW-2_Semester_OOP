package de.fhdw.auebung.singleton.BeispielHerrSchulz;

public enum MySingleton {
    KONST_A(0) {
        @Override
        public void doIt() {
            System.out.println("in A");
        }
    },
    KONST_B(1) {
        @Override
        public void doIt() {
            System.out.println("in B");
        }
    },
    KONST_C(2) {
        @Override
        public void doIt() {
            System.out.println("in C");
        }
    };

    private final int value;

    MySingleton(final int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public abstract void doIt();
}
