
public class MyClass {
	
	public Node foo(Node x) {
		if (x == null) {
			return null;
		} else {
			x = x.next;
			if (x == null)
				return x;
			else
				return x.next;
		}
	}

	public Node foo1(Node x, Node y) {
		if (x == y) {
			return x;
		} else {
			return x.next;
		}
	}
	
	public Node myMethod(Node x) {
//		return foo(x);
//		return foo1(x, x.next);
		while (x != null) {
			x = x.next;
		}
		
		return x;
		
//		if (x == null) {
//			return null;
//		} else {
//			x = x.next;
//			if (x == null)
//				return x;
//			else
//				return x.next;
//		}
	}
	
	public Node myMethod1(Node x, Node y) {
		if (x != y) {
			return null;
		} else {
			Node z = y.next;
			if (z == null) {
				return null;
			} else {
				return x;
			}
		}
	}
	
	public Node myMethod2(int i) {
		if (i - 1 > 0) {
			return null;
		} else {
			return null;
		}
	}

	// The test driver
	public static void main(String[] args) {
		MyClass mc = new MyClass();
//		Node x = new Node();
//		Node y = new Node();
//		mc.myMethod(x);
		int i = 0;
		mc.myMethod2(i);
//		mc.myMethod1(x, y);
	}

}

class Node {
	Node next;
}
