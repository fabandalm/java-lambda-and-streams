package com.falmeida.tech.codility;

public class SampleSolution01 {

    public static void main(String[] args) {

        int[] sample1 = {1,-2,-3,5};
        System.out.println("1: "+solution(sample1));
        int[] sample2 = {1,2,3,-5};
        System.out.println("-1: "+solution(sample2));
        int[] sample3 = {1,2,0,-5};
        System.out.println("0: "+solution(sample3));

    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int totalNegNum = 0;
        for(int i = 0; A.length > i; i++){
            if(A[i] == 0){
                return 0;
            }else if(A[i] <0){
                totalNegNum += 1;
            }
        }

        if(totalNegNum %2 == 0){
            return 1;
        }else{
            return -1;
        }

    }

}
