package Singleton;

public class ExampleSingleton {

    /**
     * Lazy Initialization
     * Erstellt genau eine Instanz, wenn das ExampleSingleton benötigt wird.
     * Nutzbar für single-threaded Anwendungen, aber nicht für multi-threaded
     */

    private static ExampleSingleton singletonInstance;

    private ExampleSingleton() {
    }

    public static ExampleSingleton getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new ExampleSingleton();
        }
        return singletonInstance;
    }

    public static int getValue(){
        return 5;
    }
}
