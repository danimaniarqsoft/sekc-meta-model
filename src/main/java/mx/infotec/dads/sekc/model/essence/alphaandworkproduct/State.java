package mx.infotec.dads.sekc.model.essence.alphaandworkproduct;

import mx.infotec.dads.sekc.model.essence.activityspaceandactivity.*;
import mx.infotec.dads.sekc.model.essence.foundation.*;

import java.util.*;

public class State extends LanguageElement {

	public Collection<Criterion> criterion;
	public Alpha alpha;
	public State predecessor;
	public Collection<Checkpoint> checkListItem;
	public State successor;
	public String name;
	public String description;

}