package com.jahid.assignment.assignment10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        // Creating a list for demonstration
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        // Using Iterator
        System.out.println("Using Iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
            if (element.equals("Two")) {
                iterator.remove(); // Remove the current element
            }
        }
        System.out.println("List after using Iterator: " + list);

        // Re-adding element to demonstrate ListIterator
        list.add("Two");

        // Using ListIterator
        System.out.println("\nUsing ListIterator:");
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            System.out.println(element);
            if (element.equals("Two")) {
                listIterator.set("Four"); // Replace current element
            }
        }

        // Bidirectional traversal using ListIterator
        System.out.println("\nBackward traversal using ListIterator:");
        while (listIterator.hasPrevious()) {
            String element = listIterator.previous();
            System.out.println(element);
        }

        // Adding an element using ListIterator
        listIterator.add("Five");
        System.out.println("List after using ListIterator: " + list);

        // Demonstrating nextIndex() and previousIndex() methods
        System.out.println("\nUsing nextIndex() and previousIndex() methods:");
        listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println("Next index: " + listIterator.nextIndex());
            System.out.println("Previous index: " + listIterator.previousIndex());
            listIterator.next();
        }

        // Adding an element at a specific position using ListIterator
        listIterator = list.listIterator(2); // Start at index 2
        listIterator.add("Six"); // Add "Six" at index 2
        System.out.println("\nList after adding 'Six' at index 2 using ListIterator: " + list);
    }
}
