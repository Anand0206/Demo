package p1;

import java.util.Arrays;

public class RemoveDuplicate {

	public static String removeDuplicate(char str[], int n) {
		int Index = 0;
		for (int i = 0; i < n; i++) {
			int j = 0;
			for (j = 0; j < i; j++) {
				if (str[i] == str[j]) {
					break;
				}
			}
			if (j == i) {
				str[Index++] = str[i];
			}
		}
		return String.valueOf(Arrays.copyOf(str, Index));
	}
	public static void main(String[] args) {
		char str[] = "Hello good Morning".toCharArray();
		int n = str.length;
		System.out.println(removeDuplicate(str, n));
	}
}
