# CIT130-Obj-Orient-Prog-1-Java
Assignments from CIT130 - Object Oriented Programming - Java

Assignment Prompt:
Assignment 9:
Write a generic class MyMathClass with at type parameter T where T is a numeric object 
(Integer, Double or any class that extends java.lang.number) 

Add a method standardDeviation (stdev) that takes an ArrayList of type T and returns a standard deviation as type double. 
Use a for each loop where appropriate.

Hard code a couple of test arrays into your Demo file. 
You must use at least 2 different types such as Double and Integer.

Your call will be something like:
System.out.println(“Standard Deviation 0-9 “ + MyMathClass.stdev(a));

Your class and method headers will be:
public class MyMathClass<T extends Number> {
public static <T extends Number> double stdev(ArrayList<T> a){

Research java’s Number class to see what useful method we are gaining access to.
Standard Deviation is the average amount of deviation from the average.

Example:
If the input is 1 2 3 4 5 6 7 8 9 10
The average is 5.5
The result for the total would be:(1 - 5.5)(1 - 5.5) + (2 - 5.5)(2 - 5.5) + (3 - 5.5)(3 - 5.5) + … + (10 - 5.5)(10 - 5.5)
Then divide this by N
1 or 9 and take the square root.
Excel gives: 3.3 as the standard deviation.

Possible output:
--------------------
Configuration: MyMathClass JDK version 1.6.0_21 <Default> <
standard deviation 0 - 9 type Double 3.0276503540974917
standard deviation 0 - 9 type Integer 3.0276503540974917
From excel 3.0276503541

Process completed.
