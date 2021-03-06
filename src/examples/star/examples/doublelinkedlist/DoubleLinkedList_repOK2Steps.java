package star.examples.doublelinkedlist;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;
import star.examples.Utilities;
import star.examples.doublelinkedlist.DoubleLinkedList.Entry;

public class DoubleLinkedList_repOK2Steps extends TestJPF {

	@Test
	public void test_repOK1() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = null;
		obj.modCount = 0;
		obj.size = 0;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK2() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = null;
		obj.modCount = 0;
		obj.size = 0;
		Object element_1 = null;
		Entry previous_3 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

}

