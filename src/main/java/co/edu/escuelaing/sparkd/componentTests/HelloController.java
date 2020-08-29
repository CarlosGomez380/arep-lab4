package co.edu.escuelaing.sparkd.componentTests;

import co.edu.escuelaing.sparkd.microSpring.RequestMapping;

public class HelloController {
    @RequestMapping("/hello")
    public static String greetings() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/pi")
    public static String theValueOfPi() {
        return "PI: " + Math.PI;
    }
}
