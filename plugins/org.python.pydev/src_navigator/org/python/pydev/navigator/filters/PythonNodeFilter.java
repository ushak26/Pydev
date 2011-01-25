/**
 * Copyright (c) 2005-2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the license.txt included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
package org.python.pydev.navigator.filters;

import org.eclipse.jface.viewers.Viewer;
import org.python.pydev.navigator.elements.PythonNode;

public class PythonNodeFilter extends AbstractFilter{

    @Override
    public boolean select(Viewer viewer, Object parentElement, Object element) {
        if(element instanceof PythonNode){
            return false;
        }
        return true;
    }

}
