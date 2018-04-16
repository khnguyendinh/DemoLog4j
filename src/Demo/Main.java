package Demo;

import org.apache.log4j.Logger;

public class Main {
    /* Get actual class name to be printed on */
    static Logger log = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        System.out.println("Hello World! "+Main.class.getName());
        log.debug("Hello this is a debug message");
        log.info("Hello this is an info message");
        Student student = new Student("khoa","tan ky");
    }
}
