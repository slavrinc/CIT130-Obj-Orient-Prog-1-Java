# CIT130-Obj-Orient-Prog-1-Java
Assignments from CIT130 - Object Oriented Programming - Java

Assignment Prompt: 
Implement the following UML for a counter that increments once a second until a given
number of seconds is reached.
<reference image omitted>

In this program, there will be 3 classes. Your test program will input a start and end number
of seconds. Call the CounterController only from your test program. The controller will create
an instance of CounterModel with the initial value and call increment until the end value is
reached. The CounterModel will wait 1 second, increment its counter and then display its
counter by calling CounterView. Use Thread.sleep(1000); to delay 1 second.

Example Output:
--------------------Configuration: <Default>--------------------
This progam tests a timer.
Enter a start number of seconds
5
Enter an end number of seconds
11
CounterController Starting.
6...
7...
8...
9...
10...
11...
Continue?(y/n)
y
Enter a start number of seconds
0
Enter an end number of seconds
4
CounterController Starting.
1...
2...
3...
4...
Continue?(y/n)
n
Process completed.
