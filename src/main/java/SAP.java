import java.lang.UnsupportedOperationException;

public class SAP {
	// constructor takes a digraph (not necessarily a DAG)
	public SAP(Digraph G) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	// length of shortest ancestral path between v and w; -1 if no such path
	public int length(int v, int w) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	// a common ancestor of v and w that participates in a shortest ancestral path; -1 if no such path
	public int ancestor(int v, int w) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	// length of shortest ancestral path between any vertex in v and any vertex in w; -1 if no such path
	public int length(Iterable<Integer> v, Iterable<Integer> w) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	// a common ancestor that participates in shortest ancestral path; -1 if no such path
	public int ancestor(Iterable<Integer> v, Iterable<Integer> w) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	// for unit testing of this class (such as the one below)
	public static void main(String[] args) {
	    In in = new In(args[0]);
	    Digraph G = new Digraph(in);
	    SAP sap = new SAP(G);
	    while (!StdIn.isEmpty()) {
	        int v = StdIn.readInt();
	        int w = StdIn.readInt();
	        int length   = sap.length(v, w);
	        int ancestor = sap.ancestor(v, w);
	        StdOut.printf("length = %d, ancestor = %d\n", length, ancestor);
	    }
	}
}