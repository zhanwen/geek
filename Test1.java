package test;

public class Test1 {
	
	private static int Height = 100;
	
	public static void main(String[] args) {
		int n = 10; //第几次
		System.out.println("第"+ n + "次落地时，共经过"+ all(n) + "米");
	}
	
	
	/**
	 * 一球从100米高度自由落下,每次落地后反跳回原高度的一半,
	 * 再落下,求它在第10次落地时,共经过多少米?第10次反弹多高?
	 */
	
	/**
	 * 
	 * @param n the times
	 * @return total 
	 */
	public static double all(int n) {
		double s = Height;
		double sum = 0.0;
		for(int i = 0; i != n/2; i++) {
			if(i == n/2 - 1 && n % 2 == 0) {
				sum = sum + s/2;
				System.out.println("第"+ n + "次反弹高度为" + s/2);
				break;
			}else {
				System.out.println("第"+ n + "次反弹高度为" + s/2);
			}
			sum += (s/2)*2;
			s = s/2;
		}
		return sum+100;
	}
}
