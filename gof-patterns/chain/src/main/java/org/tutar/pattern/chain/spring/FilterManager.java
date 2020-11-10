package org.tutar.pattern.chain.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
@RestController
public final class FilterManager {
    private static final Logger LOGGER = LoggerFactory.getLogger(FilterManager.class);

    private List<Filter> filters;

    public FilterManager(Optional<List<Filter>> optionalFilters){
        this.filters = optionalFilters.orElseGet(Collections::emptyList)
                .stream()
                .sorted(Comparator.comparing(Filter::getOrder))
                .collect(Collectors.toList());
    }

    public void doFilter(Request request){
        for(Filter filter: filters){
            if(filter.isHandleAble(request) && !filter.process(request) ){
                break;
            }
        }
    }

    @GetMapping("/api/chain")
    public Boolean requestHandler(){
        this.doFilter(new Request());
        return Boolean.TRUE;
    }
}
