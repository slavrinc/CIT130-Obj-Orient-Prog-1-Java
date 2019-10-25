# CIT130-Obj-Orient-Prog-1-Java
Assignments from CIT130 - Object Oriented Programming - Java

Assignment Prompt:
When a programming language does not support a needed data type, a programmer must create an abstract data type (ADT). Examples of
data types that might have to be created are Complex Numbers (a + bi) or Fraction (n/d).

These abstract data types created by a programmer would be released to the user community to be used like Integer or Double. That
means a class would be created that implements the desired ADT.

You are to create an ADT Fraction in its own file.
Fraction must consist of:

2 state variables num (numerator) and den (denominator).
a default and 2 parameter override constructor so you can use new Fraction(); or new Fraction(a,b);
a toString() that produces output like 1/2
an equals(Fraction f) that compares using: return getNum()*f.getDenom() == f.getNum()*getDenom();

Write an appropriate test program in a separate file. Your test program should read in numerators and denominators and create Fraction
instances for comparison.

Possible Example Output:
--------------------Configuration: <Default>--------------------
Enter the numerator for the target fraction: 1
Enter the denominator for the target fraction: 2
Enter the numerator for the next fraction to test: 2
Enter the denominator for the next fraction to test: 4
The fraction you just entered equals the first fraction of 1/2.
Would you like to continue (Y/N)? y
Enter the numerator for the next fraction to test: 3
Enter the denominator for the next fraction to test: 4
The fraction you just entered does not equal the first fraction of 1/2.
Would you like to continue (Y/N)? n
Process completed.
