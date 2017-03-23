package mx.infotec.dads.sekc.model.essence.activityspaceandactivity;

import java.util.*;

import mx.infotec.dads.sekc.model.essence.competency.*;

public class Activity extends AbstractActivity {

    public Collection<Approach> approach;
    public Collection<Action> action;
    public Collection<CompetencyLevel> requiredCompetencyLevel;

}