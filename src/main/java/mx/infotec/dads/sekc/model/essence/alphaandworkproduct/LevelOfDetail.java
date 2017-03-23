package mx.infotec.dads.sekc.model.essence.alphaandworkproduct;

import mx.infotec.dads.sekc.model.essence.activityspaceandactivity.*;
import mx.infotec.dads.sekc.model.essence.foundation.*;

import java.util.*;

public class LevelOfDetail extends LanguageElement {

	public Collection<Criterion> criterion;
	public LevelOfDetail predecessor;
	public WorkProduct workProduct;
	public LevelOfDetail successor;
	public Collection<Checkpoint> checkListItem;
	public String name;
	public boolean isSufficientLevel;
	public String description;

}