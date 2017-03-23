package mx.infotec.dads.sekc.model.essence.activityspaceandactivity;

import mx.infotec.dads.sekc.model.essence.alphaandworkproduct.*;
import mx.infotec.dads.sekc.model.essence.foundation.*;

import java.util.*;

public class Action extends LanguageElement {

    public Activity activity;
    public Collection<Alpha> alpha;
    public Collection<WorkProduct> workProduct;
    public ActionKind kind;

}