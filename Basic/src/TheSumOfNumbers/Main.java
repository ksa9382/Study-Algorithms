package TheSumOfNumbers;

import java.io.IOException;
import java.util.Scanner;

// source: https://www.acmicpc.net/problem/11720
class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        scanner.nextLine();
        String numbers = scanner.nextLine();

        System.out.println(sum(count, numbers));
    }

    private static long sum(int count, String numbers) {
        long sum = 0;

        if (numbers.length() < count) count = numbers.length();

        for (int i = 0; i < count; i++) {
            if (!Character.isDigit(numbers.charAt(i))) continue;

            sum += Character.digit(numbers.charAt(i), 10);
        }

        return sum;
    }
}
