package org.example;

public class People {
        String name;
        String lastName;
        String DNI;
        int yearOfBirth;

        public People (String name, String lastName, String potatoes, int yearOfBirth){
                this.name = name;
                this.lastName = lastName;
                this.DNI = potatoes;
                this.yearOfBirth = yearOfBirth;
        }

        public void printData(){
                System.out.print("My name is " + name + " my lastname is " + lastName + " my DNI is" + DNI + " and I was born in " + yearOfBirth);
}
}