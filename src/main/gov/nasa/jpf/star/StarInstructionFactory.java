package gov.nasa.jpf.star;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.vm.Instruction;

public class StarInstructionFactory extends gov.nasa.jpf.symbc.SymbolicInstructionFactory {
	
	public StarInstructionFactory(Config conf) {
		super(conf);
	}

	@Override
	public Instruction aload(int localVarIndex) {
		System.out.println("aload");
		
	    return super.aload(localVarIndex);
	  }

}