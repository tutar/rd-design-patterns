package org.tutar.pattern.chain.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@EnableAutoConfiguration
@SpringBootTest()
@ActiveProfiles("test")
@ComponentScan(basePackages = {"org.tutar.pattern.chain.spring"})
public class FilterManagerTest {

    @Autowired
    private FilterManager filterManager;

    @Test
    public void requestHandler() {
        filterManager.doFilter(new Request());
    }

    @Test
    public void skipSignRequestHandler() {
        Request request = new Request();
        request.setSkpSign(true);
        filterManager.doFilter(request);
    }
}