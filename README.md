# Vodafone Java Phase 1 Assessment

## Program Capabilities
The proposed program has been built with the following features:
- Present a welcome screen containing the application name and creator details
- Present a root menu with the following options
   - List files - generate a formatted, alphabetically ordered list of files
   - File Operations sub-menu - options to add, delete, and search for files
- Option to quit the program

The File Operations menu will have the following features:	
- Add a new file to the system
- Search for a file in the system
- Delete a file in the system
- An option to quit this menu and return to the main menu

## Requirements for each feature

###### General Menu formatting
- Each menu item must be have a pre-pended alpha character for the user to use to select the menu option

###### List Files
- Present a formatted table containing a list of files in the system
- The list of files must be formatted alphabetically
```
+------------------------------------------------+
|                  Files Stored                  |
+------------------------------------------------+
| aaa                                            |
| bbb                                            |
| ccc                                            |
+------------------------------------------------+
```
- If there are no files in the system then a suitable message must be displayed:
```
+------------------------------------------------+
|                  Files Stored                  |
+------------------------------------------------+
| There are no files stored                      |
+------------------------------------------------+
```
## File Operations Option
- On selection of the file operations option the user must be presented with the file operations menu
- The file operations menu must have the root menu item it was accessed from as the first line
- The available menu options must be listed, indented from the first line

###### Adding a file to the system
- The user will be prompted to enter the name of the file to be added
- If the file is successfully added, the user will be presented with a list of files in the system
- The list of files will be formatted alphabetically

###### Searching for a file in the system
- The user will be prompted for a filename to search for
- If successful the system will state the file exists
- If unsuccessful the system will state the file does not exist

###### Deleting a file from the system
- The user will be presented with a prompt to enter the name of a file to delete
- On success a list of current files in the system will be displayed
- On failure (i.e. file could not be found) the user will be informed the specified file cannot be found.

## Data Structure
The main data structure used is an array. The implementation of the array is via a class - sortedArray. This is so that methods for sorting, deleting, and searching can be added.  

A linked list was contemplated as this would have given benefits in time/space complexity for inesertion and deletion. However, due to the expected number of sorting events it was felt that in the short term an array would be more efficient.

## Algorithms used
###### Sorting Algorithm
The sorting algorithm used is Merge Sort. This is so that if, in future the data structure is changed to a linked list, the sorting algorithm will still be efficient.  

###### Searching Algorithm
The searching algorithm used is binary search.

## Sprint Planning
The implementation of this demo program is relatively simple. Sprints will be as follows:

###### Sprint 1
 - Plan data structures and algorithms
 - Implement Welcome Banner
 - Implement primary menu
 - Implement list files
 - Implement output "printer"
###### Sprint 2
 - Implement sub-menu
 - Implement add files
 - Implement search files
 - Implement delete files
 
As this is using an Agile paradigm, acceptance tests are run at the time of code implementation. 

