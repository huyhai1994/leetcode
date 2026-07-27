package hashmap_api;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HashMapApiTest {
    @Test
    void shouldReturnCountEquals1AfterIncreament() {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, map.getOrDefault(1, 0) + 1);

        assertEquals(1, map.get(1));
    }

    @Test
    void loopThroughMapShouldReturnValueAndKey() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.forEach((k, v) -> System.out.println(k + " --> " + v));
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
