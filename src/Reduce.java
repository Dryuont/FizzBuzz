public class Reduce {
    public static void reduce() {
        int n = 100;
        int steps = 0;

        while (n != 0) {
            if (n % 2 == 1) {
                n--;
                steps++;
            } else {
                n = n / 2;
                steps++;
            }
        }

        System.out.println(steps);
    }
}
