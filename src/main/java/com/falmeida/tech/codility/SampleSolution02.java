package com.falmeida.tech.codility;

public class SampleSolution02 {

    public static int[] solution(int[] A, int K) {
        // write your code in Java SE 8

        if(A.length == 0){
            return A;
        }

        int length = A.length;

        int index = K%length;

        int[] newArray = new int[length];

        int newIndex;

        for(int i = 0; A.length > i ; i++){
            if(index + i > A.length -1 ){
                newIndex = (index + i) - (A.length);
            }else{
                newIndex = index + i;
            }
            newArray[newIndex] = A[i];
        }

        return newArray;
    }

    public static void main(String[] args) {

        int[] arrayTest = {1,2,3,4,5};

        int[] result = solution(arrayTest, 9);

        for (int i=0; result.length>i;i++){
            System.out.println(result[i]);
        }

    }

}
