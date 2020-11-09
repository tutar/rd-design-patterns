package org.tutar.pattern.chain.simple.handlers;

import org.tutar.pattern.chain.simple.Handler;
import org.tutar.pattern.chain.simple.Request;

/**
 * @author tutar
 */
public class FileHandler implements Handler {
    public Boolean isHandleAble(Request request) {
        return true;
    }

    public Boolean process(Request request) {
        System.out.println(FileHandler.class.getSimpleName());
        return true;
    }
}
