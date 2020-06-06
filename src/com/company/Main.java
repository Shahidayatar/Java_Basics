package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("we are back");

        // variables

	String  name= "shahid";


	int age = 19;
	System.out.println(name+" is "+age);
	// \ is an an escape character
        System.out.println("Dayatar is my sirname and \n yusuf is my father name");// create new line

        // different functions for strings

        System.out.println(name.contains("shah"));
        System.out.println(name.indexOf("s"));
        System.out.println(name.substring(0,4));



        // Dealing  with numbers

        System.out.println(Math.abs(-5.5));// gives the positive value
        System.out.println(Math.pow(4,3));// Gives 4^3=64
        System.out.println(Math.sqrt(81));


    }
}
