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
        assertEquals(-19, hourglass.sumHourGlass(array));
    }

    private List<List<Integer>> buildList() {
        List<List<Integer>> list1 = new ArrayList<>();

        list1.add(List.of(0, -4, -6, 0, -7, -6));
        list1.add(List.of(-1, -2, -6, -8, -3, -1));
        list1.add(List.of(-8, -4, -2, -8, -8, -6));
        list1.add(List.of(-3, -1, -2, -5, -7, -4));
        list1.add(List.of(-3, -5, -3, -6, -6, -6));
        list1.add(List.of(-3, -6, 0, -8, -6, -7));
        // 0 -4 -6 0 -7 -6
        //-1 -2 -6 -8 -3 -1
        //-8 -4 -2 -8 -8 -6
        //-3 -1 -2 -5 -7 -4
        //-3 -5 -3 -6 -6 -6
        //-3 -6 0 -8 -6 -7
        return list1;
    }


}
