package mx.infotec.dads.sekc.alphaandworkproduct;

import mx.infotec.dads.sekc.activityspaceandactivity.*;
import mx.infotec.dads.sekc.foundation.*;

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