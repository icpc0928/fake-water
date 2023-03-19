package com.alliance.game.fakeWater.domain;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.*;

public class Sha256 {

//    public static void main(String[] args) {
//
//        TreeMap<Integer, Integer> resultMap = new TreeMap<>();
//        int testTimes = 1000000;
//        for(int i = 0; i < testTimes; i++){
//            System.out.println(i);
//
//            String base = String.valueOf(i) + ":" + ("(int)(Math456.random() * testTimes)");
//            Set<Integer> reSet = getResult(base, 20);
//            for(Integer ii : reSet.stream().toList()){
//                resultMap.put(ii, resultMap.getOrDefault(ii, 0) + 1);
//            }
//        }
//        printMap(resultMap);
//
//    }

    public static void printMap(Map<Integer, Integer> map){
        for(Integer i : map.keySet()){
            System.out.println(i + " : " + map.get(i));
        }
    }

    public static Set<Integer> getResult(String base, int needBalls){
        return getResult(strToIntArray(sha256(base)), needBalls);
    }


    public static String sha256(final String base) {
        try{
            final MessageDigest digest = MessageDigest.getInstance("SHA-256");
            final byte[] hash = digest.digest(base.getBytes(StandardCharsets.UTF_8));
            final StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                final String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1)
                    hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch(Exception ex){
            throw new RuntimeException(ex);
        }
    }

    public static int[] strToIntArray(String hexStr){
        String[] strArr = hexStr.split("");
        int[] result = new int[strArr.length];
        for(int i = 0; i < strArr.length; i++){
            int x = Integer.parseInt(strArr[i], 16);
            result[i] = x;
        }
        return result;
    }

    public static Set<Integer> getResult(int[] hex, int needBalls){
        Set<Integer> result = new TreeSet<>();
        int CONSTANT = 0;
        int finalSize = 0;

        final int  defaultLen = 10;
        int plusLen = defaultLen;

        for (int k : hex) {
            CONSTANT += k;
        }

        for(int i = 0; i < needBalls; ){
            int tempSum = 0;

            for(int j = 0; j < plusLen; j++){
                tempSum += hex[(i * defaultLen + j) % hex.length];
            }
            int r = (tempSum + CONSTANT) % 80;
            result.add(r+1);
            if(result.size() == finalSize){
                plusLen++;
            }else{
                plusLen = defaultLen;
                finalSize++;
                i++;
            }
        }
        return result;
    }
}
