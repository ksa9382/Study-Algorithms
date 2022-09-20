package Hash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// 출처: https://school.programmers.co.kr/learn/courses/30/lessons/1845
public class Phoneketmon {
    private static int[] arr1 = {3,1,2,3};
    private static int[] arr2 = {3,3,3,2,2,4};
    private static int[] arr3 = {3,3,3,2,2,2};

    public static void main(String[] args) {
        System.out.println(solution(arr1));
        System.out.println(solution(arr2));
        System.out.println(solution(arr3));
    }

    private static int solution(int[] nums) {
        int totalAvailable = nums.length / 2;
        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.stream(nums).boxed().toList());

        return Integer.min(totalAvailable, set.size());
    }
}
