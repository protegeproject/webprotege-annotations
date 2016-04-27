package edu.stanford.webprotege.shared.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 25 Apr 16
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Portlet {

    String id();

    String title();
}
