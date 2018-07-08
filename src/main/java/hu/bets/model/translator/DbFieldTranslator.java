package hu.bets.model.translator;

import hu.bets.model.filter.Field;

public interface DbFieldTranslator {

    String translate(Field field);
}
