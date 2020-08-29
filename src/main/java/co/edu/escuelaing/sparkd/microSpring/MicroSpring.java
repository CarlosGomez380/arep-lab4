package co.edu.escuelaing.sparkd.microSpring;

import co.edu.escuelaing.sparkd.httpserver.URIProcessor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class MicroSpring implements URIProcessor {

    private Map<String, Method> webServices= new HashMap<>();

    public  void mapService(String component) throws Exception {
        int nMethods=0;
        for (Method m : Class.forName(component).getMethods()) {
            System.out.println("Revisando metodo: "+ m.getName());
            if (m.isAnnotationPresent(RequestMapping.class)) {
                System.out.println("Tiene anotacion @RequestMapping");
                RequestMapping rm= m.getAnnotation(RequestMapping.class);
                webServices.put(rm.value(),m);
                nMethods++;
            }
        }
        System.out.printf("No of webServices %d%n", nMethods);
    }

    public String executeService(String theURI){
        try {
            return webServices.get(theURI).invoke(null).toString();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return "a";
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            return "a";
        }
    }
}
