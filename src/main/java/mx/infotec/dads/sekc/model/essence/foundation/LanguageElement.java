package mx.infotec.dads.sekc.model.essence.foundation;

import java.util.Collection;

import mx.infotec.dads.sekc.model.essence.view.*;

/**
 * Main Abstract superclass for all main concepts in Essence.
 * 
 * <p>
 * See <a href="http://www.omg.org/spec/Essence/1.1/"> The Essence - Kernel And
 * Language For SOftware Engineering Methods, Version 1.1</a> for more details
 * on the use of the language.
 * 
 * @see ViewSelection
 * @see FeatureSelection
 * @see ViewSelection
 * @see ExtensionElement
 * @see ElementGroup
 * @see PatternAssociation
 * @see Resource
 * @see EndeavorProperty
 * @see Tag
 * 
 * @author Daniel Cortes Pichardo
 * @since essence 1.1
 * @version 1.1
 * 
 */
public abstract class LanguageElement {

    public Collection<ViewSelection> viewSelection;
    public Collection<FeatureSelection> featureSelection;
    public Collection<ExtensionElement> extension;
    public Collection<ElementGroup> referrer;
    public ElementGroup owner;
    public Collection<PatternAssociation> patternAssociation;
    public Collection<Resource> resource;
    public Collection<EndeavorProperty> properties;
    public Collection<Tag> tag;
    public boolean isSuppressable = true;

}