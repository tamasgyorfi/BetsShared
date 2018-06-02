package hu.bets.model.filter;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("range")
public class RangeFilter implements Filter{
    private final Field field;
    private final String lower;
    private final String upper;

    @JsonCreator
    public RangeFilter(@JsonProperty("filed") Field field, @JsonProperty("lower") String lower, @JsonProperty("upper") String upper) {
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
