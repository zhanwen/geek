package test;

public class Test4 {
	public static void main(String[] args) {
		show();
	}
	
	/**
	 * ���9*9�ھ�
	 */
	public static void show() {
		for(int i = 1; i != 10; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + i*j +"\t");
			}
			System.out.println();
		}
	}
}
