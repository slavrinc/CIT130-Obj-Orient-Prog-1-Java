# CIT130-Obj-Orient-Prog-1-Java
Assignments from CIT130 - Object Oriented Programming - Java

Assignment Prompt:
Implement and test a Generic binary search. Note that your test program must use at least 2
types of data to prove that bsearch is Generic.
Templating means that instead of passing a parameter such as Integer you pass a parameter
T. (T is a type variable and can be named anything). This means that you can call bsearch
with different types of objects.

Pseudo Code Example:
Bsearch(String) Bsearch(Integer)

This means you do not have to write 2 separate bsearch methods, one for String and one for
Integer.
The heart of how this is accomplished is the Comparable interface. If a class implements
Comparable, it defines less than, greater than and equals. Also, by making the type variable
you can call with any object that implements Comparable.

Example Code:
public class Searches
{
public static <T extends Comparable> int bsearch(T[] a, int first, int last, T key)
{
called in main as:
result = Searches.<Integer>bsearch(IntegerArray,0, 10, key);
result = Searches<String>bsearch(StringArray,0,10,key);

Example Output:
--------------------Configuration: <Default>--------------------
Integer test array contains:
0 2 4 6 8 10 12 14 16 18
-3 is not in the array.
-2 is not in the array.
-1 is not in the array.
0 is at index 0
1 is not in the array.
2 is at index 1
3 is not in the array.
4 is at index 2
String test array contains:
apples oranges peaches strawberries watermelons
apples is at index 0
plums is not in the array.
Process completed.
