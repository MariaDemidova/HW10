package demidova;

import java.util.*;

public class ExOne {

    public static void doTaskOne() {
        String[] wordsArr = {"яблоко", "груша", "яблоко", "банан", "киви",
                "арбуз", "киви", "свекла", "шторы", "кошка",
                "собака", "машина", "арбуз", "цветы", "яблоко",
                "дом", "лес", "дверь", "кура", "люк"
        };
        Map<String, Integer> wordsMap = new HashMap<>();
        for (int i = 0; i < wordsArr.length; i++) {
            if (wordsMap.containsKey(wordsArr[i])) wordsMap.put(wordsArr[i], wordsMap.get(wordsArr[i]) + 1);
            else wordsMap.put(wordsArr[i], 1);
        }
        System.out.println(wordsMap);
    }
}
