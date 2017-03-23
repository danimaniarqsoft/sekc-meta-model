package mx.infotec.dads.sekc.model.essence.activityspaceandactivity;

import mx.infotec.dads.sekc.model.essence.alphaandworkproduct.*;
import mx.infotec.dads.sekc.model.essence.foundation.*;

public abstract class Criterion extends LanguageElement {

    public AbstractActivity activity;
    public State state;
    public LevelOfDetail levelOfDetail;
    public String description;

}