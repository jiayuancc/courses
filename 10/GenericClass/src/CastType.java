//ǿ������ת��
public class CastType {
	public static void main(String args[]) {
		Father<Double> father = new Father<Double>(1.0);
		Child<Double, String> child = new Child<Double, String>(200.0, "Java���");
		// ��ͼ���������ת���ɸ��࣬��ȷ
		if ((Father<Double>) child instanceof Father)
			System.out.println("�������ת���ɸ������.");
		// ��ͼ���������ת�������࣬����
		try {
			if ((Child<Double, String>) father instanceof Child)
				System.out.println("�������ת�����������.");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("�����쳣��ԭ�򣺸��������ǿ��ת�����������.");

		}
	}
}