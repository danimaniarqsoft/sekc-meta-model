package mx.infotec.dads.sekc.view;

import java.util.*;

import mx.infotec.dads.sekc.foundation.*;

public class ViewSelection extends LanguageElement {

    public Collection<ViewSelection> referringViewSelection;
    public Collection<LanguageElement> constructSelection;
    public Collection<ViewSelection> includedViewSelection;
    public Collection<FeatureSelection> featureSelection;
    public String name;
    public String description;

}