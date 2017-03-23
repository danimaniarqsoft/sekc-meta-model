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
package mx.infotec.dads.sekc.model.essence.view;

import java.util.*;

import mx.infotec.dads.sekc.model.essence.foundation.*;

/**
 * The Class FeatureSelection. A reference to a construct feature such as a
 * particular attribute or association.
 *
 * Invariant true
 * 
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @since essence 1.1
 */
public class FeatureSelection extends LanguageElement {

    /**
     * The feature name. The name of the referred feature, such as the name of
     * an attribute or the role name of an association.
     */
    public String featureName;

    /** The view selection. */
    public Collection<ViewSelection> viewSelection;

    /** The construct. */
    public LanguageElement construct;

}