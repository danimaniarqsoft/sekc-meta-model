package mx.infotec.dads.sekc.foundation;

import java.util.*;

import mx.infotec.dads.sekc.GraphicalElement;

public abstract class ElementGroup extends LanguageElement {

    public Collection<MergeResolution> mergeResolution;
    public Collection<LanguageElement> ownedElements;
    public Collection<LanguageElement> referredElements;
    public Collection<ExtensionElement> extension;
    public String name;
    public GraphicalElement icon;
    public String briefDescription;
    public String description;

}