# Assignments
Topic 1 : Introduction to Java

Assignment 1:

Write a java program to display “Welcome to Java Programming” and then print your name on a separate line.

Assignment 2:

Write a Program to accept two Strings Wipro Bangalore as command line arguments and print the output “Wipro Technologies Bangalore” If the command line is “ABC Mumbai”, then it should print “ABC Technologies Mumbai”.

Topic 2: Language Basics

Assignment 1:

Write a program to print month in words, based on input month in numbers. (using switch case)

Assignment 2:

Write a program that will accept a 4-digit number (assume that the user enters only 4 digit nos.) and print the sum of all the 4 digits. For ex: If the number passed is 3629, the program should print “The sum of all the digits entered is 20”

Assignment 3:

Write a program to find greatest number in an array

Assignment 4:

Write a program to check whether the given string is a palindrome or not.

[Hint: You have to extract each character from the beginning and end of the String and compare it with each other. String x=” Malayalam”; char c= x.charAt(i) where i is the index]

Assignment 5:

Write a java program to create enum type all the days of the week and a method that prints a String corresponding to the day value that passed in as argument. [Hint: Use Switch Case]

Topic 3: Packages

Assignment 1:

Create a package called test package;

Define a class called foundation inside the test package;

Inside the class, you need to define 4 integer variables;

Var1 as private; private int var1;

Var2 as default; int var2;

Var3 as protected;

Var4 as public;

Import this class and packages in another class.

Try to access all 4 variables of the foundation class and see what variables are accessible and what are not accessible.

Assignment 2:

Develop a java class that has finalize method which displays “Finalize method called”. Create another class which creates objects of the previous class and it uses the same object reference for creating these objects. For example, if A1 is the class name, then the objects are created as below:

A1 a = new A1();

a = new A1();

a = new A1();

When the statement Runtime.getRuntime().gc() is invoked, how many times the finalize method is called.

Topic 4: Object Oriented Programming Techniques

Assignment 1:

Write a program to create a class Book with the following

- attributes: -isbn, title, author, price

- methods:

i. Initialize the data members through parameterized constructor

ii. displayDetails() to display the details of the book

iii. discountedPrice() : pass the discount percent, calculate the discount on price and find the amount to be paid after discount

- task :

Create an object book, initialize the book and display the details along with the discounted price

Assignment 2:

Define a class named Document that contains a member variable of type String named text that stores any textual content for the document. Create a method named toString that returns the text field and also include a method to set this value.

Next, define a class for Email that is derived from Document and includes member variables for the sender, recipient, and title of an email message. Implement appropriate accessor and mutator methods. [An accessor is a member function that accesses the contents of an object but does not modify that object; eg: int getX(return x;)A mutator is a member function that can modify an object void setX(int x){this.x=x;} ]The body of the email message should be stored in the inherited variable text. Redefine the toString method to concatenate all text fields.

Assignment 3:

Create an abstract class Instrument which is having the abstract function play.

Create three more sub classes from Instrument which is Piano, Flute, Guitar.

Override the play method inside all three classes printing a message

“Piano is playing tan tan tan tan ” for Piano class

“Flute is playing toot toot toot toot” for Flute class

“Guitar is playing tin tin tin” for Guitar class

You must not allow the user to declare an object of Instrument class.

Create an array of 10 Instruments.

Assign different type of instrument to Instrument reference.

Check for the polymorphic behaviour of play method.

Use the instanceof operator to print that which object stored at which index of instrument array.

Topic 5: Interfaces

Assignment 1:

Write an interface called Playable, with a method

void play();

Let this interface be placed in a package called music.

Write a class called Veena which implements Playable interface. Let this class be placed in a package music.string

Write a class called Saxophone which implements Playable interface. Let this class be placed in a package music.wind

Write another class Test in a package called live. Then,

a. Create an instance of Veena and call play() method

b. Create an instance of Saxophone and call play() method

c. Place the above instances in a variable of type Playable and then call play()

Assignment 2:

Create an interface WordCount with single abstract method int count(String str) to count no.of words in a given string. Implement count(String str) method by using Lambda expression in an implementation class MyClassWithLambda & invoke it to display the result on the console.

Assignment 3:

Create an ArrayList of Employee( id,name,address,sal) objects and retrieve objects from ArrayList by using forEach() method of Iterable interface

Topic 6: Exception Handling

Assignment 1:

Write a program to accept name and age of a person from the command prompt (passed as arguments when you execute the class) and ensure that the age entered is >=18 and < 60. Display proper error messages. The program must exit gracefully after displaying the error message in case the arguments passed are not proper. (Hint : Create a user defined exception class for handling errors.)

Assignment 2:

Write a Program to take care of Number Format Exception if user enters values other that integer for calculating average marks of 2 students. The name of the students and marks in 3 subjects are passed as arguments while executing the program.

Assignment 3:

Write a program to accept 5 integers passed as arguments while executing the class. Find the average of these 5 nos. Use ArrayIndexOutofBounds exception to handle situation where the user might have entered less than 5 integers.

Topic 7: Concurrency - Multithreading

Assignment 1:

Write a java program, where one thread prints a number (Generate a random number using Math.random) and another thread prints the factorial of that given number. Both the outputs should alternate each other.

Eg: Number: 2

Factorial of 2: 2

Number: 5

Factorial of 5: 120

The program can quit after executing 5 times.

Assignment 2:

Write a Java Program which will print the current time on the console every 2 seconds. After doing this activity for 20 seconds the program quits.

Topic 8: IO Streams

Assignment 1:

Create a file named the Numbers and populate it with 30 random numbers in the range 1 to 30 including the end points. Place 1 number per line. Open the file and print the numbers 10 per line Find and print the following. 1. Average of the numbers 2. Sum of the numbers

Assignment 2:

Write a program which copies the content of one file to a new file by removing unnecessarily spaces between words.
