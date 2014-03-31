import java.lang.UnsupportedOperationException;

public class WordNet {
	// constructor takes the name of the two input files
	public WordNet(String synsets, String hypernyms) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	// the set of nouns (no duplicates), returned as an Iterable
	public Iterable<String> nouns() {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	// is the word a WordNet noun?
	public boolean isNoun(String word) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	// distance between nounA and nounB (defined below)
	public int distance(String nounA, String nounB) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	// a synset (second field of synsets.txt) that is the common ancestor of nounA and nounB
	// in a shortest ancestral path (defined below)
	public String sap(String nounA, String nounB) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	// for unit testing of this class
	public static void main(String[] args) {
		throw new UnsupportedOperationException("Not implemented yet");
	}
}