package sky.pro.java.course2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Integer> nums = new ArrayList<>(List.of(1, 56, 1, 2, 14, 3, 4, 48, 4, 5, 5, 6, 7));
        List<Integer> oddNumbers = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                oddNumbers.add(nums.get(i));
            }
        }
        System.out.println(oddNumbers);
        System.out.println();

        Set<Integer> evenNumbers = new HashSet<>();
        for (int j = 0; j < nums.size(); j++) {
            if (nums.get(j) % 2 == 0) {
                evenNumbers.add(nums.get(j));
            }
        }
        List<Integer> setToList = new ArrayList<>(evenNumbers);
        List<Integer> evenNumbersInOrder = new ArrayList<>();
        while (setToList.size() != 0) {
            Integer minElement = setToList.get(0);
            for (int k = 1; k < setToList.size(); k++) {
                if (minElement > setToList.get(k)) {
                    minElement = setToList.get(k);
                }
            }
            evenNumbersInOrder.add(minElement);
            setToList.remove(minElement);
        }
        System.out.println(evenNumbersInOrder);
        System.out.println();

        List<String> words = new ArrayList<>(List.of("машина", "код", "компьютер", "идея", "программа",
                "код", "отладка", "машина", "идея"));
        Set<String> wordsInOneCopy = new HashSet<>();
        wordsInOneCopy.addAll(words);
        System.out.println(wordsInOneCopy);
        System.out.println();

        Integer counter = 0;
        List<String> auxiliaryList = new ArrayList<>(words);
        while (auxiliaryList.size() != 0) {
            String word = auxiliaryList.get(0);
            auxiliaryList.remove(0);
            if (auxiliaryList.contains(word)) {
                counter = counter + 2;
            }
        }
        System.out.println(counter);
    }
}
