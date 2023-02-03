package p1;

import java.util.Scanner;

public class DigitToString {
		    private static final String[] ones = {
		        "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
		        "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
		    };
		    private static final String[] tens = {
		        "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
		    };

		    private static String convert(int num) {
		        if (num < 20) {
		            return ones[num];
		        }
		        if (num < 100) {
		            return tens[num / 10] + ((num % 10 != 0) ? " " : "") + ones[num % 10];
		        }
		        if (num < 1000) {
		            return ones[num / 100] + " hundred" + ((num % 100 != 0) ? " " : "") + convert(num % 100);
		        }
		        if (num < 1000000) {
		            return convert(num / 1000) + " thousand" + ((num % 1000 != 0) ? " " : "") + convert(num % 1000);
		        }
		        return "";
		    }

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int num = sc.nextInt();
		        System.out.println("Number in words: " + convert(num));
		    }
	}

