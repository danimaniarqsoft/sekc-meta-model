package mx.infotec.dads.sekc.model.essence.alphaandworkproduct;

import mx.infotec.dads.sekc.model.essence.activityspaceandactivity.*;
import mx.infotec.dads.sekc.model.essence.foundation.*;

import java.util.*;

public class WorkProduct extends BasicElement {

    public Collection<Action> action;
    public Collection<WorkProductManifest> workProductManifest;
    public Collection<LevelOfDetail> levelOfDetail;

}