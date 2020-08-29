package co.edu.escuelaing.sparkd.microSpring;

import co.edu.escuelaing.sparkd.httpserver.HttpServer;
import co.edu.escuelaing.sparkd.httpserver.URIProcessor;



public class MicroSpringBoot {

    public static void main(String[] args){
        try {
            URIProcessor microSpring= new MicroSpring();
            microSpring.mapService(args[0]);
            HttpServer server = new HttpServer(microSpring);
            server.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
