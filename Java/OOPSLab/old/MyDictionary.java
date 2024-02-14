class MyDictionary {
	// Main Driver Method (optional in our modular design)
	public static void main(String args[]) { // Used to ensure that the user does not use the class directly. Why is
												// this done?
		System.out.println(
				"The best way to use this type is to run another app main and instantiate a dictionary in it.");
	}

	// Where is the data stored? How is it stored?
	// Where is Record defined?
	private Record[] records; // Why is this private? Would it work if it were public? Why?
	private int size = 0;
	private int count = 0;
	private Ordering ordering = Ordering.NONE; // enum defined in Ordering.java. What does it do?

	MyDictionary(int initialSize) { // Constructor
		records = new Record[initialSize]; // Create an array of 'size' to store the records
		size = initialSize;
		count = 0;
	}

	public Record get(AbstractRecord keyRecord) { // Return the record with the given key
		for (Record record : records) {
			if (record.compare(keyRecord)==Comparison.MATCHING)
        // What happens if there are duplicate keys?
				return record;
		}
		return null;
	}

	public void put(Record record) {
    // Insert the given record into the dictionary, if possible (due to size)
		if (size > count) {
			records[count++] = record;
      // What would happen if we used ++count instead of count++? What changes do you
			//   need to make, to allow ++count to work? Which files need to be changed?
		}
    else
			System.out.println("Size" + size + " not enough for holding an extra element after " + count + " count");
	}

	public Record remove(AbstractRecord keyRecord) {
    // Remove the record with the given key. What happens if there are duplicate
		//   keys?
		Record removed = null;
		int index = 0;
		boolean found = false;
		for (Record record : records) { // How does this for loop work?
			if (record.compare(keyRecord)==Comparison.MATCHING) {
            // Where are we setting the key variable/field for a given record?
				removed = record;
				found = true;
				break;
			}
			index++;
		}
		if (found) {
			for (int i = index; i < records.length - 1; i++)
				records[i] = records[i + 1];
			count = count - 1; // Why is count decremented? Why not size?
			return removed;
		}
    else
			return null;
	}

	public int getSize() {
    // Why are we using a getSize method instead of just accessing the size field?
		//   Try accessing size and see what happens.
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

	public void show() {
		System.out.print("Printing Dictionary of " + size + " Size and " + count + " Occupancy:\n");
		for (int i = 0; i < count; i++) {
			System.out.print(i + " : ");
			records[i].show(); // What does this method do? Where is it defined?
			System.out.println();
		}
		for (int i = count; i < size; i++) { // What does this loop do? Why is it needed?
			System.out.print(i + " :#\n");
		}
		System.out.println("");
	}
}

