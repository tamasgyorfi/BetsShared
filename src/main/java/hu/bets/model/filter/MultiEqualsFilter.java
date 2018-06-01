package hu.bets.model.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MultiEqualsFilter implements Filter{
    private final Field field;
    private final List<String> values;

    public MultiEqualsFilter(Field field, List<String> values) {
        this.field = field;
        this.values = new ArrayList(values);
    }

    public Field getField() {
        return field;
    }

    public List<String> getValues() {
        return values;
    }
}
