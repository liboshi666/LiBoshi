import java.util.Scanner;

public class Test {
	public static int N;//������������
	public String CarType;//�������ͺ�
	public int Tank;//��������
	public int OilConsumption;//�ٹ��������
	public Test(){//��ʼ����
		CarType = "Maserati";
		Tank = 45;
		OilConsumption = 8;
	}
	public void gass() {//���Ͳ���
		System.out.println("Your car needs refueling!");
	}
	public void run() {//���в���
		System.out.println("Your car is driving on the highway!");
	}
	public static void main(String[] args) {
		Test []c = new Test[10];//�����¶���c(���������
		for(int i=0;i<10;i++) {
			c[i]=new Test();
		}
		Scanner c1 = new Scanner(System.in);
		Scanner c2 = new Scanner(System.in);
		System.out.println("�����복������(����������10)��");
		N = c1.nextInt();
		for(int i=0;i<N;i++){//����ÿһ̨��������Ϣ
			System.out.println("�����복����");
			c[i].CarType = c2.nextLine();
			System.out.println("����������������");
			c[i].Tank = c1.nextInt();
			System.out.println("�����������ٹ����������");
			c[i].OilConsumption = c1.nextInt();
		}
		for(int i=0;i<N;i++) {//���ÿһ̨��������Ϣ
			int a = i+1;
			System.out.println("��"+a+"��������Ϣ��");
			System.out.println("��������"+c[i].CarType);
			System.out.println("����������"+c[i].Tank);
			System.out.println("�ٹ����������"+c[i].OilConsumption);
			c[i].gass();
			c[i].run();
		}
	}

}