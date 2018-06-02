package hu.bets.model.filter;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@JsonTypeName("multiEquals")
public class MultiEqualsFilter implements Filter{
    private final Field field;
    private final List<String> values;

    @JsonCreator
    public MultiEqualsFilter(@JsonProperty("field") Field field, @JsonProperty("values") List<String> values) {
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
