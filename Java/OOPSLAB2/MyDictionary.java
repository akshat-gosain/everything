import java.util.*;

class MyDictionary {
  Scanner sc = new Scanner(System.in);

    private int[] arr;
    private int size = 0;
    private int count = 0;

    MyDictionary(int initialSize) {
        arr = new int[initialSize];
        size = initialSize;
        count = 0;
    }

    public void Insert(int elem) {
        if(size > count) {
            arr[count++] = elem;
            sort();  // Ensuring the array remains sorted after insertion
        } else {
            System.out.println("Size" + size + " not enough for holding an extra element after " + count + " count");
        }
    }

    public boolean delete() {
      System.out.println("Enter index of number to be deleted");
        int elem = sc.nextInt();
        int index = elem;
        if (index == -1) {
            return false;  // Element not found
        }
        for (int i = index; i < count - 1; i++) {
            arr[i] = arr[i+1];
        }
        count--;
        return true;
    }

    public boolean replace() {
      System.out.println("Enter oldelement followed by newelement");
        int oldElem = sc.nextInt();
        int newElem = sc.nextInt();
        int index = find(oldElem);
        if (index == -1) {
            return false;  // Old element not found
        }
        arr[index] = newElem;
        sort();  // Array needs to be re-sorted after replacement
        return true;
    }

    public int find(int elem) {
        for (int i = 0; i < count; i++) {
            if (arr[i] == elem) {
                return i;
            }
        }
        return -1;
    }

    public void sort() {
        java.util.Arrays.sort(arr, 0, count);  // Sorting only the filled part of the array
    }

    public void Show() {
        System.out.print("Printing Dictionary of " + size + " Size and " + count + " Occupancy:");
        for (int i = 0; i < count; i++) {
            System.out.print(" " + arr[i]);
        }
        for (int i = count; i < size; i++) {
            System.out.print(" .");
        }
        System.out.println("");

        
    }
}
