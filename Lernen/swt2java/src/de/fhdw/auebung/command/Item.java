package de.fhdw.auebung.command;

public class Item {

    private String name;
    private int dmg;

    public Item(String name, int dmg) {
        this.name = name;
        this.dmg = dmg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

}
