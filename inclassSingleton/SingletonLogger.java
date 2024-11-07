public class SingletonLogger {
    
    private static SingletonLogger uniqueInstance;
    String logLevel;

    private SingletonLogger() {}

    public static synchronized SingletonLogger getInstance()
    {
        if (uniqueInstance == null) { uniqueInstance = new SingletonLogger();}
        return uniqueInstance;
    }

    void error(String errorDescription)
    {
        System.out.println("Error: " + errorDescription);
    }

    void debugging (String debugDescription)
    {
        System.out.println("Debugging: " + debugDescription);
    }

    void magicError(String magicErrorDescription)
    {
        System.out.println("This is a magic error: " + magicErrorDescription);
    }

}
