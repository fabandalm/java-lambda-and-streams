package com.falmeida.tech;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String args[]) {
        // Creating LinkedHashSet and
        // adding elements
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();

        lhs.add("Test");
        lhs.add("From");
        lhs.add("Test");
        lhs.add("Are");
        lhs.add("Very helpful");

        // Traversing elements
        Iterator<String> itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
