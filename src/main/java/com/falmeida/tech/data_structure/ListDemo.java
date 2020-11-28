package com.falmeida.tech.data_structure;

import com.sun.tools.javac.file.SymbolArchive;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,1,2,3,5,8,13,21);
        System.out.println(Collections.binarySearch(list,5));

    }

}
