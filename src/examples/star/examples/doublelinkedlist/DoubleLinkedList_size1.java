package star.examples.doublelinkedlist;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;
import star.examples.Utilities;
import star.examples.doublelinkedlist.DoubleLinkedList.Entry;

public class DoubleLinkedList_size1 extends TestJPF {

	@Test
	public void test_size1() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		obj.size = 0;
		obj.modCount = 0;
		Object ele_114 = null;
		obj.header.element = ele_114;
		obj.header.next = obj.header;
		obj.header.previous = obj.header;
		System.out.println(Utilities.repOK(obj));
		obj.size();
	}

}

