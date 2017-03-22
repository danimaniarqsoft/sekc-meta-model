package mx.infotec.dads.sekc.userdefinedtypes;

import java.util.*;

import mx.infotec.dads.sekc.foundation.*;

public class UserDefinedType extends LanguageElement {

	public Collection<TypedResource> typedResource;
	public Collection<TypedPattern> typedPattern;
	public Collection<TypedTag> typedTag;
	public String name;
	public String description;
	public String constraint;

}