package Day5;

/**
 * @Author TangXi
 * @Date 19-12-1 下午7:41
 */
public class Student extends Person{

	@Override
	void run(){
		System.out.println("Student.run");
	}

	/*
	那么，一个实际类型为Student，
	引用类型为Person的变量，调用其run()方法，
	调用的是Person还是Student的run()方法？
	 */
	public static void main(String[] args) {
		Person student1 = null;
		Person student2 = new Student();
		System.out.println(student1.equals(student2));
	}

}
