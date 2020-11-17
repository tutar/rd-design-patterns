package org.tutar.pattern.chain.examples.spring.handlers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.tutar.pattern.chain.examples.spring.Filter;
import org.tutar.pattern.chain.examples.spring.Request;


/**
 * @author tutar
 */
@Component
public class SignatureFilter implements Filter {
    private static final Logger LOGGER = LoggerFactory.getLogger(SignatureFilter.class);
    @Override
    public int getOrder() {
        return 1;
    }

    @Override
    public Boolean isHandleAble(Request request) {
        Boolean skip = !request.getSkpSign();
        if(!skip){
            LOGGER.info("skip filter:{}",this.getClass().getSimpleName());
        }
        return skip;
    }

    @Override
    public Boolean process(Request request) {
        LOGGER.info("processing with {} ......",this.getClass().getSimpleName());
        return true;
    }
}
