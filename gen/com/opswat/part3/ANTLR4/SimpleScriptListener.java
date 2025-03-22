// Generated from D:/workplace/opswat_assignment/OPSWAT Assignment/src/main/java/com/opswat/part3/ANTLR4/SimpleScript.g4 by ANTLR 4.13.2
package com.opswat.part3.ANTLR4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleScriptParser}.
 */
public interface SimpleScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleScriptParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(SimpleScriptParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleScriptParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(SimpleScriptParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleScriptParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(SimpleScriptParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleScriptParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(SimpleScriptParser.CommandContext ctx);
}