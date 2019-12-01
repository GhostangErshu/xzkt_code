package Test;

/**
 * @Author TangXi
 * @Date 19-11-17 下午8:39
 */
public class S {
	public static void main(String args[]) {
		int[] arr = new int[]{1,2,3};
		System.out.println(arr.length);
		int sum = 0;
		int n =1;
		for(int i=1;i<=10;i++){
			n = i*n;
			sum += n;
		}
		System.out.println(sum);
	}
}
class A{
	protected boolean equals(){
		return super.equals(1);
	}
}
//