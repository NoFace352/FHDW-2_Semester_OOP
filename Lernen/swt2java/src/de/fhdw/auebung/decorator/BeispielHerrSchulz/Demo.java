package de.fhdw.auebung.decorator.BeispielHerrSchulz;

public class Demo {
    public static void main(final String[] args) {
        final Source white = new WhiteLamp();
        final Source yellow = new TransparentFoil(white, 1.0, 1.0, 0.0);
        final Source red = new TransparentFoil(yellow, 1.0, 0.0, 1.0);
        final Source darkerRed = new TransparentFoil(red, 0.5, 1.0, 1.0);
        final Source evenDarkerRed = new TransparentFoil(darkerRed, 0.5, 1.0, 1.0);
        printSource(white, "white"); // white: R=255 G=255 B=255
        printSource(yellow, "yellow"); // yellow: R=255 G=255 B=0 (no blue)
        printSource(red, "red"); // red: R=255 G=0 B=0 (in addition, no green)
        printSource(darkerRed, "darkerRed"); // darkerRed: R=127 G=0 B=0 (red, but less bright)
        printSource(evenDarkerRed, "evenDarkerRed"); // evenDarkerRed: R=63 G=0 B=0 (red, even less bright)
    }

    private static void printSource(final Source source, final String name) {
        System.out.printf("%s: R=%d G=%d B=%d\n", name, source.getRed(), source.getGreen(), source.getBlue());
    }
}
