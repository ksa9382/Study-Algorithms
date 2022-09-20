package Hash;

// 출처: https://school.programmers.co.kr/learn/courses/30/lessons/42577

import java.util.Arrays;

public class PhoneBook {
    private static String[] case1 = {"119", "97674223", "1195524421"};
    private static String[] case2 = {"123","456","789"};
    private static String[] case3 = {"12","123","1235","567","88"};

    public static void main(String[] args) {
        System.out.println(solution(case1));
        System.out.println(solution(case2));
        System.out.println(solution(case3));
    }

    private static boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i]))
                return false;
        }

        return true;
    }
}
