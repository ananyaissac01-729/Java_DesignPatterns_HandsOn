public class LoggerTest {
    public static void main(String [] args){
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("1st msg");
        logger2.log("2nd msg");

        boolean res = (logger1==logger2);

        if (res){
            System.out.println("Only one instance is created and used across the application");
        }
        
    }
    
}
