package star.bytecode;

import gov.nasa.jpf.symbc.numeric.SymbolicInteger;
import gov.nasa.jpf.symbc.numeric.SymbolicReal;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import star.formula.Variable;
import star.formula.expression.Expression;
import star.formula.expression.VariableExpression;

public class ILOAD extends gov.nasa.jpf.jvm.bytecode.ILOAD {

	public ILOAD(int localVarIndex) {
		super(localVarIndex);
	}
	
	@Override
	public Instruction execute(ThreadInfo ti) {
		StackFrame sf = ti.getModifiableTopFrame();
		Object sym_v = sf.getLocalAttr(index);
		
		if (sym_v != null &&
				(sym_v instanceof SymbolicInteger || sym_v instanceof SymbolicReal)) {
			Expression exp = new VariableExpression(new Variable(sym_v.toString(), "int"));
			sf.setLocalAttr(index, exp);
		}
		
		return super.execute(ti);
	}

}
