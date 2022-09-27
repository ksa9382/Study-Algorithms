package NumberProportion;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int posCount = 0, negCount = 0, zeroCount = 0;
        int arrSize = arr.size();
        for (int num : arr) {
            if (num > 0) posCount++;
            else if (num < 0) negCount++;
            else zeroCount++;
        }
        System.out.printf("%.6f\n", (float)posCount / (float)arrSize);
        System.out.printf("%.6f\n", (float)negCount / (float)arrSize);
        System.out.printf("%.6f\n", (float)zeroCount / (float)arrSize);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
