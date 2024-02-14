
public abstract class AbstractRecord {
	abstract public Object getKey();
	abstract public Object getValue();
	public String toString( ) {
		return "{Key: ["+getKey().toString()+"]; Value:["+getValue().toString()+"]}";
	}
	public Comparison compare(AbstractRecord another) {
		Object thisKey=getKey();
		Object otherKey=another.getKey();
		ComparableClassNames thisKeyTypeName = ComparableClassNames.valueOf(thisKey.getClass().getSimpleName());
		ComparableClassNames otherKeyTypeName = ComparableClassNames.valueOf(otherKey.getClass().getSimpleName());
		if(thisKeyTypeName != otherKeyTypeName) return Comparison.INCOMPARABLE; // Why this check?
		int comparisonResult;
		switch(thisKeyTypeName) { // What is the type of thisKeyTypeName?
			// WHy this switch at all? Why not the following?
			// comparisonResult = thisKeyTypeName.class.cast(thisKey).compareTo(thisKeyTypeName.class.cast(otherKey));
			case Integer:
						comparisonResult = Integer.class.cast(thisKey).compareTo(Integer.class.cast(otherKey));
						break;
			case Float:
						comparisonResult = Float.class.cast(thisKey).compareTo(Float.class.cast(otherKey));
						break;
			case Long:
						comparisonResult = Long.class.cast(thisKey).compareTo(Long.class.cast(otherKey));
						break;
			case Double:
						comparisonResult = Double.class.cast(thisKey).compareTo(Double.class.cast(otherKey));
						break;
			case String:
						comparisonResult = String.class.cast(thisKey).compareTo(String.class.cast(otherKey));
						break;
			default: return Comparison.INCOMPARABLE; // Is the default needed? What does it achieve?
		}
		switch(comparisonResult) {
			case 0: return Comparison.MATCHING;
			case -1: return Comparison.PREDECESSOR;
	  	case 1: return Comparison.SUCCESSOR;
			default: return Comparison.INCOMPARABLE;
		}
	}
}

enum ComparableClassNames { // How to add more types here? How many can be added?
	Integer,
	Float,
	Long,
	Double,
	String
}
