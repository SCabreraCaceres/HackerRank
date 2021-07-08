package arrays;

import java.util.List;
import java.util.stream.Collectors;

public class Hourglass {


    public Integer sumHourGlass(List<List<Integer>> list) {
        if (hasHourGlass(list)) {
            return list.get(0).get(1)
                    + list.get(2).get(1)
                    + list.get(1).get(0)
                    + list.get(1).get(1)
                    + list.get(1).get(2);
        }
        return 0;
    }

    private static boolean hasHourGlass(List<List<Integer>> list) {
        final List<List<Integer>> mainList = list.stream().filter(integers -> integers.size() > 2)
                .collect(Collectors.toList());
        return mainList.size() > 2 && list.size() > 2;
    }
}

