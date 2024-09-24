//Chong Yang 092424
//ArrayListPractice.java

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        System.out.println("\nWelcome to Array List Practice Program!\n");

        //create an ArrayList of String
        ArrayList<String> myListOfStrings = new ArrayList<>();

        //add a few elements to my ArrayList
        myListOfStrings.add("first");
        myListOfStrings.add("second");
        myListOfStrings.add("third");

        //output our arraylist
        System.out.println("\nmyListOfString is: " + myListOfStrings);

        //remove an element
        myListOfStrings.remove(0);

        System.out.println("\nAfter removing...");
        System.out.println("\nmyListOfString is: " + myListOfStrings);

        // remove another element
        myListOfStrings.remove("third");
        System.out.println("\nAfter removing...");
        System.out.println("\nmyListOfString is: " + myListOfStrings);

        //use a for loop to add some other things to our list

        String toAdd = "";

        for (int i=0; i<10; i++){
            toAdd = toAdd + " adding.." + Integer.toString(i);
            myListOfStrings.add(toAdd);

        }

        //adding new elements
        System.out.println("\nAfter adding...");
        System.out.println("\nmyListOfString is: " + myListOfStrings);

        // use a forloop to output each element of our ArrayList
        for (int i=0; i<myListOfStrings.size(); i++){
            System.out.println("An element in my list is: " + myListOfStrings.get(i));
        }





    }
}