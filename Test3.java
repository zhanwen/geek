package test;

public class Test3 {

	public static void main(String[] args) {
		display();
	}
	
	/**
	 * ��ӡ�����е� "ˮ�ɻ��� "����ν "ˮ�ɻ��� "��ָһ����λ����
	 * ���λ���������͵��ڸ�������
	 * ���磺153��һ�� "ˮ�ɻ��� "����Ϊ153=1�����η���5�����η���3�����η���
	 */
	
	public static void display() {
		for(int a = 1; a != 10; a++) {
			for(int b = 0; b != 10; b++) {
				for(int c = 0; c != 10; c++) {
					int num = a*100 + b*10 + c;
					int num2 = a*a*a + b*b*b + c*c*c;
					if( num == num2) {
						System.out.println(num);
					}
				}
			}
		}
	}
	
	
}
