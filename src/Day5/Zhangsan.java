package Day5;

/**
 * @Author TangXi
 * @Date 19-12-1 下午8:03
 */
public class Zhangsan extends Person{
	private int age = 18;
	private String name = "张三";

	@Override
	public String toString() {
		return "Zhangsan{" +
				"age=" + age +
				", name='" + name + '\'' +
				'}';
	}

	public static void main(String[] args) {
		Zhangsan zhangsan = new Zhangsan();
		zhangsan.run();
	}
}
