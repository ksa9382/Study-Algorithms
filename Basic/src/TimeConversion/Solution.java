package TimeConversion;

// source: https://www.hackerrank.com/challenges/three-month-preparation-kit-time-conversion/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-one
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
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        /*
        12 AM 00
        1 AM 01
        11 AM 11
        ~
        12 PM 12  12
        1 PM 13
        2 PM 14
        10 PM 22
        11 PM 23
         */
        String time = "";

        String originHour = s.substring(0, 2);
        String endStr = s.substring(s.length() - 2, s.length());

        int hour = Integer.parseInt(originHour) % 12;
        if (endStr.equals("PM"))
            hour += 12;

        // 출력 시 0의 경우 00으로 출력해야 하기 때문에 주의
        time = s.replace(originHour, String.format("%02d", hour));
        time = time.replace(endStr, "");

//        if (s.endsWith("AM")) {
//            time = s.replace("AM", "");
//            if (time.startsWith("12"))
//                time = time.replace("12", "00");
//        } else {
//            time = s.replace("PM", "");
//
//            if (!time.startsWith("12")) {
//                int rt = Integer.parseInt(time.substring(0, 2)) + 12;
//                time = time.replace(time.substring(0, 2), Integer.toString(rt));
//            }
//        }

        return time;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        System.out.println(result);

        bufferedReader.close();
    }
}

