package mx.infotec.dads.sekc.alphaandworkproduct;

import mx.infotec.dads.sekc.activityspaceandactivity.*;
import mx.infotec.dads.sekc.foundation.*;

import java.util.*;

public class Alpha extends BasicElement {

    public Collection<Action> action;
    public ActivitySpace activitySpace;
    public Collection<AlphaContainment> alphaContainment;
    public Collection<AlphaAssociation> alphaAssociation;
    public Collection<WorkProductManifest> workProductManifest;
    public Collection<State> states;

}