// Generated from C:/Users/alber/OneDrive - Universidad Rey Juan Carlos/Documentos/Universidad - Sexto Curso/Segundo semestre/Procesadores de Lenguajes/Práctica Obligatoria/PracticaPL/src/TraductorPascal.g4 by ANTLR 4.13.2
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
	 * Visit a parse tree produced by {@link TraductorPascalParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(TraductorPascalParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#libreria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibreria(TraductorPascalParser.LibreriaContext ctx);
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
	 * Visit a parse tree produced by {@link TraductorPascalParser#ctelistP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtelistP(TraductorPascalParser.CtelistPContext ctx);
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
	 * Visit a parse tree produced by {@link TraductorPascalParser#defvarlistP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefvarlistP(TraductorPascalParser.DefvarlistPContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#varlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist(TraductorPascalParser.VarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#varlistP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlistP(TraductorPascalParser.VarlistPContext ctx);
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
	 * Visit a parse tree produced by {@link TraductorPascalParser#formal_param_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_param_tail(TraductorPascalParser.Formal_param_tailContext ctx);
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
	 * Visit a parse tree produced by {@link TraductorPascalParser#sentlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentlist(TraductorPascalParser.SentlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#sentlistP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentlistP(TraductorPascalParser.SentlistPContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#sent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent(TraductorPascalParser.SentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#blq_or_sent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlq_or_sent(TraductorPascalParser.Blq_or_sentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(TraductorPascalParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(TraductorPascalParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#repeat_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat_stmt(TraductorPascalParser.Repeat_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(TraductorPascalParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#inc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc(TraductorPascalParser.IncContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#expcond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpcond(TraductorPascalParser.ExpcondContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#oplog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOplog(TraductorPascalParser.OplogContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#factorcond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorcond(TraductorPascalParser.FactorcondContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#opcomp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcomp(TraductorPascalParser.OpcompContext ctx);
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
	 * Visit a parse tree produced by {@link TraductorPascalParser#exp_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_tail(TraductorPascalParser.Exp_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(TraductorPascalParser.OpContext ctx);
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
	 * Visit a parse tree produced by {@link TraductorPascalParser#explist_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplist_tail(TraductorPascalParser.Explist_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorPascalParser#proc_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_call(TraductorPascalParser.Proc_callContext ctx);
}