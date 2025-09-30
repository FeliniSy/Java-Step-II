package no3;

import java.util.ArrayList;
import java.util.List;

public class ListAppend {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4, 10));
        List<Integer> list2 = new ArrayList<>(List.of(1, 2, 4, 9, 10, 110));
        List<Integer> result = new ArrayList<>();

        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                result.add(list1.get(i++));
            } else {
                result.add(list2.get(j++));
            }
        }
        while (i < list1.size()) {
            result.add(list1.get(i++));
        }
        while (j < list2.size()) {
            result.add(list2.get(j++));
        }
        System.out.println(result);
    }
}
