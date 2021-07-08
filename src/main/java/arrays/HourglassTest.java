package arrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class HourglassTest {

    Hourglass hourglass = new Hourglass();

    @Test
    void isNotHourGlass() {
        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(0, 0, 0));
        assertEquals(0, hourglass.sumHourGlass(list));
    }

    @Test
    void hourGlassSum() {
        List<List<Integer>> array = buildList();
        assertEquals(3, hourglass.sumHourGlass(array));
    }

    private List<List<Integer>> buildList() {
        List<List<Integer>> list1 = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            List<Integer> array2 = List.of(0, 1, 0);
            list1.add(array2);
        }
        return list1;
    }


}
