// Generated from C:/Users/Alberto/OneDrive - Universidad Rey Juan Carlos/Documentos/Universidad - Sexto Curso/Segundo semestre/Procesadores de Lenguajes/Práctica Obligatoria/PracticaPL/src/TraductorPascal.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TraductorPascalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TraductorPascalVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#prg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrg(TraductorPascalParser.PrgContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#blq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlq(TraductorPascalParser.BlqContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#dcllist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcllist(TraductorPascalParser.DcllistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#sentlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentlist(TraductorPascalParser.SentlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl(TraductorPascalParser.DclContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#defcte}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefcte(TraductorPascalParser.DefcteContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#ctelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtelist(TraductorPascalParser.CtelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#simpvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpvalue(TraductorPascalParser.SimpvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#defvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefvar(TraductorPascalParser.DefvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#defvarlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefvarlist(TraductorPascalParser.DefvarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#varlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist(TraductorPascalParser.VarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#defproc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefproc(TraductorPascalParser.DefprocContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#deffun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeffun(TraductorPascalParser.DeffunContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#formal_paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_paramlist(TraductorPascalParser.Formal_paramlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#formal_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_param(TraductorPascalParser.Formal_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#tbas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTbas(TraductorPascalParser.TbasContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#sent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent(TraductorPascalParser.SentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#asig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsig(TraductorPascalParser.AsigContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(TraductorPascalParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(TraductorPascalParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#oparit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOparit(TraductorPascalParser.OparitContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(TraductorPascalParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#subparamlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubparamlist(TraductorPascalParser.SubparamlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#explist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplist(TraductorPascalParser.ExplistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#proc_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_call(TraductorPascalParser.Proc_callContext ctx);
}