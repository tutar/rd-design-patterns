package org.tutar.pattern.chain.handlers;

import org.tutar.pattern.chain.Handler;
import org.tutar.pattern.chain.Request;

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