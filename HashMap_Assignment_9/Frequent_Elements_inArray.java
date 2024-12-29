package HashMap_Assignment_9;

import java.util.*;

public class Top_K_frequent_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tests = input.nextInt(); // Number of test cases

        while (tests-- > 0) {
            int length = input.nextInt(); // Number of elements
            int topCount = input.nextInt(); // Number of top elements to find
            int[] numbers = new int[length];
            for (int index = 0; index < length; index++) {
                numbers[index] = input.nextInt(); // Read elements
            }

            HashMap<Integer, Integer> frequencyMap = new HashMap<>();
            List<Integer> resultList = new ArrayList<>();

            for (int index = 0; index < length; index++) {
                int currentNum = numbers[index];
                frequencyMap.put(currentNum, frequencyMap.getOrDefault(currentNum, 0) + 1); // Update frequency
                List<Integer> sortedKeys = new ArrayList<>(frequencyMap.keySet());

                Collections.sort(sortedKeys, new Comparator<Integer>() {
                    @Override
                    public int compare(Integer a, Integer b) {
                        int freqA = frequencyMap.get(a); // Frequency of a
                        int freqB = frequencyMap.get(b); // Frequency of b
                        if (freqA == freqB)
                            return a - b; // Sort by value if frequencies are equal
                        return freqB - freqA; // Sort by frequency
                    }
                });

                for (int sortedIndex = 0; sortedIndex < Math.min(topCount, sortedKeys.size()); sortedIndex++) {
                    resultList.add(sortedKeys.get(sortedIndex)); // Add top elements
                }
            }

            for (int number : resultList) {
                System.out.print(number + " "); // Print the result
            }
            System.out.println();
        }
    }
}