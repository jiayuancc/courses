import java.util.Scanner;
public class PersonalIncomeTax {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);// 创建扫描器
        System.out.println("请输入您的工资额（去除五险一金后）：");
        int i = scan.nextInt();// 接收用户输入的等级
        if(i<=3500)
			System.out.println("您不需要纳税");
		else if(0<i-3500&&i-3500<=1500)
			System.out.println("您的纳税金额为:"+((i-3500)*0.03));
		else if(1500<i-3500&&i-3500<=4500)
			System.out.println("您的纳税金额为:"+((i-3500)*0.1-105));
		else if(4500<i-3500&&i-3500<=9000)
			System.out.println("您的纳税金额为:"+((i-3500)*0.2-555));
		else if(9000<i-3500&&i-3500<=35000)
			System.out.println("您的纳税金额为:"+((i-3500)*0.25-1005));
		else if(35000<i-3500&&i-3500<=55000)
			System.out.println("您的纳税金额为:"+((i-3500)*0.3-2755));
		else if(55000<i-3500&&i-3500<=80000)
			System.out.println("您的纳税金额为:"+((i-3500)*0.35-5505));
		else
			System.out.println("您的纳税金额为:"+((i-3500)*0.45-13505));
	}

}
