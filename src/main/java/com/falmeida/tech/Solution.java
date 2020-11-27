package com.falmeida.tech;

public class Solution {

    public int solution(int N) {
        // write your code in Java SE 8
        String binStr = convertToBinary(N);
        System.out.println(binStr);
        int maxBinGap = 0;
        int binGapNum = 0;
        boolean binGap = false;
        boolean beginOne = false;
        boolean inBetZero = false;

        for(int i=0; binStr.length()>i;i++){
            char bit = binStr.charAt(i);
            if(bit == '1'){
                if(beginOne == false){
                    beginOne = true;
                }else if(inBetZero == true){
                    binGap = true;
                    beginOne = true;
                    inBetZero = false;
                    if(binGapNum > maxBinGap){
                        maxBinGap = binGapNum;
                    }
                    binGapNum = 0;
                }
            }else{
                if(beginOne==true){
                    inBetZero = true;
                    binGapNum +=1;
                }
            }
        }

        if(binGap == false){
            return 0;
        }

        return maxBinGap;
    }

    public String convertToBinary(int N){

        StringBuilder binary = new StringBuilder();

        while(N>0){
            binary.append(N%2);
            N /= 2;
        }

        return binary.reverse().toString();

    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(328));
    }

}
