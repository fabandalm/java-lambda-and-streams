package com.falmeida.tech.data_structure;

public class ArrayDemo {

    public static void main(String[] args) {

        String [] name = {"Name","Column","Age"};

        int age[] = {1,2,3,4,5,6,7};

        System.out.println(name[0]);

        System.out.println(age[5]);

        age[5] = 9;

        System.out.println(age[5]);

        for (int i = 0; name.length > i; i++){
            System.out.println(name[i]);
        }

        for (String item: name) {
            System.out.println(item);
        }

        int[][] twoDim = {{1,2},{3,4}};

        int[][][] threeDim = {{{1,2},{3,4},{5,9}}};

        for (int [][]level1: threeDim) {
            for (int[] level2: level1) {
                for (int level3: level2) {
                    System.out.println(level3);
                }
            }
        }

    }

}
