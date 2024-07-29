public class PerfectNumbers {
    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }


        return sum == number;
    }

    public static void main(String[] args) {
        System.out.println("Perfect numbers between 1 and 1000 are:");

       
        for (int i = 1; i <= 1000; i++) {
            if (isPerfect(i)) {
                System.out.println(i);
            }
        }
    }
}
