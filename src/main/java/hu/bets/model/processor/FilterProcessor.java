package hu.bets.model.processor;

import hu.bets.model.filter.Filter;

public interface FilterProcessor {

    boolean canHandle(Filter filter);

    String handle(Filter filter);
}
