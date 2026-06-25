class Logger {

    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {

        if (instance == null) {
            instance = new Logger();
        }

        return instance;
    }

    void display() {
        System.out.println("Logger created");
    }
}


public class Singleton {

    public static void main(String[] args) {

        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();

        log1.display();

        System.out.println(log1 == log2);
    }
}