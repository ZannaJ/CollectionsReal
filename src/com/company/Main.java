package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //        ******* SET ******

/*
        // [24, 53, 88, 33]
        // Set interface is used for unique elements.
        (If you put in duplicates, they will be treated as one)
        // HashSet, is an implementation of the set interface that
        // is not ordered. meaning there's no indexing like we are used to in arrays.
        // Items created inside of a collection become objects.
        // HashSet randomizes the output.
        Set<String> names = new HashSet<>();
        names.add("Bobby");
        names.add("Dave");
        names.add("Barry");
        names.add("Larry");
        Object[] theNames = names.toArray();
//        System.out.println(theNames[0]);
//        System.out.println(names.size()); // this is to get the number of elements in the collection.
//        System.out.println(names.contains("David"));
//        HashSet<String> name = new HashSet<>();
        for(String name : names) {
            System.out.println(name);
        }
*/

/*
        // The TreeSet has a built-in comparator that allows it to
        // sort items/elements/objects in ascending order.
        // i.e. if the items are strings, they will be sorted alphabetically.
        // if the items are numbers they will be sorting in ascending order.
        // TreeSet organises before returning the output.
        Set<Integer> names = new TreeSet<>();
        names.add(4);
        names.add(2);
        names.add(1);
        for(int name : names) {
            System.out.println(name);
        }*/

/*
        // The LinkedList is different from the others in
        // the sense that it preserves the order in which the items are added.
        // Meaning if an item is added first, then it will be returned first.
        // LinkedList returns the values as they are entered.
        Set<Integer> nums = new HashSet<>();
        nums.add(4);
        nums.add(8);
        nums.add(3);
        for (int num : nums) {
            System.out.println(num);
        }
*/
/*
//        ******* LIST ******
        // ["Harry", "George", "Lisa", "Rebecca"]
        // ArrayList is ordered and each item is added to the bottom of the list
        // the items can be returned based on their index.
        List<String> names = new ArrayList<>();
        names.add("Harry");
        names.add("Lisa");
        names.add("Lisa");
        names.add("Rebecca");
        for(String name : names) {
            System.out.println(name);
        }
//        System.out.println(names.size());
*/

        /*List<String> names = new LinkedList<>();
        names.add("Bobby");
        names.add(5,"Barry");
        names.add("David");
        names.set(0, "George");
        System.out.println(names.get(5));*/

//        for (String name : names) {
//            System.out.println(name);
//        }

        // 30 mins.
        // First Task:
        // Take in 6 numbers from the user and return the numbers in a
        // sorted manner using the set interface.

        // Second Task:
        // Take in 5 strings from the user and filter the duplicates using a hashset.

        // Third Task:
        // Take in 10 names and return them in order the user entered them using a set.

        // Initialize Scanner
        Scanner scanner = new Scanner(System.in);
/*
        // Initialize the TreeSet object
        Set<Integer> numbers = new TreeSet<>();
        // Accept input from the user.
        for(int i = 0; i < 6; i++) {
            System.out.print("Enter a number: "); // prompt to accept user input
            numbers.add(scanner.nextInt());
        }
        // output the numbers
        *//*for (int number : numbers) {
            System.out.println(number);
        }*//*
        // output as an object
        System.out.println(numbers);*/


/*
        // Create hashset
        Set<String> names = new HashSet<>();
        for(int i = 0; i < 6; i++) {
            System.out.print("Enter a string: "); // prompt to accept user input
            if (!names.add(scanner.next())) { // check if the string entered is in the object already
                System.out.println("Duplicate encountered");
            }
        }
        System.out.println(names);
*/

        // create linkedHashSet
        Set<String> names = new LinkedHashSet<>();

        // populate the object
        for(int i = 0; i < 6; i++) {
            System.out.print("Enter a string: "); // prompt to accept user input
            names.add(scanner.next());
        }

        for (String name : names) {
            System.out.println(name);
        }


    }

    // Assignment.
    // The employees assignment we did last time.
    // Solve it using an ArrayList.
    // Do a different solution with LinkedList.

    // create a program that will hold 20 students scores, in an arraylist,
    // and return the maximum score in the arrayList.

    // Shortcut for getters and setters is: alt + insert.
    // 30 mins.
    // Create a class called Person. They should have: // The person class will be the parent class
    // - name, age.
    // Create a class called Employee. This class should inherit // The Employee class will be the child class.
    // the Person class. and should have the extra field of
    // - company id, company name.
    // Create a class called Company. This class should take in employees as
    // an array attribute, name.
    //
    // In your main method, Populate a company's employees attribute and
    // find the average age of the employees.

}