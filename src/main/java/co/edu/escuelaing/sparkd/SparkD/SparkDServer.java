/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.sparkd.SparkD;

import co.edu.escuelaing.sparkd.httpserver.HttpServer;
import co.edu.escuelaing.sparkd.httpserver.URIProcessor;
import co.edu.escuelaing.sparkd.microSpring.MicroSpring;

/**
 *
 * @author dnielben
 */
public class SparkDServer {
    
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
