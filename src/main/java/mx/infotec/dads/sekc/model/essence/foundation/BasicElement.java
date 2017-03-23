package mx.infotec.dads.sekc.model.essence.foundation;

import mx.infotec.dads.sekc.model.essence.GraphicalElement;

/**
 * Abstract superclass for all main concepts in Essence other than Element
 * groups.
 * 
 * @see LanguageElement
 *  
 * @author Daniel Cortes Pichardo
 * @since essence 1.1
 * @version 1.1
 * 
 */
public abstract class BasicElement extends LanguageElement {

    /**
     * The name of the element
     */
    public String name;

    /**
     * The icon to be used when presenting the elements.
     * 
     * @see GraphicalElement
     */
    public GraphicalElement icon;

    /**
     * A short and concise description of what the element is. It is discouraged
     * to use rich formatting and structuring elements like section headings in
     * the brief description. The content of this attribute should be a summary
     * of the content fiven in attribute "description".
     */
    public String briefDescription;

    /**
     * A more detailed description of the element. The content of this attribute
     * may be written in a markup language to allow for rich descriptions. It
     * may include section headings, formatting information, hyperlinks, or
     * similar to ease structured reading and navigation.
     */
    public String description;

}