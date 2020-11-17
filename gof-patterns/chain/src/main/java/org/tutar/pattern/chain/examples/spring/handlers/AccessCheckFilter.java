package org.tutar.pattern.chain.examples.spring.handlers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.tutar.pattern.chain.examples.spring.Filter;
import org.tutar.pattern.chain.examples.spring.FilterManager;
import org.tutar.pattern.chain.examples.spring.Request;

/**
 * @author tutar
 */
@Component
public class AccessCheckFilter implements Filter {
    private static final Logger LOGGER = LoggerFactory.getLogger(FilterManager.class);
    @Override
    public int getOrder() {
        return 3;
    }
    @Override
    public Boolean isHandleAble(Request request) {
        return true;
    }
    @Override
    public Boolean process(Request request) {
        LOGGER.info("processing with {} ......",this.getClass().getSimpleName());
        return true;
    }
}
