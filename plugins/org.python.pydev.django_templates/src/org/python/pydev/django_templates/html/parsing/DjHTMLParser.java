/**
 * Copyright (c) 2005-2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the license.txt included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
package org.python.pydev.django_templates.html.parsing;

import org.python.pydev.django_templates.IDjConstants;
import org.python.pydev.django_templates.comon.parsing.DjParser;

import com.aptana.editor.html.parsing.IHTMLParserConstants;

public class DjHTMLParser extends DjParser {

    public DjHTMLParser() {
        super(new DjHTMLParserScanner(), IHTMLParserConstants.LANGUAGE, IDjConstants.LANGUAGE_DJANGO_TEMPLATES_HTML);
    }

}
