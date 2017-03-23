package mx.infotec.dads.sekc.model.essence.alphaandworkproduct;

import mx.infotec.dads.sekc.model.essence.activityspaceandactivity.*;
import mx.infotec.dads.sekc.model.essence.foundation.*;

import java.util.*;

public class Alpha extends BasicElement {

    public Collection<Action> action;
    public ActivitySpace activitySpace;
    public Collection<AlphaContainment> alphaContainment;
    public Collection<AlphaAssociation> alphaAssociation;
    public Collection<WorkProductManifest> workProductManifest;
    public Collection<State> states;

}