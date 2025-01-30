package prog02;

import java.io.*;
import java.util.Objects;

/**
 * This is an implementation of PhoneDirectory that uses a sorted
 * array to store the entries.
 *
 * @author
 */
public class SortedPD extends ArrayBasedPD {

    /** Add an entry to the directory.
     @param index The index at which to add the entry to theDirectory.
     @param newEntry The new entry to add.
     @return The DirectoryEntry that was just added.
     */
    protected DirectoryEntry add (int index, DirectoryEntry newEntry) {
        if (size == theDirectory.length)
            reallocate();
        for(int x = size; x > index; x--){
            theDirectory[x] = theDirectory[x-1];
        }
        theDirectory[index] = newEntry;
        size++;
        return newEntry;
    }

    /** Find an entry in the directory.
     @param name The name to be found
     @return The index of the entry with that name or, if it is not
     there, the index where it should be added.
     */
    protected int find (String name) {
        int high, low;
        high = size;
        low = 0;
        while(low<high){
            int middle = (low + high) / 2;
            if(theDirectory[middle].getName().compareTo(name) < 0){
                low = middle + 1;
            }
            else{
                high = middle;
            }
        }
        return low;
    }

    /** Determine if name is located at index.
     @param index The index to be checked.
     @param name The name that might be located at that index.
     @return true if a DirectoryEntry with that name is located at
     that index.
     */
    protected boolean found (int index, String name) {
        return index < size && theDirectory[index].getName().equals(name);
    }

    /** Remove an entry from the directory.
     @param index The index in theDirectory of the entry to remove.
     @return The DirectoryEntry that was just removed.
     */
    protected DirectoryEntry remove (int index) {
        DirectoryEntry entry = theDirectory[index];
        for (int i = index + 1; i < size; i++) {
            theDirectory[i - 1] = theDirectory[i];
        }
        size--;
        return entry;
    }

}
