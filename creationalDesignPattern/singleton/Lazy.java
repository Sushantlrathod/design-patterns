package creationalDesignPattern.singleton;

public class Lazy {

    public static void main(String[] args) {
        System.out.println("Eager Loading Example");
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1.getmessage());

    }
}

class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    /**
     * is synchronization only synchronizes key word is added to the method
     * signature
     * the locking is very expensive technique.
     * 
     * @return
     */

    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }

    public String getmessage() {
        return "Hello, I am the Singleton instance!";
    }
}