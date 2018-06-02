package hu.bets.model.filter;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use=JsonTypeInfo.Id.NAME,
        include= JsonTypeInfo.As.PROPERTY, property="@type")
@JsonSubTypes({
        @JsonSubTypes.Type(value=EqualsFilter.class, name="equals"),
        @JsonSubTypes.Type(value=MultiEqualsFilter.class, name="multiEquals"),
        @JsonSubTypes.Type(value=RangeFilter.class, name="range"),
})
public interface Filter {
}
