package co.edu.escuelaing.sparkd.httpserver;

public interface URIProcessor {

    public void mapService(String command) throws Exception;

    public String executeService(String theURI);
}
