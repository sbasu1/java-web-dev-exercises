package org.launchcode.java.studios.areaofacircle;

import java.util.HashMap;
import java.util.Map;

public class CountCharecters {

        public static void main(String[] args) {
        String quote = "sreyabasu";
        HashMap<Character, Integer> charCountMap = new HashMap <Character, Integer>();
        char[] strArray = quote.toCharArray();
        for (int i = 0; i < strArray.length; i++) {
            if(charCountMap.containsKey(strArray[i])) {
                charCountMap.put(strArray[i], charCountMap.get(strArray[i]) + 1);
            } else {
                charCountMap.put(strArray[i], 1);
            }
        }
        for (Map.Entry<Character, Integer> CountMap : charCountMap.entrySet()) {
            System.out.println(CountMap.getKey() + ":" + CountMap.getValue());
        }
    }


}
