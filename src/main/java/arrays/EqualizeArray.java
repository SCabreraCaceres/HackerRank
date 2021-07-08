package arrays;

import java.util.List;
import java.util.Map;

import static java.util.Comparator.comparingLong;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class EqualizeArray {

    public static void main(String[] args) {
        int result = equalizeArray(List.of(1, 2, 3, 1, 2, 3, 3, 3));
        System.out.println(result);
    }

    private static int equalizeArray(List<Integer> arr) {
        Map<Integer, Long> map =
                arr.stream().collect(groupingBy(i -> i, counting()));

        Long aLong = map.values().stream().max(comparingLong(o -> o)).get();
        return (int) (arr.size() - aLong);
    }
}
