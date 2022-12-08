import java.util.Arrays;

public class SortArraysWithFunctioalParadigm {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 345, 0, 34, 90, 34 };
		Arrays.sort(arr);
		for (int a : arr) {
			System.out.println(a);
		}
	}
}
