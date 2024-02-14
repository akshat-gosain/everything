import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        // Java provides several Structures to store Data. Each structure has a specific ability and hence different uses.
        // All these come under the Java Collection Framework
        // Collection is an interface which has several methods which are implemented in concrete classes.
        // All the collections can contain various objects


        // ArrayList works quite similar to an Array

        // Creating an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // Displaying the elements of the ArrayList
        System.out.println("Fruits in the ArrayList: " + fruits);

        // Accessing elements by index
        System.out.println("First fruit: " + fruits.get(0));
        System.out.println("Second fruit: " + fruits.get(1));

        // Checking if an element is present in the ArrayList
        System.out.println("Contains 'Orange'? " + fruits.contains("Orange"));

        // Removing an element
        fruits.remove("Banana");
        System.out.println("After removing 'Banana': " + fruits);

        // Iterating through the ArrayList using a for-each loop
        System.out.println("Iterating through the ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Size of the ArrayList
        System.out.println("Size of the ArrayList: " + fruits.size());

        // Clearing the ArrayList
        fruits.clear();
        System.out.println("After clearing the ArrayList: " + fruits);

// ------------------------------------------------------------------------

        // Sets
        // Set is a child interface of Collection and has two concrete implementations, HashSet and TreeSet
        // The difference between a Set and ArrayList is that a set does not allow duplicates


        // Creating a HashSet of Strings
        Set<String> uniqueWords = new HashSet<>();
        // Here, the object created is of type HashSet which is typecasted to a Set


        // Can you do this ??
        //Set<String> uniqueWords2 = new Set<>();

        // Adding elements to the HashSet
        uniqueWords.add("Java");
        uniqueWords.add("Python");
        uniqueWords.add("C++");
        uniqueWords.add("JavaScript");
        uniqueWords.add("Java"); // Duplicate, won't be added

        // Displaying the elements of the HashSet
        System.out.println("\n\n\nUnique words in the HashSet: " + uniqueWords);

        // Checking if an element is present in the HashSet
        System.out.println("Contains 'Python'? " + uniqueWords.contains("Python"));

        // Removing an element
        uniqueWords.remove("C++");
        System.out.println("After removing 'C++': " + uniqueWords);

        // Iterating through the HashSet using a for-each loop
        System.out.println("Iterating through the HashSet:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }

        // Size of the HashSet
        System.out.println("Size of the HashSet: " + uniqueWords.size());

        // Clearing the HashSet
        uniqueWords.clear();
        System.out.println("After clearing the HashSet: " + uniqueWords);

// ------------------------------------------------------------------------

        // SortedSets
        // SortedSet is a subinterface of Set interface and has TreeSet as a concrete implementation
        // A SortedSet is similar to a Set but stores the elements in a sorted order

        // Creating a TreeSet of Integers
        SortedSet<Integer> sortedNumbers = new TreeSet<>();
        // Here, the object created is of type TreeSet which is typecasted to a SortedSet


        // Can you do this ??
        //SortedSet<Integer> sortedNumbers2 = new Set<>();


        // Adding elements to the TreeSet
        sortedNumbers.add(10);
        sortedNumbers.add(5);
        sortedNumbers.add(8);
        sortedNumbers.add(12);

        // Displaying the elements of the TreeSet (sorted automatically)
        System.out.println("\n\n\n\nSorted numbers in the TreeSet: " + sortedNumbers);

        // Checking if an element is present in the TreeSet
        System.out.println("Contains 8? " + sortedNumbers.contains(8));

        // Removing an element
        sortedNumbers.remove(5);
        System.out.println("After removing 5: " + sortedNumbers);

        // Iterating through the TreeSet using a for-each loop
        System.out.println("Iterating through the TreeSet:");
        for (Integer number : sortedNumbers) {
            System.out.println(number);
        }

        // Size of the TreeSet
        System.out.println("Size of the TreeSet: " + sortedNumbers.size());

        // Retrieving the first element in the TreeSet
        Integer firstElement = sortedNumbers.first();
        System.out.println("First element in the TreeSet: " + firstElement);

        // Clearing the TreeSet
        sortedNumbers.clear();
        System.out.println("After clearing the TreeSet: " + sortedNumbers);

// ----------------------------------------------------------------------------

        // Creating a TreeSet of Strings with a custom comparator for length
        SortedSet<String> sortedStrings = new TreeSet<>(new StringComparator());

        // Adding elements to the TreeSet
        sortedStrings.add("Apple");
        sortedStrings.add("Banana");
        sortedStrings.add("Orange");
        sortedStrings.add("Mango");
        // Displaying the elements of the TreeSet (sorted by length)
        System.out.println("\n\n\nSorted strings by length: " + sortedStrings);

// ----------------------------------------------------------------------------

        // Vector
        // Vectors are quite similar to ArrayLists

        // Creating a Vector of Strings
        Vector<String> vector = new Vector<>();

        // Adding elements to the Vector
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");
        vector.add("Mango");

        // Displaying the elements of the Vector
        System.out.println("\n\n\nElements in the Vector: " + vector);

        // Accessing elements by index
        System.out.println("First element: " + vector.get(0));
        System.out.println("Second element: " + vector.get(1));

        // Checking if an element is present in the Vector
        System.out.println("Contains 'Orange'? " + vector.contains("Orange"));

        // Removing an element
        vector.remove("Banana");
        System.out.println("After removing 'Banana': " + vector);

        // Iterating through the Vector using an Iterator
        System.out.println("Iterating through the Vector:");
        Iterator<String> iterator = vector.iterator();
        // iterator now points to the first element in the vector
        while(iterator.hasNext()) // continue while the iterator points to a valid element
        {
            System.out.println(iterator.next());    // print, and move to next element
        }

        // Size of the Vector
        System.out.println("Size of the Vector: " + vector.size());

        // Clearing the Vector
        vector.clear();
        System.out.println("After clearing the Vector: " + vector);

// ----------------------------------------------------------------------------

        // Maps
        // Maps are used to store key-value pairs.
        // Keys cannot repeat.

        // Creating a HashMap with Integer keys and String values
        Map<Integer, String> hashMap = new HashMap<>();
        // Map is an interface and HashMap is a concrete implementation


        // Adding key-value pairs to the HashMap
        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");
        hashMap.put(3, "Orange");
        hashMap.put(4, "Mango");

        // Displaying the key-value pairs of the HashMap
        System.out.println("\n\n\nKey-Value pairs in the HashMap: " + hashMap);

        // Accessing a value using a key
        System.out.println("Value for key 2: " + hashMap.get(2));

        // Checking if a key is present in the HashMap
        System.out.println("Contains key 3? " + hashMap.containsKey(3));

        // Checking if a value is present in the HashMap
        System.out.println("Contains value 'Banana'? " + hashMap.containsValue("Banana"));

        // Removing a key-value pair
        hashMap.remove(1);
        System.out.println("After removing key 1: " + hashMap);

        // Iterating through the HashMap using a for-each loop
        System.out.println("Iterating through the HashMap:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Size of the HashMap
        System.out.println("Size of the HashMap: " + hashMap.size());

        // Clearing the HashMap
        hashMap.clear();
        System.out.println("After clearing the HashMap: " + hashMap);

        System.out.println("\n\nHope You Will Have Fun in the Next Lab.");
    }
}