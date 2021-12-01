package org.menfre;

import java.util.*;

/**
 * 两个列表的最小索引总和
 *
 * @author menfre
 */
public class FindRestaurant {

    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>(list1.length, 1F);
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        Map<Integer, List<String>> result = new HashMap<>(1, 1F);
        for (int i = 0; i < list2.length; i++) {
            String name = list2[i];
            if (map.containsKey(name)) {
                int j = map.get(name) + i;
                if (result.isEmpty()) {
                    List<String> arr = new ArrayList<>();
                    arr.add(name);
                    result.put(j, arr);
                } else {
                    int k = result.keySet().iterator().next();
                    if(k > j){
                        result.remove(k);
                        List<String> arr = new ArrayList<>();
                        arr.add(name);
                        result.put(j, arr);
                    }
                    if(k == j){
                        List<String> arr = result.get(k);
                        arr.add(name);
                    }
                }
            }
        }

        return result.get(result.keySet().iterator().next()).toArray(new String[]{});
    }

    public static void main(String[] args) {

    }
}
