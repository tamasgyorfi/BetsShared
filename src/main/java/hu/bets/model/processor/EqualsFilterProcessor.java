package hu.bets.model.processor;

import hu.bets.model.filter.EqualsFilter;
import hu.bets.model.filter.Filter;
import hu.bets.model.translator.DbFieldTranslator;

public class EqualsFilterProcessor implements FilterProcessor {

    private DbFieldTranslator dbFieldTranslator;

    public EqualsFilterProcessor(DbFieldTranslator dbFieldTranslator) {
        this.dbFieldTranslator = dbFieldTranslator;
    }

    @Override
    public boolean canHandle(Filter filter) {
        return (filter instanceof EqualsFilter);
    }

    @Override
    public String handle(Filter filter) {
        if (canHandle(filter)) {
            EqualsFilter equalsFilter = (EqualsFilter)filter;
            return dbFieldTranslator.translate(equalsFilter.getField()) + ": "+"\""+equalsFilter.getValue()+"\"";
        }

        return "";
    }
}
