package Test;

import java.util.Arrays;

/**
 * @Author TangXi
 * @Date 19-11-12 上午9:28
 */
public class Test {
	static void f(String... name){
		System.out.println(Arrays.toString(name));
	}

	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
//		java.util.Scanner in = new java.util.Scanner(System.in);
//		f("张三","李四","王五",in.next());
//		System.out.println(0/4);
//		float a = 5 + 5.5f;
		int[] ar = {1,2,3};
		System.out.println(ar.length);
		System.out.println(true&true);
		System.out.println(6.0*2/3);
	}

}