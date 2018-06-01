package hu.bets.model.filter;

public class EqualsFilter implements Filter{
    private final Field field;
    private final String value;

    public EqualsFilter(Field field, String value) {
        this.field = field;
        this.value = value;
    }

    public Field getField() {
        return field;
    }

    public String getValue() {
        return value;
    }
}
