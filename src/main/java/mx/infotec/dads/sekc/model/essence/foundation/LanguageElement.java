/*
 *  
 * The MIT License (MIT)
 * Copyright (c) 2016 Daniel Cortes Pichardo
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package mx.infotec.dads.sekc.model.essence.foundation;

import java.util.Collection;

import mx.infotec.dads.sekc.model.essence.view.*;

/**
 * Main Abstract superclass for all main concepts in Essence.
 * 
 * <p>
 * See <a href="http://www.omg.org/spec/Essence/1.1/"> The Essence - Kernel And
 * Language For SOftware Engineering Methods, Version 1.1</a> for more details
 * on the use of the language.
 *
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @see ViewSelection
 * @see FeatureSelection
 * @see ViewSelection
 * @see ExtensionElement
 * @see ElementGroup
 * @see PatternAssociation
 * @see Resource
 * @see EndeavorProperty
 * @see Tag
 * @since essence 1.1
 */
public abstract class LanguageElement {

    /** The view selection. */
    public Collection<ViewSelection> viewSelection;
    
    /** The feature selection. */
    public Collection<FeatureSelection> featureSelection;
    
    /** The extension. */
    public Collection<ExtensionElement> extension;
    
    /** The referrer. */
    public Collection<ElementGroup> referrer;
    
    /** The owner. */
    public ElementGroup owner;
    
    /** The pattern association. */
    public Collection<PatternAssociation> patternAssociation;
    
    /** The resource. */
    public Collection<Resource> resource;
    
    /** The properties. */
    public Collection<EndeavorProperty> properties;
    
    /** The tag. */
    public Collection<Tag> tag;
    
    /** The is suppressable. */
    public boolean isSuppressable = true;

}