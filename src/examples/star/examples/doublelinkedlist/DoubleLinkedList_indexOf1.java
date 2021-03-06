package star.examples.doublelinkedlist;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;
import star.examples.Utilities;
import star.examples.doublelinkedlist.DoubleLinkedList.Entry;

public class DoubleLinkedList_indexOf1 extends TestJPF {

	@Test
	public void test_indexOf1() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Object o = null;
		Entry this_header_112 = obj.header;
		obj.size = 0;
		obj.modCount = 0;
		Object ele_1 = null;
		obj.header.element = ele_1;
		obj.header.next = obj.header;
		obj.header.previous = this_header_112;
		System.out.println(Utilities.repOK(obj));
		obj.indexOf(o);
	}

	@Test
	public void test_indexOf2() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Object o = null;
		Entry prev_3 = next_2;
		Object ele_4 = null;
		Entry this_header_112 = obj.header;
		obj.size = 1;
		obj.modCount = 0;
		Object ele_1 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_4;
		next_2.next = obj.header;
		next_2.previous = this_header_112;
		System.out.println(Utilities.repOK(obj));
		obj.indexOf(o);
	}

	@Test
	public void test_indexOf3() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Object o = null;
		Entry prev_3 = next_2;
		Entry this_header_112 = obj.header;
		obj.size = 1;
		Object ele_4 = new Object();
		obj.modCount = 0;
		Object ele_1 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_4;
		next_2.next = obj.header;
		next_2.previous = this_header_112;
		System.out.println(Utilities.repOK(obj));
		obj.indexOf(o);
	}

	@Test
	public void test_indexOf4() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry next_5 = new Entry();
		Object o = null;
		Object ele_4 = null;
		Entry next_112 = next_2;
		Entry this_header_113 = obj.header;
		Entry prev_114 = next_5;
		obj.size = 2;
		Entry prev_3 = prev_114;
		obj.modCount = 0;
		Object ele_1 = null;
		Object ele_143 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_4;
		next_2.next = next_5;
		next_2.previous = obj.header;
		next_5.element = ele_143;
		next_5.next = this_header_113;
		next_5.previous = next_112;
		System.out.println(Utilities.repOK(obj));
		obj.indexOf(o);
	}

	@Test
	public void test_indexOf5() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry this_header_112 = obj.header;
		obj.size = 0;
		Object o = new Object();
		obj.modCount = 0;
		Object ele_1 = null;
		obj.header.element = ele_1;
		obj.header.next = obj.header;
		obj.header.previous = this_header_112;
		System.out.println(Utilities.repOK(obj));
		obj.indexOf(o);
	}

	@Test
	public void test_indexOf6() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry prev_3 = next_2;
		Entry this_header_112 = obj.header;
		obj.size = 1;
		Object o = new Object();
		Object ele_4 = o;
		obj.modCount = 0;
		Object ele_1 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_4;
		next_2.next = obj.header;
		next_2.previous = this_header_112;
		System.out.println(Utilities.repOK(obj));
		obj.indexOf(o);
	}

	@Test
	public void test_indexOf7() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry prev_3 = next_2;
		Entry this_header_112 = obj.header;
		obj.size = 1;
		Object o = new Object();
		Object ele_4 = new Object();
		obj.modCount = 0;
		Object ele_1 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_4;
		next_2.next = obj.header;
		next_2.previous = this_header_112;
		System.out.println(Utilities.repOK(obj));
		obj.indexOf(o);
	}

	@Test
	public void test_indexOf8() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry next_5 = new Entry();
		Entry next_112 = next_2;
		Entry this_header_113 = obj.header;
		Entry prev_114 = next_5;
		obj.size = 2;
		Entry prev_3 = prev_114;
		Object o = new Object();
		Object ele_4 = o;
		obj.modCount = 0;
		Object ele_1 = null;
		Object ele_142 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_4;
		next_2.next = next_5;
		next_2.previous = obj.header;
		next_5.element = ele_142;
		next_5.next = this_header_113;
		next_5.previous = next_112;
		System.out.println(Utilities.repOK(obj));
		obj.indexOf(o);
	}

}

