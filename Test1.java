package test;

public class Test1 {
	
	private static int Height = 100;
	
	public static void main(String[] args) {
		int n = 10; //�ڼ���
		System.out.println("��"+ n + "�����ʱ��������"+ all(n) + "��");
	}
	
	
	/**
	 * һ���100�׸߶���������,ÿ����غ�����ԭ�߶ȵ�һ��,
	 * ������,�����ڵ�10�����ʱ,������������?��10�η������?
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
				System.out.println("��"+ n + "�η����߶�Ϊ" + s/2);
				break;
			}else {
				System.out.println("��"+ n + "�η����߶�Ϊ" + s/2);
			}
			sum += (s/2)*2;
			s = s/2;
		}
		return sum+100;
	}
}
