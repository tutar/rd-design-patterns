package org.tutar.pattern.chain.simple.handlers;

import org.tutar.pattern.chain.simple.Handler;
import org.tutar.pattern.chain.simple.Request;

/**
 * 控制台处理器
 * @author tutar
 */
public class ConsoleHandler implements Handler {
    public Boolean isHandleAble(Request request) {
        return true;
    }

    public Boolean process(Request request) {
        System.out.println(ConsoleHandler.class.getSimpleName());
        return true;
    }
}
