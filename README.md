OVERVIEW
This project implements a phone directory that allows users to store and manage contact information (name & phone number). The directory supports adding, removing, updating, and searching for contacts efficiently using different data structures.

PROJECT GOALS
*Implement a contact directory with different storage mechanisms.
*Support basic operations like add, remove, lookup, and update.
*Provide a Graphical User Interface (GUI) and Console-based interface.

FEATURES
Phone Directory Operations
*Add/Change Entry: Adds a new contact or updates an existing contact’s number.
*Look Up Entry: Searches for a contact’s phone number.
*Remove Entry: Deletes a contact from the directory.
*Save Directory: Saves contacts to a file (csc220.txt).
User Interface Options
*GUI Mode: Uses a graphical interface (GUI.java).
*Console Mode: Uses text-based command-line interaction (ConsoleUI.java).
Storage Implementations
*Unsorted Array (ArrayBasedPD.java)
*Sorted Array (SortedPD.java)

DATA STRUCTURES USED
*Array → Stores contact entries.
*Binary Search (for sorted arrays) → Speeds up searching.
*String Operations → Handles name-based lookups.

IMPLEMENTATION DETAILS
*Phone Directory Management 
*addOrChangeEntry(String name, String number) → Adds a new contact or updates an existing one.
*lookupEntry(String name) → Retrieves a contact’s number.
*removeEntry(String name) → Removes a contact from the directory.
*save() → Saves contacts to a file.
Storage Implementations
*Unsorted Array-Based Directory (ArrayBasedPD)
*Stores entries in an unsorted list.
*Uses linear search for lookups.
*Sorted Array-Based Directory (SortedPD)
*Maintains entries in sorted order.
*Uses binary search for efficient lookups.
