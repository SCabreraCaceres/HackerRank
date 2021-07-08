import java.util.List;

public class JumpingClouds {

    public static void main(String[] args) {
        int result = jumpingOnClouds(List.of(0, 0, 0, 1, 0, 0));
        System.out.println(result);
    }

    private static int jumpingOnClouds(List<Integer> c) {
        int jumps = 0;
        for(int i = 0; i < c.size() - 1; i++){
            jumps++;
            if( i  + 2 < c.size() && c.get(i + 2) == 0){
                i++;
            }
        }
        return jumps;
    }
}
