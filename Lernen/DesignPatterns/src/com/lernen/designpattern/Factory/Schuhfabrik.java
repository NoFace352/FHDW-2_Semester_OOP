package com.lernen.designpattern.Factory;

public class Schuhfabrik {
    public Schuh erzeugeSchuh(String SchuhArt) {
        if (SchuhArt.toLowerCase().equals("turnschuh")) {
            return new Turnschuh();
        } else if (SchuhArt.toLowerCase().equals("wanderschuh")) {
            return new Wanderschuh();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
