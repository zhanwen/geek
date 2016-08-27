package test;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("总共有" + getCounts() + "个数");
	}
	
	/**
	 * 有1、2、3、4四个数字，
	 * 能组成多少个互不相同且无重复数字的三位数？都是多少？
	 */
	
	public static int getCounts() {
		int count = 0; 
		for(int a = 1; a != 5; a++) {
			for(int b = 1; b != 5; b++) {
				for(int c = 1; c != 5; c++) {
					if(a != b && b != c && a != c) {
						count++;
						System.out.print(a*100 + b * 10 + c + "\t");
						if(count % 4 == 0) {
							System.out.println();
						}
					}
				}
			}
		}
		return count;
	}
}
