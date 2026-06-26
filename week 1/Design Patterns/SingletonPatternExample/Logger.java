public class Logger {

    // Single instance of Logger
    private static Logger logger;
    // Private constructor
    private Logger() {
    }

    // Method to get the single instance
    public static Logger getInstance() {

        if (logger == null) {
            logger = new Logger();
        }

        return logger;
    }

    // Normal instance method
    public void displayMesg() {
        System.out.println("User logged in");
    }
}