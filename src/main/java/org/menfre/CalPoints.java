package org.menfre;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 棒球比赛
 *
 * @author menfre
 */
public class CalPoints {

    public int calPoints(String[] ops) {
        List<Integer> arr = new LinkedList<>();
        for (String op : ops) {
            if("+".equals(op)){
                arr.add(arr.get(arr.size() - 1) + arr.get(arr.size() - 2));
            }else if("D".equals(op)){
                arr.add(arr.get(arr.size() - 1) * 2);
            }else if("C".equals(op)){
                arr.remove(arr.size() - 1);
            }else{
                arr.add(Integer.parseInt(op));
            }
        }
        return arr.stream().reduce(Integer::sum).get();
    }

    public static void main(String[] args) {
    }
}
