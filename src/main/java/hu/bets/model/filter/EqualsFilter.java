package hu.bets.model.filter;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("equals")
public class EqualsFilter implements Filter{
    private final Field field;
    private final String value;

    @JsonCreator
    public EqualsFilter(@JsonProperty("field") Field field, @JsonProperty("value") String value) {
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
