package org.tutar.pattern.chain.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author tutar
 */
@SpringBootApplication
public class ChainApp {


    /**
     * Program entry point.
     *
     * @param args command line args
     */
    public static void main(String[] args){
        SpringApplication.run(ChainApp.class,args);
    }
}
