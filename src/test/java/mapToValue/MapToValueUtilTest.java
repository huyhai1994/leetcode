package mapToValue;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MapToValueUtilTest {


    @Test
    public void case0() {
        List<String> inputString = List.of("");
        assertEquals("", MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    public void case1() {
        List<String> inputString = List.of("REPORT");
        assertEquals("REPORT", MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    public void case2() {
        List<String> inputString = List.of("REPORT", "DAILY");
        assertEquals("DAILY", MapToValueUtil.mapValueToString(inputString));
    }

}