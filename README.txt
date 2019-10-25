# CIT130-Obj-Orient-Prog-1-Java
Assignments from CIT130 - Object Oriented Programming - Java

Assignment Prompt: 
Write a counter class in its own file. This will allow your counter to be used by any program. 

The counter must be able to increment and decrement by one. It must never go below zero. toString and equals must be implemented and
tested correctly. (toString and equals are covered in depth in your text) System.out.println("”+c1) must work and if(c1.equals(c2)) must work where c1 and c2 are instances of your counter. Include an override of the default constructor that sets the counter to zero and a constructor that allows you to set the count.

Write a test program that tests all the features of the counter.

This assignment tests your understanding of the material in the text. It also provides a template for future assignments. It is designed to provide you with the basic tools to write commercial classes which are written in separate files and always include toString and equals. It is also an example of how programmers test their classes prior to releasing them.

Possible Example Output:
--------------------Configuration: <Default>--------------------
This program creates and uses Counters
Initial state
counter1 is at 0
counter2 is at 0.
counter1 equals counter2.
Error - Attempted to subtract 1 Counter from 0 Counter.
Number of Counter reset to 0.
State after first test
counter1 is at 1.
counter2 is at 0.
counter1 does not equal counter2.
State after second test
counter1 is at 2.
counter2 is at 2.
counter1 equals counter2.
Process completed.
