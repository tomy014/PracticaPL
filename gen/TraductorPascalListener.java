// Generated from C:/Users/alber/OneDrive - Universidad Rey Juan Carlos/Documentos/Universidad - Sexto Curso/Segundo semestre/Procesadores de Lenguajes/Práctica Obligatoria/PracticaPL/src/TraductorPascal.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TraductorPascalParser}.
 */
public interface TraductorPascalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TraductorPascalParser#prg}.
	 * @param ctx the parse tree
	 */
	void enterPrg(TraductorPascalParser.PrgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorPascalParser#prg}.
	 * @param ctx the parse tree
	 */
	void exitPrg(TraductorPascalParser.PrgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorPascalParser#blq}.
	 * @param ctx the parse tree
	 */
	void enterBlq(TraductorPascalParser.BlqContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorPascalParser#blq}.
	 * @param ctx the parse tree
	 */
	void exitBlq(TraductorPascalParser.BlqContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorPascalParser#dcllist}.
	 * @param ctx the parse tree
	 */
	void enterDcllist(TraductorPascalParser.DcllistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorPascalParser#dcllist}.
	 * @param ctx the parse tree
	 */
	void exitDcllist(TraductorPascalParser.DcllistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorPascalParser#dcllistP}.
	 * @param ctx the parse tree
	 */
	void enterDcllistP(TraductorPascalParser.DcllistPContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorPascalParser#dcllistP}.
	 * @param ctx the parse tree
	 */
	void exitDcllistP(TraductorPascalParser.DcllistPContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorPascalParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void enterSentlist(TraductorPascalParser.SentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorPascalParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void exitSentlist(TraductorPascalParser.SentlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorPascalParser#sentlistP}.
	 * @param ctx the parse tree
	 */
	void enterSentlistP(TraductorPascalParser.SentlistPContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorPascalParser#sentlistP}.
	 * @param ctx the parse tree
	 */
	void exitSentlistP(TraductorPascalParser.SentlistPContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorPascalParser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterDcl(TraductorPascalParser.DclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorPascalParser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitDcl(TraductorPascalParser.DclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorPascalParser#defcte}.
	 * @param ctx the parse tree
	 */
	void enterDefcte(TraductorPascalParser.DefcteContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorPascalParser#defcte}.
	 * @param ctx the parse tree
	 */
	void exitDefcte(TraductorPascalParser.DefcteContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorPascalParser#ctelist}.
	 * @param ctx the parse tree
	 */
	void enterCtelist(TraductorPascalParser.CtelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorPascalParser#ctelist}.
	 * @param ctx the parse tree
	 */
	void exitCtelist(TraductorPascalParser.CtelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorPascalParser#ctelistP}.
	 * @param ctx the parse tree
	 */
	void enterCtelistP(TraductorPascalParser.CtelistPContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorPascalParser#ctelistP}.
	 * @param ctx the parse tree
	 */
	void exitCtelistP(TraductorPascalParser.CtelistPContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorPascalParser#simpvalue}.
	 * @param ctx the parse tree
	 */
	void enterSimpvalue(TraductorPascalParser.SimpvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorPascalParser#simpvalue}.
	 * @param ctx the parse tree
	 */
	void exitSimpvalue(TraductorPascalParser.SimpvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorPascalParser#defvar}.
	 * @param ctx the parse tree
	 */
	void enterDefvar(TraductorPascalParser.DefvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorPascalParser#defvar}.
	 * @param ctx the parse tree
	 */
	void exitDefvar(TraductorPascalParser.DefvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorPascalParser#defvarlist}.
	 * @param ctx the parse tree
	 */
	void enterDefvarlist(TraductorPascalParser.DefvarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorPascalParser#defvarlist}.
	 * @param ctx the parse tree
	 */
	void exitDefvarlist(TraductorPascalParser.DefvarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorPascalParser#defvarlistP}.
	 * @param ctx the parse tree
	 */
	void enterDefvarlistP(TraductorPascalParser.DefvarlistPContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorPascalParser#defvarlistP}.
	 * @param ctx the parse tree
	 */
	void exitDefvarlistP(TraductorPascalParser.DefvarlistPContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorPascalParser#varlist}.
	 * @param ctx the parse tree
	 */
	void enterVarlist(TraductorPascalParser.VarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorPascalParser#varlist}.
	 * @param ctx the parse tree
	 */
	void exitVarlist(TraductorPascalParser.VarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorPascalParser#varlistP}.
	 * @param ctx the parse tree
	 */
	void enterVarlistP(TraductorPascalParser.VarlistPContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorPascalParser#varlistP}.
	 * @param ctx the parse tree
	 */
	void exitVarlistP(TraductorPascalParser.VarlistPContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorPascalParser#defproc}.
	 * @param ctx the parse tree
	 */
	void enterDefproc(TraductorPascalParser.DefprocContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorPascalParser#defproc}.
	 * @param ctx the parse tree
	 */
	void exitDefproc(TraductorPascalParser.DefprocContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorPascalParser#deffun}.
	 * @param ctx the parse tree
	 */
	void enterDeffun(TraductorPascalParser.DeffunContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorPascalParser#deffun}.
	 * @param ctx the parse tree
	 */
	void exitDeffun(TraductorPascalParser.DeffunContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorPascalParser#formal_paramlist}.
	 * @param ctx the parse tree
	 */
	void enterFormal_paramlist(TraductorPascalParser.Formal_paramlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorPascalParser#formal_paramlist}.
	 * @param ctx the parse tree
	 */
	void exitFormal_paramlist(TraductorPascalParser.Formal_paramlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorPascalParser#formal_param_tail}.
	 * @param ctx the parse tree
	 */
	void enterFormal_param_tail(TraductorPascalParser.Formal_param_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorPascalParser#formal_param_tail}.
	 * @param ctx the parse tree
	 */
	void exitFormal_param_tail(TraductorPascalParser.Formal_param_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorPascalParser#formal_param}.
	 * @param ctx the parse tree
	 */
	void enterFormal_param(TraductorPascalParser.Formal_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorPascalParser#formal_param}.
	 * @param ctx the parse tree
	 */
	void exitFormal_param(TraductorPascalParser.Formal_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorPascalParser#tbas}.
	 * @param ctx the parse tree
	 */
	void enterTbas(TraductorPascalParser.TbasContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorPascalParser#tbas}.
	 * @param ctx the parse tree
	 */
	void exitTbas(TraductorPascalParser.TbasContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorPascalParser#sent}.
	 * @param ctx the parse tree
	 */
	void enterSent(TraductorPascalParser.SentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorPascalParser#sent}.
	 * @param ctx the parse tree
	 */
	void exitSent(TraductorPascalParser.SentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorPascalParser#asig}.
	 * @param ctx the parse tree
	 */
	void enterAsig(TraductorPascalParser.AsigContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorPascalParser#asig}.
	 * @param ctx the parse tree
	 */
	void exitAsig(TraductorPascalParser.AsigContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorPascalParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(TraductorPascalParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorPascalParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(TraductorPascalParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorPascalParser#exp_tail}.
	 * @param ctx the parse tree
	 */
	void enterExp_tail(TraductorPascalParser.Exp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorPascalParser#exp_tail}.
	 * @param ctx the parse tree
	 */
	void exitExp_tail(TraductorPascalParser.Exp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorPascalParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(TraductorPascalParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorPascalParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(TraductorPascalParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorPascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(TraductorPascalParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorPascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(TraductorPascalParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorPascalParser#subparamlist}.
	 * @param ctx the parse tree
	 */
	void enterSubparamlist(TraductorPascalParser.SubparamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorPascalParser#subparamlist}.
	 * @param ctx the parse tree
	 */
	void exitSubparamlist(TraductorPascalParser.SubparamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorPascalParser#explist}.
	 * @param ctx the parse tree
	 */
	void enterExplist(TraductorPascalParser.ExplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorPascalParser#explist}.
	 * @param ctx the parse tree
	 */
	void exitExplist(TraductorPascalParser.ExplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorPascalParser#explist_tail}.
	 * @param ctx the parse tree
	 */
	void enterExplist_tail(TraductorPascalParser.Explist_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorPascalParser#explist_tail}.
	 * @param ctx the parse tree
	 */
	void exitExplist_tail(TraductorPascalParser.Explist_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorPascalParser#proc_call}.
	 * @param ctx the parse tree
	 */
	void enterProc_call(TraductorPascalParser.Proc_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorPascalParser#proc_call}.
	 * @param ctx the parse tree
	 */
	void exitProc_call(TraductorPascalParser.Proc_callContext ctx);
}