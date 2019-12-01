package Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sushu {
	public static void main(String[] args) {
		int i, j;
		boolean flag;
		for (i = 100; i < 200; i++) {
			flag = true;
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(i);
			}
		}
	}

	/**
	 * @Author TangXi
	 * @Date 19-10-29 下午4:56
	 */
	public static class FileInput {
		public static void main(String[] args) throws FileNotFoundException {
			Scanner in = new Scanner(new File("xzkt_java.iml"), "UTF-8");
			while (in.hasNext())
				System.out.println(in.next());
			System.out.println("请输入金字塔的行数");
			Scanner s = new Scanner(System.in);
			int i = s.nextInt();
			for (int a = 1; a <= i; a++) {
				for (int b = 1; b <= i - a; b++) {
					System.out.print(" ");
				}
				for (int c = 1; c <= a * 2 - 1; c++) {
					System.out.print("♥");
				}
				System.out.println();
			}
		}
	}
}
