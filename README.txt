# CIT130-Obj-Orient-Prog-1-Java
Assignments from CIT130 - Object Oriented Programming - Java

Assignment Prompt:
Take the code (it is from the Savitch student data files) listed here and
    1) make it doubly linked.
    2) Add a copy constructor
    3) Replace outputList with toString
    4) Code an iterator method
    5) Keep track of the tail and add a method outputBackwards to prove the list is doubly linked.

Or use the Savitch code in the book for a doubly linked list and add the functionality mentioned above – 
I think you will learn less that way but it is less work.

To make the node doubly linked change
      private Node<T> link;
    to
      private Node<T> next;
      private Node<T> prev;

Test all functionality by hard coding test cases into your demo file.
