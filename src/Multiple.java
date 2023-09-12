public class Multiple {
    public static int print_multiple() {
        int num = 0;
        for (int i = 1; i < 1000; i++) {

            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy5) {
                num++;
            } else if (divisibleBy3) {
                num++;
            }
        }
        return num;
    }
}
