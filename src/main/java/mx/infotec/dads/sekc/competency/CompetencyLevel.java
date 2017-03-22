package mx.infotec.dads.sekc.competency;

import java.util.Collection;

import mx.infotec.dads.sekc.activityspaceandactivity.Activity;
import mx.infotec.dads.sekc.foundation.Checkpoint;
import mx.infotec.dads.sekc.foundation.LanguageElement;

public class CompetencyLevel extends LanguageElement {

    public Collection<Activity> activity;
    public Competency competency;
    public Collection<Checkpoint> checklistItem;
    public String name;
    public String briefDescription;
    public int level;

}