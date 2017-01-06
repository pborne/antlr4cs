/*
 * Copyright (c) 2012 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD-3-Clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.codegen.model;

import org.antlr.v4.codegen.OutputModelFactory;
import org.antlr.v4.tool.ast.ActionAST;

public class ArgAction extends Action {
	/** Context type of invoked rule */
	public String ctxType;
	public ArgAction(OutputModelFactory factory, ActionAST ast, String ctxType) {
		super(factory, ast);
		this.ctxType = ctxType;
	}
}
