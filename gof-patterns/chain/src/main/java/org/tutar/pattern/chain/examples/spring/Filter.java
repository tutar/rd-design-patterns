package org.tutar.pattern.chain.examples.spring;


import org.springframework.core.Ordered;

/**
 * 处理器接口
 * @author tutar
 */
public interface Filter extends Ordered {

    /**
     * 可选：可有可无，看具体场景
     * @param request
     * @return 可用该返回值控制该处理器是否处理传入请求
     */
    Boolean isHandleAble(Request request);

    /**
     * 处理请求
     * @param request
     * @return 可选：可用该返回值控制处理链是否继续
     */
    Boolean process(Request request);

}
