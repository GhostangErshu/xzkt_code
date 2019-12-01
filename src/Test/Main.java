package Test;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double Sn = 0;
		int K = 0;
		int n = 0;
		K = in.nextInt();
		if (K >= 1 && K <= 15) {
			while (Sn <= K) {
				Sn +=(double)1 / ++n;
			}
		}
		System.out.println(n);
	}
}