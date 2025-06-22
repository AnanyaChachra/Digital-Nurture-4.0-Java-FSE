//CREATION OF SINGLETON CLASS
class Logger {

    private static Logger singleInstance;

    private Logger() {
        System.out.println("Logger initialized.");
    }

    public static Logger getInstance() {
        if (singleInstance == null) {
            singleInstance = new Logger(); // create only once
        }
        return singleInstance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}

//TESTING OF SINGLE IMPLEMENTATION
public class SingletonPatternExample {
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        logger1.log("First message");

        Logger logger2 = Logger.getInstance();
        logger2.log("Second message");

        if (logger1 == logger2) {
            System.out.println("Only one Logger instance is used.");
        } else {
            System.out.println("Different Logger instances created.");
        }
    }
}