package Day2;

/**
 * @Author TangXi
 * @Date 19-11-3 下午7:21
 */
public class FindPrimeNumber {
	public static void main(String[] args) {
		final int BEGIN = 1;
		final int OVER = 10000000;
		//代表该数字是不是素数
		boolean flag = false;
		//查找的范围
		for (int a = BEGIN; a <= OVER; a+=2) {
			//检测是否能被整除
			for (int b = 2; b <= Math.sqrt(a); b++) {
//				if(a==2||a==3){
//					flag = true;
//					break;
//				}
				if (a%b==0){
					flag = false;
					break;
				}
				flag = true;
			}
			if(flag)
				System.out.println(a);
		}
	}
}