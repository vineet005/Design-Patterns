package Singleton;

public class Application {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Implementation of Singleton Design Principle!");
    }
}
