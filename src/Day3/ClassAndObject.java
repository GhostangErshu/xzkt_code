package Day3;


import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author TangXi
 * @Date 19-11-10 下午6:54
 */
public class ClassAndObject {
	public static void main(String[] args) {
		Human yulanxi = new Human();
		yulanxi.name = "玉兰溪";
		yulanxi.age = 50;
		yulanxi.isSingle = true;
		yulanxi.height = 150;
		yulanxi.weight = 100;
		yulanxi.Hobby = "唱跳rap篮球";
		yulanxi.sayHello();
	}
}
