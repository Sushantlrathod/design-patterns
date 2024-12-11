package creationalDesignPattern.singleton;

public class Eager {

    public static void main(String[] args) {
        System.out.println("Eager Loading Example");
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1.getmessage());

    }
}

class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {       
    }

    public static Singleton getInstance() {
        return instance;
    }

    public String getmessage() {
        return "Hello, I am the Singleton instance!";
    }
}