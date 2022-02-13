package model;
import java.util.HashSet;
import java.util.Set;

public class SetArithmetic {
	public Set<String> union(Set<String> a, Set<String> b) {
		Set<String> union = new HashSet<String>(a);
		union.addAll(b);
		return union;
	}

	public Set<String> intersection(Set<String> a, Set <String> b) {
		Set<String> intersection = new HashSet<String>(a);
		intersection.retainAll(b);
		return intersection;
	}

	public Set<String> difference(Set<String> a, Set <String> b) {
		Set<String> difference = new HashSet<String>();
		a.removeAll(b);
		return difference;
	}

}
