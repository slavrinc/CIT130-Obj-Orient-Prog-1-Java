# CIT130-Obj-Orient-Prog-1-Java
Assignments from CIT130 - Object Oriented Programming - Java

Assignment Prompt: 
Make 2 classes WrapperShallow and WrapperDeep.
Each class shallow and deep are simply wrapper classes to hold a private array variable. int[] a;
The default constructor for each class should initialize “a”.
Each class should have a toString() and equals().
Each class should have a setArray method that allows you to set the “a” variable.
WrapperShallow should have an invalid copy constructor.
  public WrapperShallow(WrapperShallow ws){
    a = ws.a;
    }
WrapperDeep should have a properly functioning copy constructor.
  public WrapperDeep(WrapperDeep ws){
    a = new int[3];
    for(int i = 0; i < 3; i++)
    a[i]=ws.a[i];
    }
Think about why shallow is wrong and deep is correct! What happens to the old “a” in the WrapperDeep copy
constructor? (think garbage collection)

Example Output:

--------------------Configuration: <Default>--------------------
**** TESTING SHALLOW OBJECTS ****
inital shallow object contains
7 17 77
copy shallow object contains
7 17 77
inital shallow object changed to
13 14 15
copy shallow object not changed contains
13 14 15
WOOPS! ws.equals(ws2) is true
**** TESTING DEEP OBJECTS ****
inital deep object contains
2 3 4
copy deep object contains
2 3 4
inital deep object changed to
7 6 -5
copy deep object not changed contains
2 3 4
RIGHT! wd.equals(wd2) is false
Process completed.
