package org.menfre;

import java.util.ArrayList;
import java.util.List;

/**
 * 二进制手表
 * @author menfre
 */
public class ReadBinaryWatch {

    public List<String> readBinaryWatch(int turnedOn) {
        List<String> arr = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                if(Integer.bitCount(i) + Integer.bitCount(j) == turnedOn){
                    arr.add(i + ":" + (j < 10 ? "0" + j : j));
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

    }
}
