# People Class Application

# Classes

1. People
This class represents an individual with the following attributes:

name: A string that holds the person's first name.
lastName: A string that holds the person's last name.
DNI: A string that represents a person's unique identifier, which in this case is the DNI (a type of ID number).
yearOfBirth: An integer representing the person's year of birth.
Constructor
The constructor People(String name, String lastName, String DNI, int yearOfBirth) initializes these attributes. Note that in the constructor, the DNI is incorrectly referred to as potatoes, but this is just a naming inconsistency that still assigns the correct value.

# Method
printData(): This method prints the individual's full name, DNI, and year of birth in a formatted string to the console.

2. App
The App class contains the main method which is the entry point of the program.

# Functionality

Two instances of the People class are created (people1 and people2) with different details.
It calls the printData() method to display the information for both people.
