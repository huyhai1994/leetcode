package filter_data_two_list;

import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public List<String> filterArrayFromInputArray(List<String> list1, List<String> list2) {
        return list1.stream()
                .filter(list2::contains)
                .collect(Collectors.toList());
    }
}
