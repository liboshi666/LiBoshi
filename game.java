import java.util.Random;
import java.util.Scanner;
public class game {
	public static int score[]= {0,0,0};//��¼��Ϸ�ȷ�
	public static int Ran_Num;//��Ų����������
	public static int number;//������������
	game(){//��ʼ��
		//score[] = {0,0,0};
		Ran_Num = 0;
		number = 0;
	}
	public static void main(String[] args) {
		System.out.println("��Ϸ��ʼ��һ��10�֣���");
		for(int i=0;i<10;i++)
		{
			int a = i+1;//��1-10��
			System.out.println("��"+a+"�֣�");
			Random random = new Random();
			Scanner sc = new Scanner(System.in);
			Ran_Num = random.nextInt(10);//ȡһ�������
			System.out.print("�����1����һ��0-9������");
			number = sc.nextInt();
			if(number == Ran_Num) {
				score[0]++;
			}
			System.out.print("�����2����һ��0-9������");
			number = sc.nextInt();
			if(number == Ran_Num) {
				score[1]++;
			}
			System.out.print("�����3����һ��0-9������");
			number = sc.nextInt();
			if(number == Ran_Num) {
				score[2]++;
			}
		}
		System.out.println(score[0]+":"+score[1]+":"+score[2]);
		if(score[0]>score[1]) {
			if(score[0]>score[2])
				System.out.println("���1ʤ����");
			else if(score[0] == score[2])
				System.out.println("���1,3���е�һ��");
			else
				System.out.println("���3ʤ����");
		}
		else if(score[1]>score[2])
				System.out.println("���2ʤ����");
			else if(score[1] == score[2])
				System.out.println("���2,3���е�һ��");
			else
				System.out.println("���3ʤ����");
	}

}