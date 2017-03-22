package mx.infotec.dads.sekc.foundation;

import java.util.Collection;

import mx.infotec.dads.sekc.view.*;

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