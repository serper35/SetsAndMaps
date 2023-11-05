import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1(new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7)));

        task2(new ArrayList<>(List.of(8, 10, 200, 1, 1000, 2, 3, 4, 4, 5, 5, 6, 7, 500, 24)));

        task3(new ArrayList<>(List.of("cat", "cat", "cat", "dog", "dog", "pig")));

        task4(new ArrayList<>(List.of("один", "два","два", "три", "три", "три")));
    }

    public static void task1(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.print(nums.get(i) + " ");
            }
        }
        System.out.println();
        System.out.println();
    }

    public static void task2(List<Integer> nums) {
        Collections.sort(nums);
        Set<Integer> numsSet = new HashSet<>();

        for (Integer num : nums) {
            if (num % 2 == 0 && !numsSet.contains(num)) {
                System.out.print(num + " ");
                numsSet.add(num);
            }
        }
        System.out.println();
        System.out.println();
    }

    public static void task3(List<String> words) {
        Set<String> wordsSet = new HashSet<>(words);
        System.out.println(wordsSet);
        System.out.println();
    }

    public static void task4(List<String> words) {
        Map<String, Integer> wordsMap = new HashMap<>();

        for (String word : words) {
            if (wordsMap.containsKey(word)) {
                int repeat = wordsMap.get(word);
                wordsMap.put(word, repeat + 1);
            } else {
                wordsMap.put(word, 1);
            }
        }
        System.out.println(wordsMap);
    }
}