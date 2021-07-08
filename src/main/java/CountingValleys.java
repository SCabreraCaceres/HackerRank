public class CountingValleys {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(String path) {
        int level = 0;
        int valleys = 0;
        for(int i = 0; i < path.length(); i++) {
            if(path.charAt(i) == 'U'){
                level++;
            } else if(path.charAt(i) == 'D') {
                if(level == 0){
                    valleys++;
                }
                level--;
            }
        }
        return valleys;
    }

    public static void main(String[] args) {

        int result = countingValleys("UDDDUDUU");

    }
}
