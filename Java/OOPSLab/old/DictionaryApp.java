import java.util.Scanner; // Why do we need this?

class DictionaryApp {
  // Provides only a main method for instantiating and demonstrating a dictionary
  public static void main(String args[]) {
    int size; // Maximum possible number of elements in the dictionary
    int count; // Current number of elements in the dictionary
    Scanner myScanner = new Scanner(System.in);

    System.out.print("Size of Dictionary: ");
    size = myScanner.nextInt(); // was size=Integer.parseInt(args[0]);

    System.out.print("Count of entries: ");
    count = myScanner.nextInt(); // was count=Integer.parseInt(args[1]);
    // What is the difference between size and count?

    System.out.println("Reading " + count + " elements into a dictionary of size " + size);
    MyDictionary d = new MyDictionary(size); // Create a dictionary of the given size

    for (int i = 0; i < count; i++) { // Insert each element into the dictionary
      double nextValue;
      System.out.print("Enter element: ");
      nextValue = myScanner.nextDouble();
      d.put(new Record((Object)nextValue));
    }
    myScanner.close(); // Is this necessary? What does this do? Can you use this instance Scanner
                       // again?
    d.show();
  }
}
