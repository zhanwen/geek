package test;

public class Test5 {
	
	public static void main(String[] args) {
		System.out.println(Total(20));
	}
	
	/**
	 * 有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和
	 */
	public static double Total(int n) {
		double s = 0;
		int a=1,b=2;
		for(int i = 1; i != n; i++) {
			s += b/a;
			int temp = a;
			a = b;
			b = temp + b;
		}
		return s;
	}
}
