package org.example;

import java.util.Scanner;

public final class App{

    public static void main(String[] args){

        People people1 = new People("Johnny", "Abigail", "1234567O", 2000);
        people1.printData();
        People people2 = new People("Lukas", "Smith", "234556789", 1988);
        people2.printData();
    }
}