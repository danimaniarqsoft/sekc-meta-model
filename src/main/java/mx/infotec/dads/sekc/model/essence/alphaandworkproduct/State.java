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
package mx.infotec.dads.sekc.model.essence.alphaandworkproduct;

import mx.infotec.dads.sekc.model.essence.activityspaceandactivity.*;
import mx.infotec.dads.sekc.model.essence.foundation.*;

import java.util.*;

/**
 * <pre>
 * <b>Description: </b>
 * </pre>
 * 
 * The Class State. A specification of the state of progress of an alpha. The
 * state of an alpha is determined by evaluating checklist items.
 * 
 * <pre>
 * 
 * <b>Invariant:</b>
 * 
 * {@code
 * -- All checkpoints of a state must have different names
 * self.checkListItem->forAll(i1, i2 | i1 <> i2 implies i1.name <> i2.name)
 * 
 * -- A state may not be its own direct or indirect successor
 * self.allSuccessors()->excludes(self)
 * }
 * </pre>
 * 
 * <pre>
 * 
 * <b>Additional Operation:</b>
 * 
 * {@code
 * -- All successors of a state
 * context State::allSuccessors : Set(State)
 * body: Set{self.successor}->union(self.successor.allSuccessors())
 * }
 * </pre>
 * 
 * <pre>
 * 
 * <b>Semantics:</b>
 * 
 * A state expresses a situation in which all its associated checklist items are fulfilled. It is considered to be an important
 * and remarkable step in the lifecycle of an alpha.
 * </pre>
 *
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @since essence 1.1
 */
public class State {

}