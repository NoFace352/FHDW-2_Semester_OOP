package com.lernen.designpattern.Factory;

public class SchuhDemo {
    public static void main(String[] args) {
        Schuhfabrik schuhfabrik = new Schuhfabrik();

        Schuh wanderschuh = schuhfabrik.erzeugeSchuh("wanderschuh");
        System.out.println(wanderschuh.getName());
    }
}
