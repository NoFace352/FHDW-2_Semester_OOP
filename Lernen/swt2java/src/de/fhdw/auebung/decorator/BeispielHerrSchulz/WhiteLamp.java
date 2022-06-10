package de.fhdw.auebung.decorator.BeispielHerrSchulz;

import de.fhdw.auebung.decorator.BeispielHerrSchulz.Source;

public class WhiteLamp implements Source {
    @Override
    public int getRed() {
        return 255;
    }

    @Override
    public int getGreen() {
        return 255;
    }

    @Override
    public int getBlue() {
        return 255;
    }
}
