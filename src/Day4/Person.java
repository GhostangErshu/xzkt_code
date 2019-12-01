package Day4;

import java.util.Scanner;

/**
 * @Author TangXi
 * @Date 19-11-24 下午7:09
 */
public class Person {
	private String name;
	private int age;
	//true为男
	private boolean sex;

	public Person(){

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	int f(){
		return 0;
	}

	int f(int a){
		return a;
	}


	public static void main(String[] args) {
		Person zhangsan = new Person();

	}
}
