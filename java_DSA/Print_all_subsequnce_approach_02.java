package java_DSA;

import java.util.*;

public class Print_all_subsequnce_approach_02 {

	private static void fun(int[] arr, int n, int idx) {
		if (idx == n) {
			ArrayList<Integer> v = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				v.add(arr[i]);
			}
			System.out.println(v);
			return;
		}

		for (int i = idx; i < n; i++) {
			int temp = arr[idx];
			arr[idx] = arr[i];
			arr[i] = temp;

			fun(arr, n, idx + 1);

			int temp1 = arr[idx];
			arr[idx] = arr[i];
			arr[i] = temp1;

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		fun(arr, n, 0);

	}

}
