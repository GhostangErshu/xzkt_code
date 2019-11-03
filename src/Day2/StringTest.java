package Day2;

/**
 * @Author TangXi
 * @Date 19-11-3 下午8:39
 */
public class StringTest {
	public static void main(String[] args) {
		String name = "张三";
		System.out.println(name.hashCode());
		name = "李四";
		System.out.println(name);
		System.out.println(name.hashCode());
	}
}
