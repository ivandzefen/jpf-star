package tsafe;

import tsafe.LinkedList.Entry;
import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Driver_TS_R_repOK1 extends TestJPF {

	@Test
	public void test_repOK1() throws Exception {
		Driver_TS_R obj = new Driver_TS_R();
		TrajectorySynthesizer trajSynth = null;
		RouteTrack track = null;
		Route route = null;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(trajSynth,track,route);
	}

}

