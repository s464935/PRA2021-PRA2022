package introduction;

import org.apache.log4j.Logger;

public class HelloWorld {

    final static Logger logger = Logger.getLogger("HelloWorld.class");

    public static void main(String [ ] args) {
        System.out.println("Hello! Witaj!");

        logger.info("Dzien dobry");
    }

}