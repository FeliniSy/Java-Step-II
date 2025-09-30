package no2;

import java.util.ArrayList;
import java.util.List;

public class Combination {

    public static List<String> generateCombinations(int n) {
        List<String> result = new ArrayList<>();
        generator("", 0, 0, n, result);
        return result;
    }

    public static void generator(String temp, int firstBracket, int secondBracket, int n, List<String> result) {
        if (temp.length() == 2 * n) {
            result.add(temp);
            return;
        }
        if (firstBracket < n) {
            generator(temp + "{", firstBracket + 1, secondBracket, n, result);
        }
        if (secondBracket < n && secondBracket < firstBracket) {
            generator(temp + "}", firstBracket, secondBracket + 1, n, result);
        }
    }

    public static void main(String[] args) {
        int n = 4;
        List<String> result = generateCombinations(n);
        for (String s : result) {
            System.out.println(s);
        }
    }
}
