package edu.stanford.webprotege.shared.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 25 Apr 16
 *
 * Represents a Portlet, which is a view on the current project.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Portlet {

    /**
     * The Id.  This Id is used to specify locations in layout files.
     * @return A string representing the Id.
     */
    String id();

    /**
     * The default portlet title.  This is used in the user interface when the user
     * chooses a portlet to add and also in the portlet header bar.
     * @return A string representing the title.
     */
    String title();

    /**
     * A short description of the portlet.  This is used in the user interface for
     * displaying a small piece of text that helps the user understand the purpose
     * of the portlet.
     * @return A string representing a description of the portlet.  May be empty.
     */
    String tooltip() default "";
}
