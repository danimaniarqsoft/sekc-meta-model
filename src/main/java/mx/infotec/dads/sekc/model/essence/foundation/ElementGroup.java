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

import java.util.*;

import mx.infotec.dads.sekc.model.essence.GraphicalElement;

/**
 * The Class ElementGroup.
 *
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @since essence 1.1
 */
public abstract class ElementGroup extends LanguageElement {

    /** The merge resolution. */
    public Collection<MergeResolution> mergeResolution;
    
    /** The owned elements. */
    public Collection<LanguageElement> ownedElements;
    
    /** The referred elements. */
    public Collection<LanguageElement> referredElements;
    
    /** The extension. */
    public Collection<ExtensionElement> extension;
    
    /** The name. */
    public String name;
    
    /** The icon. */
    public GraphicalElement icon;
    
    /** The brief description. */
    public String briefDescription;
    
    /** The description. */
    public String description;

}