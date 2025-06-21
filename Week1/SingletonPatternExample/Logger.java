
public class Logger {
    
    private static Logger instance;

    private Logger() {
        //it defines how many time logger is initialized
        System.out.println("Logger initialized.");
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
}

