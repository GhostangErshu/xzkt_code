package Day6;

public class Student extends Human implements Runable {
	private double score;

	public Student(int age, double height,double score) {
		super(age, height);
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student{" +
				"score=" + score +
				", age=" + age +
				", height=" + height +
				'}';
	}

	public static void main(String[] args) {
		Student student = new Student(18,172,100);
		student.run();
		System.out.println(student);
	}

	@Override
	public void run() {
		System.out.println("我是学生,我能跑");
	}
}
