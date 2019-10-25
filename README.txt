# CIT130-Obj-Orient-Prog-1-Java
Assignments from CIT130 - Object Oriented Programming - Java

Assignment Prompt: 
In order to learn polymorphism, imagine designing a graphics system that draws various objects like triangles, circles, 
squares, etc. You do not want to have to make drawing loops for all of the shapes a user might want to draw but rather 
want a polymorphic solution.

While I do not want you to actually draw shapes – that would be too much work to just learn about polymorphism, 
I want you to design a console simulated graphics system.

You need to implement the shapes rectangle and circle and a demonstration program.

In your derived classes, only implement draw and erase – not center. Assume Figure knows how to center a graphics object. 
At the same time, Figure has no idea of how to draw or erase your object. A rectangle needs length, height and position (X,Y). 
A circle needs a radius and position (X,Y). Also, name them (this could be very useful in a real world application). 
Add all necessary additional constructors, variables and methods in the derived classes. 
Call super to get the base class constructor.

Write a demo program to test your classes. Your test program must store your objects polymorphically in a Figure array.
Suppose I had 100 shapes and did not have polymorphism, I would have to make 100 loops until 100 shapes were drawn.
Because we make figure abstract, we can make draw abstract which means any shape that inherits from figure able to give
its own definition of draw. Because all the shapes inherit from the same base, they can be put into the same array.
The compiler figures out which draw to use via polymorphism or late binding.

Possible Example output:

----jGRASP exec: java DrawShapes
In Figure. Centering at (25,100)
In Rectangle erasing
In Rectangle Drawing r1 centered at (25,100) width 10 height 15
In Figure. Centering at (22,45)
In Hexagon erasing
In Hexagon Drawing h2 centered at (22,45) width 10 height 50
In Figure. Centering at (5,10)
In Rectangle erasing
In Circle Drawing c1 centered at (5,10) radius 3
In Figure. Centering at (33,14)
In Hexagon erasing
In Hexagon Drawing h1 centered at (33,14) width 100 height 50
