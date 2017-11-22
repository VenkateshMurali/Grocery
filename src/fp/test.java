package fp;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class test {
	public static void main(String args[]) throws NumberFormatException, IOException {
		int sum = 0;
		float median;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n1 = Integer.valueOf(bf.readLine()), n2 = Integer.valueOf(bf.readLine());
		int[] nums1 = new int[n1];
		int[] nums2 = new int[n2];
		int[] nums3 = new int[nums1.length + nums2.length];
		int count = 0;

		for (int i = 0; i < n1; i++) {
			nums1[i] = Integer.valueOf(bf.readLine());
		}
		for (int j = 0; j < n2; j++) {
			nums2[j] = Integer.valueOf(bf.readLine());
		}
		for (int i = 0; i < nums1.length; i++) {
			nums3[i] = nums1[i];
			count++;
		}
		for (int j = 0; j < nums2.length; j++) {
			nums3[count++] = nums2[j];
		}
		Arrays.sort(nums3);

		for (int j = 0; j < nums3.length; j++) {
			sum += nums3[j];
		}
		int total = sum;
		float avg = total / nums3.length;

		median = nums3[nums3.length / 2];
		System.out.println(median);

	}

}