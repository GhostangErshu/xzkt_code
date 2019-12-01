package Day3;

/**
 * @Author TangXi
 * @Date 19-11-10 下午8:04
 */
public class Human {
	String name;
	int age;
	double height;
	double weight;
	boolean isSingle;
	String Hobby;

	void sayHello(){
		System.out.println("大嘎好,我系"+name+",今年"+age+"岁,身高:"+height+"cm,体重:"+weight+"kg,爱好是："+Hobby+","+(isSingle?"还单身":"不是单身了"));
	}

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
