package hu.bets.model.filter;

public class RangeFilter implements Filter{
    private final Field field;
    private final String lower;
    private final String upper;

    public RangeFilter(Field field, String lower, String upper) {
        this.field = field;
        this.lower = lower;
        this.upper = upper;
    }

    public Field getField() {
        return field;
    }

    public String getLower() {
        return lower;
    }

    public String getUpper() {
        return upper;
    }
}
