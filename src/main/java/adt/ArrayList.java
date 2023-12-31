package adt;

/**
 * @author all
 * 
 */
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayList<T> implements AdtInterface<T>, Serializable,Iterable<T> {

    private T[] array;
    private int numberOfEntries;
    private static final int DEFAULT_CAPACITY = 5;

    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayList(int initialCapacity) {
        numberOfEntries = 0;
        array = (T[]) new Object[initialCapacity];
    }

    @Override
    public boolean add(T newEntry) {
        if (isArrayFull()) {
            doubleArray();
        }

        // Check if the entry already exists in the array (case-insensitive)
        for (int i = 0; i < numberOfEntries; i++) {
            if (array[i].toString().toLowerCase().equals(newEntry)) {
                System.out.println("Duplicated records found");
                return false;
            }
        }

        array[numberOfEntries] = newEntry;
        numberOfEntries++;
        return true;
    }

    @Override
    public boolean add(int newPosition, T newEntry) {
        boolean isSuccessful = true;

        if ((newPosition >= 1) && (newPosition <= numberOfEntries + 1)) {
            if (isArrayFull()) {
                doubleArray();
            }
            makeRoom(newPosition);
            array[newPosition - 1] = newEntry;
            numberOfEntries++;
        } else {
            isSuccessful = false;
        }

        return isSuccessful;
    }

    @Override
    public T remove(int givenPosition) {
        T result = null;

        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
            result = array[givenPosition - 1];

            if (givenPosition < numberOfEntries) {
                removeGap(givenPosition);
            }

            numberOfEntries--;
        }

        return result;
    }

    @Override
    public void clear() {
        numberOfEntries = 0;
    }

    @Override
    public boolean replace(int givenPosition, T newEntry) {
        boolean isSuccessful = true;

        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
            array[givenPosition - 1] = newEntry;
        } else {
            isSuccessful = false;
        }

        return isSuccessful;
    }

    @Override
    public T getEntry(int givenPosition) {
        T result = null;

        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
            result = array[givenPosition - 1];
        }

        return result;
    }

    @Override
    public boolean contains(T anEntry) {
        boolean found = false;
        for (int index = 0; !found && (index < numberOfEntries); index++) {
            if (anEntry.equals(array[index])) {
                found = true;
            }
        }
        return found;
    }
    

    @Override
    public int getNumberOfEntries() {
        return numberOfEntries;
    }

    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    private void doubleArray() {
        T[] oldArray = array;
        array = (T[]) new Object[oldArray.length * 2];
        for (int i = 0; i < oldArray.length; i++) {
            array[i] = oldArray[i];
        }
    }

    private boolean isArrayFull() {
        return numberOfEntries == array.length;
    }

    @Override
    public String toString() {
        String outputStr = "";
        for (int index = 0; index < numberOfEntries; ++index) {
            outputStr += array[index] + "\n";
        }

        return outputStr;
    }

    /**
     * Task: Makes room for a new entry at newPosition. Precondition: 1 <=
     * newPosition <= numberOfEntries + 1; numberOfEntries is array's
     * numberOfEntries before addition.
     */
    private void makeRoom(int newPosition) {
        int newIndex = newPosition - 1;
        int lastIndex = numberOfEntries - 1;

        // move each entry to next higher index, starting at end of
        // array and continuing until the entry at newIndex is moved
        for (int index = lastIndex; index >= newIndex; index--) {
            array[index + 1] = array[index];
        }
    }

    /**
     * Task: Shifts entries that are beyond the entry to be removed to the next
     * lower position. Precondition: array is not empty; 1 <= givenPosition <
     * numberOfEntries; numberOfEntries is array's numberOfEntries before
     * removal.
     */
    private void removeGap(int givenPosition) {
        // move each entry to next lower position starting at entry after the
        // one removed and continuing until end of array
        int removedIndex = givenPosition - 1;
        int lastIndex = numberOfEntries - 1;

        for (int index = removedIndex; index < lastIndex; index++) {
            array[index] = array[index + 1];
        }
    }
    @Override
    public void listAll() {
        System.out.println("\nList: \n=====================");
        if (numberOfEntries <= 0) {
            System.out.println(" No records available");
        } else {
            for (int i = 0; i < numberOfEntries; i++) {
                System.out.println(i + 1 + "." + array[i]);
            }
        }
        System.out.println("=====================");
    }

    @Override
    public boolean isExists(String newCode) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
//    public static void insertionSort(AdtInterface<T> list, Comparator<T> comparator) {
//    int n = list.size();
//    for (int i = 1; i < n; i++) {
//        Programme key = list.get(i);
//        int j = i - 1;
//
//        while (j >= 0 && comparator.compare(list.get(j), key) > 0) {
//            list.set(j + 1, list.get(j));
//            j = j - 1;
//        }
//        list.set(j + 1, key);
//    }
//}
    public static <T extends Comparable<T>> void insertionSort(AdtInterface<T> a, Comparator<T> comparator) {
        for (int unsorted = 1; unsorted < a.getNumberOfEntries(); unsorted++) {
            T firstUnsorted = a.getEntry(unsorted + 1);
            insertInOrder(firstUnsorted, a, unsorted, comparator);
        }
    }
    
    

    //inserts element at the correct index within thes sorted subarray
    private static <T extends Comparable<T>> int insertInOrder(T element, AdtInterface<T> a, int end, Comparator<T> comparator) {
        int index = end;

            while ((index > 0) && (comparator.compare(element, a.getEntry(index)) < 0)) {
                a.replace(index + 1, a.getEntry(index)); //shifting
                index--;
            }
 
        a.replace(index + 1, element);
        return 0;
    }




    @Override
    public Iterator<T> iterator() {
       return new ArrayListIterator();
    }
    
    private class ArrayListIterator implements Iterator<T> {
    private int currentIndex = 0;

    @Override
    public boolean hasNext() {
        return currentIndex < numberOfEntries;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T currentItem = array[currentIndex];
        currentIndex++;
        return currentItem;
    }
}

}