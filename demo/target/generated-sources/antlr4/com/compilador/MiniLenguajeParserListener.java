// Generated from com/compilador/MiniLenguajeParser.g4 by ANTLR 4.13.1
package com.compilador;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniLenguajeParser}.
 */
public interface MiniLenguajeParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(MiniLenguajeParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(MiniLenguajeParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(MiniLenguajeParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(MiniLenguajeParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(MiniLenguajeParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(MiniLenguajeParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#declaracionVariable}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionVariable(MiniLenguajeParser.DeclaracionVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#declaracionVariable}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionVariable(MiniLenguajeParser.DeclaracionVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#declaracionFuncion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionFuncion(MiniLenguajeParser.DeclaracionFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#declaracionFuncion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionFuncion(MiniLenguajeParser.DeclaracionFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(MiniLenguajeParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(MiniLenguajeParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(MiniLenguajeParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(MiniLenguajeParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(MiniLenguajeParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(MiniLenguajeParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(MiniLenguajeParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(MiniLenguajeParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(MiniLenguajeParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(MiniLenguajeParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(MiniLenguajeParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(MiniLenguajeParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(MiniLenguajeParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(MiniLenguajeParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#declaracionFor}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionFor(MiniLenguajeParser.DeclaracionForContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#declaracionFor}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionFor(MiniLenguajeParser.DeclaracionForContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#asignacionFor}.
	 * @param ctx the parse tree
	 */
	void enterAsignacionFor(MiniLenguajeParser.AsignacionForContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#asignacionFor}.
	 * @param ctx the parse tree
	 */
	void exitAsignacionFor(MiniLenguajeParser.AsignacionForContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#actualizacionFor}.
	 * @param ctx the parse tree
	 */
	void enterActualizacionFor(MiniLenguajeParser.ActualizacionForContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#actualizacionFor}.
	 * @param ctx the parse tree
	 */
	void exitActualizacionFor(MiniLenguajeParser.ActualizacionForContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(MiniLenguajeParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(MiniLenguajeParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#continueStmt}.
	 * @param ctx the parse tree
	 */
	void enterContinueStmt(MiniLenguajeParser.ContinueStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#continueStmt}.
	 * @param ctx the parse tree
	 */
	void exitContinueStmt(MiniLenguajeParser.ContinueStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(MiniLenguajeParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(MiniLenguajeParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#llamada}.
	 * @param ctx the parse tree
	 */
	void enterLlamada(MiniLenguajeParser.LlamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#llamada}.
	 * @param ctx the parse tree
	 */
	void exitLlamada(MiniLenguajeParser.LlamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(MiniLenguajeParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(MiniLenguajeParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expUnaria}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpUnaria(MiniLenguajeParser.ExpUnariaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expUnaria}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpUnaria(MiniLenguajeParser.ExpUnariaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expPostIncremento}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpPostIncremento(MiniLenguajeParser.ExpPostIncrementoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expPostIncremento}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpPostIncremento(MiniLenguajeParser.ExpPostIncrementoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expDecimal}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpDecimal(MiniLenguajeParser.ExpDecimalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expDecimal}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpDecimal(MiniLenguajeParser.ExpDecimalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expPreIncremento}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpPreIncremento(MiniLenguajeParser.ExpPreIncrementoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expPreIncremento}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpPreIncremento(MiniLenguajeParser.ExpPreIncrementoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expLlamada}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpLlamada(MiniLenguajeParser.ExpLlamadaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expLlamada}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpLlamada(MiniLenguajeParser.ExpLlamadaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expParentesis}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpParentesis(MiniLenguajeParser.ExpParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expParentesis}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpParentesis(MiniLenguajeParser.ExpParentesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expBinaria}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpBinaria(MiniLenguajeParser.ExpBinariaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expBinaria}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpBinaria(MiniLenguajeParser.ExpBinariaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expCaracter}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpCaracter(MiniLenguajeParser.ExpCaracterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expCaracter}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpCaracter(MiniLenguajeParser.ExpCaracterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expPostDecremento}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpPostDecremento(MiniLenguajeParser.ExpPostDecrementoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expPostDecremento}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpPostDecremento(MiniLenguajeParser.ExpPostDecrementoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expEntero}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpEntero(MiniLenguajeParser.ExpEnteroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expEntero}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpEntero(MiniLenguajeParser.ExpEnteroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expPreDecremento}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpPreDecremento(MiniLenguajeParser.ExpPreDecrementoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expPreDecremento}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpPreDecremento(MiniLenguajeParser.ExpPreDecrementoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expID}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpID(MiniLenguajeParser.ExpIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expID}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpID(MiniLenguajeParser.ExpIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#operadorBinario}.
	 * @param ctx the parse tree
	 */
	void enterOperadorBinario(MiniLenguajeParser.OperadorBinarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#operadorBinario}.
	 * @param ctx the parse tree
	 */
	void exitOperadorBinario(MiniLenguajeParser.OperadorBinarioContext ctx);
}