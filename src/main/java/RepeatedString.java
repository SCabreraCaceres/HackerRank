public class RepeatedString {
    public static void main(String[] args) {
        long result = repeatedString("a", 10000000000L);
        System.out.println(result);
    }

    private static long repeatedString(String s, long n) {
        long rest =  n % s.length();
        long multiple =  n / s.length();
        long countA = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a') {
                countA++;
            }
        }
        countA = countA * multiple;
        for (int i = 0; i < rest; i++) {
            if(s.charAt(i) == 'a') {
                countA++;
            }
        }
        return countA;
    }
}
