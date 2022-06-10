package de.fhdw.auebung.singleton.BeispielHerrSchulz;

public class Client {
    public static void main(final String[] args) {
        MySingleton s;
        s = MySingleton.KONST_A;
        s = MySingleton.KONST_B;
        System.out.println(s.getValue());
        s.doIt();
        switch (s) {
            case KONST_A:
                break;
            case KONST_B:
                break;
            default:
                break;
        }
    }
}
