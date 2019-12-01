package Day5;

public class A {
	private int num;

	public A(){
		System.out.println("调用了构造函数");
		this.num = 3;
	}

	static {
		System.out.println("这里是静态代码块");
	}

	public static void main(String[] args) {
//		A a1 = new A();
//		System.out.println(a1.num);
//		A a2 = new A();
//		System.out.println(a2.num);
	}
}
