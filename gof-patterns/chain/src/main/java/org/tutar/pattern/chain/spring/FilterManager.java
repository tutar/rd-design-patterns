package org.tutar.pattern.chain.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


/**
 * @author tutar
 */
@Service
public final class FilterManager {
    private static final Logger LOGGER = LoggerFactory.getLogger(FilterManager.class);

    private List<Filter> filters;

    public FilterManager(Optional<List<Filter>> optionalFilters){
        this.filters = optionalFilters.orElseGet(Collections::emptyList)
                .stream()
                .sorted(Comparator.comparing(Filter::getOrder))
                .collect(Collectors.toList());
    }

    /**
     * 责任链调用入口
     * @param request 待处理对象
     * @return
     */
    public void doFilter(Request request){
        for(Filter filter: filters){
            if(filter.isHandleAble(request) && !filter.process(request) ){
                LOGGER.info("filters process break at:{}",filter.getClass().getSimpleName());
                break;
            }
        }
        LOGGER.info("filter process finish...");
    }

}
