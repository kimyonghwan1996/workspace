package collection;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("book101", "백설공주"); //키, 밸류
        map.put("book201", "인어공주");
        map.put("book102", "백설공주"); //Value 중복가능
        map.put("book101", "엄지공주"); // key 대체됨
        map.put("book301", "피오나");

        System.out.println(map.get("book301"));
    }
}
