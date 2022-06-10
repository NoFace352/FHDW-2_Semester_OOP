package de.fhdw.auebung.decorator.BeispielHerrSchulz;

import de.fhdw.auebung.decorator.BeispielHerrSchulz.Source;

public class TransparentFoil implements Source {
    private final Source basis;
    private final double red;
    private final double green;
    private final double blue;

    public TransparentFoil(
            final Source basis,
            final double red,
            final double green,
            final double blue) {
        this.basis = basis;
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    @Override
    public int getRed() {
        return (int)
        (this.red * this.basis.getRed());
    }

    @Override
    public int getGreen() {
        return (int)
        (this.green * this.basis.getGreen());
    }

    @Override
    public int getBlue() {
        return (int)
        (this.blue * this.basis.getBlue());
    }
}
