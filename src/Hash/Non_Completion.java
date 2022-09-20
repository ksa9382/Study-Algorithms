package Hash;

// Source: https://school.programmers.co.kr/learn/courses/30/lessons/42576?language=java

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

public class Non_Completion {
    private static String[] participant1 = {
        "leo", "kiki", "eden" };

    private static String[] completion1 = {
            "eden", "kiki" };

    private static String[] participant2 = {
            "marina", "josipa", "nikola", "vinko", "filipa" };

    private static String[] completion2 = {
            "josipa", "filipa", "marina", "nikola" };

    private static String[] participant3 = {
            "mislav", "stanko", "mislav", "ana" };

    private static String[] completion3 = {
            "stanko", "ana", "mislav" };

    public static void main(String[] args) {
        System.out.println(solution(participant1, completion1));
        System.out.println(solution(participant2, completion2));
        System.out.println(solution(participant3, completion3));
    }

    public static String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String p : participant) map.put(p, map.getOrDefault(p, 0) + 1);

        for (String c : completion) {
            Integer count = map.get(c);

            if (count != 1) map.put(c, --count);
            else map.remove(c);
        }

        return map.keySet().stream().findFirst().get();
    }
}
