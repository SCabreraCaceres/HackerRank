package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Hourglass {


    public int sumHourGlass(List<List<Integer>> arr) {
        List<Integer> sums = new ArrayList<>();
        final List<List<Integer>> mainList = arr.stream().filter(integers -> integers.size() > 2)
                .collect(Collectors.toList());
        if (mainList.size() > 2 && arr.size() > 2) {
            for (int v = 0; v < arr.size(); v++) {
                List<Integer> vertical = arr.get(v);
                for (int h = 0; h < vertical.size(); h++) {
                    if(v % 2 == 0 && h < vertical.size()-2) {
                        int sum3nums = arr.get(v).get(h)
                                + arr.get(v).get(h + 1)
                                + arr.get(v).get(h + 2);
                        if (sums.size() == h) {
                            sums.add(sum3nums);
                        } else {
                            sums.set(h, sums.get(h) + sum3nums);
                        }
                    } else if ((v == 1 || v % 2 > 0) && h < vertical.size()-2) {
                        sums.set(h, sums.get(h) + arr.get(v).get(h+1));
                    }
                }
            }
            return sums.stream().max(Integer::compareTo).get();
        }
        return 0;
    }

}

