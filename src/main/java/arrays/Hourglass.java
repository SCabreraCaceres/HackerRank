package arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Hourglass {

    public int sumHourGlass(List<List<Integer>> arr) {
        List<Integer> totals = new ArrayList<>();
        List<List<Integer>> mainList = arr.stream().filter(values -> values.size() > 2).collect(toList());

        List<Integer> totalSums = new ArrayList<>();
        int linesRead = 0;

        if (mainList.size() > 2 && arr.size() > 2) {
            for (int v = 0; v < arr.size(); v++) {
                List<Integer> vertical = arr.get(v);
                for (int h = 0; h < vertical.size(); h++) {
                    if(linesRead % 2 == 0 && h < vertical.size()-2) {
                        int sum3nums = arr.get(v).get(h)
                                + arr.get(v).get(h + 1)
                                + arr.get(v).get(h + 2);
                        if (totals.size() == h) {
                            totals.add(sum3nums);
                        } else {
                            totals.set(h, totals.get(h) + sum3nums);
                        }
                    } else if ((linesRead == 1) && h < vertical.size()-2) {
                        totals.set(h, totals.get(h) + arr.get(v).get(h+1));
                    }
                }
                linesRead ++;

                if(linesRead == 3 && v < arr.size()) {
                    totalSums.add(totals.stream().max(Comparator.comparing(val -> val)).get());
                    totals.clear();
                    linesRead = 0;
                    v = v - 2;
                }
            }
            return totalSums.stream().mapToInt(value -> value).max().getAsInt();
        }
        return 0;
    }

}

