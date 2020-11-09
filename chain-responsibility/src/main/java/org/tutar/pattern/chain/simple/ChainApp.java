package org.tutar.pattern.chain.simple;

/**
 * @author tutar
 */
public class ChainApp {

    /**
     * Program entry point.
     *
     * @param args command line args
     */
    public static void main(String[] args){
        Request request = new Request();

        Manager manager = new Manager();
        manager.process(request);
    }
}
