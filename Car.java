import java.util.Scanner;

public class Car {
	public static int N;//������������
	public String CarType;//�������ͺ�
	public int Tank;//��������
	public int OilConsumption;//�ٹ��������
	public static int num[] = new int[20];//������������Ͱٹ������
	public static String str[] = new String[10];//���������
	public Car(){//��ʼ����
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
		//����1��
		Car c = new Car();//�����¶���c
		Scanner c1 = new Scanner(System.in);
		Scanner c2 = new Scanner(System.in);
		System.out.println("�����복������(����������10)��");
		N = c1.nextInt();
		for(int i=0;i<N;i++){//����ÿһ̨��������Ϣ��������洢��
			System.out.println("�����복����");
			c.CarType = c2.nextLine();
			str[i] = c.CarType;
			System.out.println("����������������");
			c.Tank = c1.nextInt();
			num[i] = c.Tank;
			System.out.println("�����������ٹ����������");
			c.OilConsumption = c1.nextInt();
			num[i+1] = c.OilConsumption;
		}
		for(int i=0;i<N;i++) {//���ÿһ̨��������Ϣ
			int a = i+1;
			System.out.println("��"+a+"��������Ϣ��");
			System.out.println("��������"+str[i]);
			System.out.println("����������"+num[i]);
			System.out.println("�ٹ����������"+num[i+1]);
			c.gass();
			c.run();
		}
	}

}