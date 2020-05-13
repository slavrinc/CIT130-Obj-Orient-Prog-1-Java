# CIT130-Obj-Orient-Prog-1-Java
Assignments from CIT130 - Object Oriented Programming - Java

Assignment Prompt:
Using a hash set to do a Monte Carlo analysis of the birthday paradox. 
The paradox states that the odds of 2 people in a group sharing a birthday is surprisingly high.

A Monte Carlo analysis is using random numbers to simulate actual probable outcomes.
Test your code for various numbers of people.

Here is pseudo code of the algorithm:
Set number of collisions to zero
Loop (10 to 100 by 10)
Loop:
Generate a birthday. (use 1-365)
See if it is already in the set. If it is count as a collision and end the loop.
Add to the set.
Print out the number of collisions as a probability P.

For example, if you ran 50 people and got 25 collisions P = 0.5
The probability of 100 is around 1.0. P can never exceed 1.0. 
If you exceed 1.0 you are counting collisions in a group more than once.

Example Output:
--------------------
Configuration: <Default>
After 100000 tests there were 11446 occurrences of shared birthdays in a set of 10 people.
Probability: 0.11446
After 100000 tests there were 41031 occurrences of shared birthdays in a set of 20 people.
Probability: 0.41031
After 100000 tests there were 70455 occurrences of shared birthdays in a set of 30 people
Probability: 0.70455
After 100000 tests there were 89061 occurrences of shared birthdays in a set of 40 people.
Probability: 0.89061
After 100000 tests there were 97043 occurrences of shared birthdays in a set of 50 people.
Probability: 0.97043
After 100000 tests there were 99454 occurrences of shared birthdays in a set of 60 people.
Probability: 0.99454
After 100000 tests there were 99926 occurrences of shared birthdays in a set of 70 people.
Probability: 0.99926
After 100000 tests there were 99986 occurrences of shared birthdays in a set of 80 people.
Probability: 0.99986
After 100000 tests there were 99999 occurrences of shared birthdays in a set of 90 people.
Probability: 0.99999
After 100000 tests there were 100000 occurrences of shared birthdays in a set of 100 people.
Probability: 1.0

Process completed.
