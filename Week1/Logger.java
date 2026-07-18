class Logger 
{

    // Store the single object
    private static Logger instance;

    // Private constructor
    private Logger() 
    {
        System.out.println("Logger Created");
    }

    // Method to get the object
    public static Logger getInstance() 
    {

        if (instance == null) {
            instance = new Logger();
        }

        return instance;
    }

    public void showMessage() 
    {
        System.out.println("Using Logger");
    }
}

class SingletonTest
{

    public static void main(String[] args) 
    {

        Logger obj1 = Logger.getInstance();
        Logger obj2 = Logger.getInstance();

        obj1.showMessage();

        System.out.println(obj1 == obj2);
    }
}
