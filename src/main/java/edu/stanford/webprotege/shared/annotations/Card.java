package edu.stanford.webprotege.shared.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Represents a Card, which is a piece of UI that can be displayed in a stack,
 * usually selected by tabs.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Card {

    /**
     * The Id for reference in configurations etc.
     * @return A string representing the Id.
     */
    String id();

}
