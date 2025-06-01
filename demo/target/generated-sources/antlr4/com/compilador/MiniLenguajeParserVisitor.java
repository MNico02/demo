// Generated from com/compilador/MiniLenguajeParser.g4 by ANTLR 4.13.1
package com.compilador;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniLenguajeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniLenguajeParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(MiniLenguajeParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(MiniLenguajeParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(MiniLenguajeParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#declaracionVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionVariable(MiniLenguajeParser.DeclaracionVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#declaracionFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionFuncion(MiniLenguajeParser.DeclaracionFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(MiniLenguajeParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(MiniLenguajeParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(MiniLenguajeParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(MiniLenguajeParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(MiniLenguajeParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(MiniLenguajeParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(MiniLenguajeParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#declaracionFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionFor(MiniLenguajeParser.DeclaracionForContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#asignacionFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacionFor(MiniLenguajeParser.AsignacionForContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#actualizacionFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualizacionFor(MiniLenguajeParser.ActualizacionForContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#breakStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(MiniLenguajeParser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#continueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStmt(MiniLenguajeParser.ContinueStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(MiniLenguajeParser.RetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#llamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada(MiniLenguajeParser.LlamadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(MiniLenguajeParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expUnaria}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpUnaria(MiniLenguajeParser.ExpUnariaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expPostIncremento}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpPostIncremento(MiniLenguajeParser.ExpPostIncrementoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expDecimal}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpDecimal(MiniLenguajeParser.ExpDecimalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expPreIncremento}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpPreIncremento(MiniLenguajeParser.ExpPreIncrementoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expLlamada}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpLlamada(MiniLenguajeParser.ExpLlamadaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expParentesis}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpParentesis(MiniLenguajeParser.ExpParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expBinaria}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpBinaria(MiniLenguajeParser.ExpBinariaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expCaracter}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpCaracter(MiniLenguajeParser.ExpCaracterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expPostDecremento}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpPostDecremento(MiniLenguajeParser.ExpPostDecrementoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expEntero}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpEntero(MiniLenguajeParser.ExpEnteroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expPreDecremento}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpPreDecremento(MiniLenguajeParser.ExpPreDecrementoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expID}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpID(MiniLenguajeParser.ExpIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#operadorBinario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorBinario(MiniLenguajeParser.OperadorBinarioContext ctx);
}