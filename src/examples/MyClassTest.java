import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Before;
import org.junit.Test;

import gov.nasa.jpf.star.precondition.Precondition;
import gov.nasa.jpf.star.precondition.PreconditionLexer;
import gov.nasa.jpf.star.precondition.PreconditionMap;
import gov.nasa.jpf.star.precondition.PreconditionParser;
import gov.nasa.jpf.star.predicate.InductivePred;
import gov.nasa.jpf.star.predicate.InductivePredLexer;
import gov.nasa.jpf.star.predicate.InductivePredMap;
import gov.nasa.jpf.star.predicate.InductivePredParser;
import gov.nasa.jpf.util.test.TestJPF;

@SuppressWarnings("deprecation")
public class MyClassTest extends TestJPF {
	
	private void initPredicate() {
		String pred = "pred sll(root,len) == root = null & len = 0 || root->Node(next) * sll(next,len1) & len = len1 + 1";
		
		ANTLRInputStream in = new ANTLRInputStream(pred);
		InductivePredLexer lexer = new InductivePredLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        InductivePredParser parser = new InductivePredParser(tokens);
        
        InductivePred[] ips = parser.preds().ips;
        InductivePredMap.put(ips);
	}
	
	private void initPrecondition() {
		String pre = "pre myMethod == sll(x,n)";
//		String pre = "pre myMethod2 == sll(x) & i < 100";
		
		ANTLRInputStream in = new ANTLRInputStream(pre);
		PreconditionLexer lexer = new PreconditionLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PreconditionParser parser = new PreconditionParser(tokens);
        
        Precondition[] ps = parser.pres().ps;
        PreconditionMap.put(ps);
	}
	
	@Before
	public void init() {
		initPredicate();
		initPrecondition();
	}
	
	@Test
	public void testMain() {
		if (verifyNoPropertyViolation(
//				"+listener=.symbc.SymbolicListener",
				"+listener=.star.StarListener",
				"+star.max_len_pc=6",
				"+star.min_int=-100",
				"+star.max_int=100",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+symbolic.method = MyClass.myMethod(sym)",
				"+symbolic.lazy=true")) {
			MyClass.main(null);
		}
	}
	
	@Test
	public void testMain1() {
		if (verifyNoPropertyViolation(
//				"+listener=.symbc.SymbolicListener",
				"+listener=.star.StarListener",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+symbolic.method = MyClass.myMethod1(sym#sym)",
				"+symbolic.lazy=true")) {
			MyClass.main(null);
		}
	}
	
	@Test
	public void testMain2() {
		if (verifyNoPropertyViolation(
//				"+listener=.symbc.SymbolicListener",
				"+listener=.star.StarListener",
//				"+star.min_int=-100",
//				"+star.max_int=100",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+symbolic.method = MyClass.myMethod2(sym)",
				"+symbolic.lazy=true")) {
			MyClass.main(null);
		}
	}

}
