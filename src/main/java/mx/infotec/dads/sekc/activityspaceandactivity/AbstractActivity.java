package mx.infotec.dads.sekc.activityspaceandactivity;

import java.util.Collection;

import mx.infotec.dads.sekc.foundation.BasicElement;

public abstract class AbstractActivity extends BasicElement {

    public Collection<ActivityAssociation> activityAssociation;
    public Collection<Criterion> criterion;

}