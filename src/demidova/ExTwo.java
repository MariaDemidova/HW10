package demidova;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExTwo {

    public static void doTaskTwo() {
        Directory dir = new Directory();
        dir.add("Петров", "8998765781");
        dir.add("Иванов", "8917755326");
        dir.add("Павлов", "8956789908");
        dir.add("Лыков", "8913455672");
        dir.add("Шапков", "8998777609");
        dir.add("Бобов", "8991876431");
        dir.add("Куплин", "8992323199");
        dir.add("Куплин", "8888123113");

        System.out.println(dir.get("Петров"));
        System.out.println(dir.get("Куплин"));
        System.out.println(dir.get("Шапков"));
    }

    static class Directory {
        private Map<String, List<String>> directory = new HashMap<>();
        private List<String> phoneList;

        public void add(String name, String phone) {
            if (directory.containsKey(name)) {
                phoneList = directory.get(name);
                phoneList.add(phone);
                directory.put(name, phoneList);
            } else {
                phoneList = new ArrayList<>();
                phoneList.add(phone);
                directory.put(name, phoneList);
            }
        }

        public List<String> get(String name) {
            return directory.get(name);
        }
    }
}
