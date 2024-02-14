
public class HeterogeneousDictionary {
	protected Record[] records; // Why not private or public?
	private int size = 0;
	private int count = 0;
	protected Ordering ordering = Ordering.NONE; // Why not private or public?
	// enum defined in Ordering.java. What does it do?

	public HeterogeneousDictionary(int initialSize) {
		records = new Record[initialSize];
		// Create an array of 'size' to store the records. Is this expandable?
		size = initialSize;
		count = 0;
	}
	public Record get(Object searchKey) { // Return the record with the given key
		for (Record record : records) {
			if (record!=null && record.compare(new Record(searchKey,searchKey))==Comparison.MATCHING) {
				// What happens if there are duplicate keys?
				return record;
			}
		}
		return null;
	}
	public Record getByIndex(int index) {
		return records[index];
	}

	public void put(Record record) { // Insert the given record into the dictionary, if possible (due to size)
		if (size > count) {
			records[count++] = record; // What would happen if we used ++count instead of count++? What changes do you
										// need to make, to allow ++count to work? Which files need to be changed?
		} else
			System.out.println("Size" + size + " not enough for holding an extra element after " + count + " count");
	}

	public Record remove(Object searchKey) {
		Record removed = null;
		Record searched = new Record(searchKey,null);
		for (int i=0; i<count; i++) { // Why not the for-each loop?
			if (searched.compare(records[i])==Comparison.MATCHING) {
				removed = records[i];
				records[i] = null;
				count--;
				break;
			}
		}
		return removed;
	}

	public int getSize() {
		// Why are we using a getSize method instead of just accessing the size field?
		// Try accessing size and see what happens.
		return size;
	}

	public int getLength() {
		return count;
	} // https://www.w3schools.com/java/java_encapsulation.asp

	public boolean isEmpty() {
		return count == 0;
	}

	public boolean isFull() {
		return count == size;
	}

	public void show() { // Can this method save the dictionary into a file?
		System.out.print("Printing Dictionary of " + size + " Size and " + count + " Occupancy:\n");
		for (int i = 0; i < count; i++) {
			System.out.println("Record "+ (i+1) + " : " + records[i].toString());
		}
		if(count < size)
		System.out.println("Empty records " + (count+1) + "--" + size + " :#");
	}
	
	public String toString() { // Why this method when we have the show() method above?
		String string=String.valueOf("Dictionary "+hashCode()+":\n");
		for (int i=0; i<count; i++) {
			if(records[i]==null) string=string+String.valueOf(i+": NULL#");
			else string=string+records[i].toString();
			string=string+String.valueOf("\n");
		}
		return string;
	}
}
