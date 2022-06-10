package de.fhdw.auebung.singleton.BeispielVorlesung;

public class Regestry {

    private Regestry(){
    }

    private static Regestry registry = new Regestry();
    public static Regestry getInstance(){
        if (registry != null){
            return registry;
        } else {
            registry = new Regestry();
        }
        return registry;
    }
}
