import java.util.Scanner;
public class QQtest {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);			// ����ɨ����
        System.out.println("����������QQ�ȼ���");
        int i = scan.nextInt();							// �����û�����ĵȼ�
		if(i==1)
			System.out.println("���Ļ�Ծ����Ϊ5��");
		else if(i==4)
			System.out.println("���Ļ�Ծ����Ϊ32��");
		else if(i==8)
			System.out.println("���Ļ�Ծ����Ϊ96��");
		else if(i==12)
			System.out.println("���Ļ�Ծ����Ϊ192��");
		else if(i==16)
			System.out.println("���Ļ�Ծ����Ϊ320��");
		else if(i==32)
			System.out.println("���Ļ�Ծ����Ϊ1152��");
		else if(i==48)
			System.out.println("���Ļ�Ծ����Ϊ2496��");
		else if(i==64)
			System.out.println("���Ļ�Ծ����Ϊ4352��");
		else
			System.out.println("�Բ������Ļ�Ծ������ʱδ֪");
	}
}