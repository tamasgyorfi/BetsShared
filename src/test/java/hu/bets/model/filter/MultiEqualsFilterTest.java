package hu.bets.model.filter;

import org.junit.Test;

import java.util.Arrays;

public class MultiEqualsFilterTest {

    private MultiEqualsFilter sut = new MultiEqualsFilter(Field.MATCH_ID, Arrays.asList("a", "b", "c"));

    @Test
    public void buildShouldCreateProperQuery() {
        assertEquals("", sut.build());
    }
}