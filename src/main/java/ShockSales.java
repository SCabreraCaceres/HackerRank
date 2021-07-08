import java.util.ArrayList;
import java.util.List;

public class ShockSales {
    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    static int sockMerchant(int n, List<Integer> ar) {
        List<Integer> pairs = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < n; i ++) {
            if(pairs.contains(ar.get(i))){
                int index = pairs.indexOf(ar.get(i));
                count++;
                pairs.remove(index);
            } else {
                pairs.add(ar.get(i));
            }
        }
        return count;
    }

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 1, 3, 1, 2, 1, 3, 3, 3, 3);

        int pairs = sockMerchant(list.size(), list);
        System.out.println("Pairs " + pairs);
    }
}
