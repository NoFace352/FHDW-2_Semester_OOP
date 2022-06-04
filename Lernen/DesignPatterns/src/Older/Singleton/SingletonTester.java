package Older.Singleton;

public class SingletonTester {
    public static void main(String[] args) {
        ExampleSingleton exampleSingleton = ExampleSingleton.getInstance();

        System.out.println(ExampleSingleton.getValue());
    }
}
