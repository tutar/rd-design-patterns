package org.tutar.pattern.chain;

import org.tutar.pattern.chain.handlers.ConsoleHandler;
import org.tutar.pattern.chain.handlers.FileHandler;
import org.tutar.pattern.chain.handlers.SocketHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * 封装责任链细节
 * @author tutar
 */
public class Manager {

    private List<Handler> handlers = new ArrayList<Handler>();

    /**
     * 可选：handlers组装过程可定制，如顺序、组装过程触发点等
     */
    private void init(){
        handlers.add(new ConsoleHandler());
        handlers.add(new FileHandler());
        handlers.add(new SocketHandler());
    }

    public void process(Request request){

        if(handlers.isEmpty()){
            init();
        }

        for(Handler handler:handlers){
            if(handler.isHandleAble(request) &&  !handler.process(request)){
               break;
            }
        }
    }
}
