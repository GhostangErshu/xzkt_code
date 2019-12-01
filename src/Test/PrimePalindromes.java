package Test;

import java.util.Scanner;

/**
 * @Author TangXi
 * @Date 19-11-4 下午1:59
 */
public class PrimePalindromes {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int begin = in.nextInt();
		int over = in.nextInt();
		for (int i = begin; i <= over; ) {
			if (isPalindrome(i) && isPrime(i))
				System.out.println(i);
			if (i == 9989899)
				return;
			if (i % 2 == 0)
				i++;
			else
				i += 2;
		}
	}

	static boolean isPrime(int num) {
		if (num <= 1 || num % 2 == 0)
			return false;
		if (num == 2)
			return true;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	static boolean isPalindrome(int num) {
		//转换为字符串
		String temp = "" + num;
		for (int i = 0; i < temp.length() / 2; i++)
			if (temp.charAt(i) != temp.charAt(temp.length() - i - 1))
				return false;
		return true;
	}
}
