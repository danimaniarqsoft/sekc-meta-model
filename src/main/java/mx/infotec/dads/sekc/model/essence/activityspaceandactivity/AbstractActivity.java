package mx.infotec.dads.sekc.model.essence.activityspaceandactivity;

import java.util.Collection;

import mx.infotec.dads.sekc.model.essence.foundation.BasicElement;

public abstract class AbstractActivity extends BasicElement {

    public Collection<ActivityAssociation> activityAssociation;
    public Collection<Criterion> criterion;

}