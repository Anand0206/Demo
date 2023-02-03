package p1;

import java.util.HashMap;

public class A {

	public static void main(String[] args) {
		
        String str = "ANAND NANDUDKAR";
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Count occurrences of each character in the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }

        // Find the minimum and maximum occurrences
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (Integer count : charCount.values()) {
            min = Math.min(min, count);
            max = Math.max(max, count);
        }

        System.out.println("Minimum occurrence: " + min);
        System.out.println("Maximum occurrence: " + max);
    }
}


