import java.lang.UnsupportedOperationException;

public class Outcast {
	// constructor takes a WordNet object
	public Outcast(WordNet wordnet) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	// given an array of WordNet nouns, return an outcast
	public String outcast(String[] nouns) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	// for unit testing of this class (such as the one below)
	public static void main(String[] args) {
	    WordNet wordnet = new WordNet(args[0], args[1]);
	    Outcast outcast = new Outcast(wordnet);
	    for (int t = 2; t < args.length; t++) {
	        In in = new In(args[t]);
	        String[] nouns = in.readAllStrings();
	        StdOut.println(args[t] + ": " + outcast.outcast(nouns));
	    }
	}
}