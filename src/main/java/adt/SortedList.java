/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package adt;

/**
 *
 * @author user
 */
public interface SortedList<T extends Comparable<? super T>> {

    /**
     * Adds a new entry to the sorted list such that the list remains sorted.
     * 
     * @param newEntry The object to be added.
     * @return True if the addition is successful, false if the list is full.
     */
    boolean add(T newEntry);

    /**
     * Removes the first or only occurrence of an entry from the sorted list.
     * 
     * @param anEntry The object to be removed.
     * @return True if the entry was located and removed, false if not found.
     */
    boolean remove(T anEntry);

    /**
     * Removes all entries from the list.
     */
    void clear();

    /**
     * Determines whether the list contains a specific entry.
     * 
     * @param anEntry The object to be checked for.
     * @return True if the entry is in the list, false if not found.
     */
    boolean contains(T anEntry);

    /**
     * Gets the number of entries currently in the list.
     * 
     * @return The number of entries in the list.
     */
    int getNumberOfEntries();

    /**
     * Determines whether the list is empty.
     * 
     * @return True if the list is empty, false if it contains entries.
     */
    boolean isEmpty();
}

