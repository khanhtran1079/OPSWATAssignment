// Generated from D:/workplace/opswat_assignment/OPSWAT Assignment/src/main/java/com/opswat/part3/ANTLR4/SimpleScript.g4 by ANTLR 4.13.2
package com.opswat.part3.ANTLR4;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link SimpleScriptVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
@SuppressWarnings("CheckReturnValue")
public class SimpleScriptBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements SimpleScriptVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitScript(SimpleScriptParser.ScriptContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitCommand(SimpleScriptParser.CommandContext ctx) { return visitChildren(ctx); }
}