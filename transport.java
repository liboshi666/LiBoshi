import java.util.*;

abstract class Trans
{
	public int getTicket;	//ȡƱ
	public int Sercurity;	//����
	public int Wait;		//��
	public int speed;		//�ٶ�
	public int go;			//���ﳵվ��������
	public int back;		//����
	public double time;		//ʱ��
	public double money;		//��Ǯ
	abstract void TimeMoney(int x);	//����ʱ�����Ǯ
	abstract String tostring();		//���������ʱ�����Ǯ
}
class car1 extends Trans
{
	public car1() {
		getTicket = 5;
		Sercurity = 5;
		Wait = 5;
		speed = 60;
		go = 30;
		back = 30;
		time = 0;
		money = 0;
	}
	public void TimeMoney(int x) {
		int time_1 = x/speed;
		time = time_1 * 60 + getTicket + Sercurity + Wait  + go + back;
		money = (double) (0.32 * x);
	}
	public String tostring() {
		String S = "��������Ҫ��ʱ��Ϊ��" + time + "����\t��������Ҫ��ǮΪ��" + money;
		return S;
	}
}

class Airplane extends Trans
{
	public Airplane() {
		getTicket = 10;
		Sercurity = 30;
		Wait = 50;
		speed = 450;
		go = 60;
		back = 60;
		time = 0;
		money = 0;
	}
	public void TimeMoney(int x) {
		int time_1 = x/speed;
		time = time_1 * 60 + getTicket + Sercurity + Wait  + go + back;
		money = (double) (0.75 * x);
	}
	public String tostring() {
		String S = "�ɻ�����Ҫ��ʱ��Ϊ��" + time + "����\t�ɻ�����Ҫ��ǮΪ��" + money;
		return S;
	}
}

class Highspeed extends Trans
{
	public Highspeed() {
		getTicket = 5;
		Sercurity = 5;
		Wait = 20;
		speed = 200;
		go = 40;
		back = 40;
		time = 0;
		money = 0;
	}
	public void TimeMoney(int x) {
		int time_1 = x/speed;
		time = time_1 * 60 + getTicket + Sercurity + Wait  + go + back;
		money = (double) (0.45 * x);
	}
	public String tostring() {
		String S = "�ߵ�����Ҫ��ʱ��Ϊ��" + time + "����\t�ߵ�����Ҫ��ǮΪ��" + money;
		return S;
	}
}
public class transport {
	public static void main(String[] args)
    {
		int x;
		String s;
		Scanner input_string = new Scanner(System.in);
		Scanner input_int = new Scanner(System.in);
		System.out.println("����������أ�");
		s = input_string.nextLine();
		System.out.println("������Ŀ�ĵأ�");
		s = input_string.nextLine();
		System.out.println("����������֮��ľ��룺");
		x = input_int.nextInt();
		Trans t[] = new Trans[3];
		t[0] = new car1();
		t[1] = new Airplane();
		t[2] = new Highspeed();
		for(int i = 0;i < 3;i++) {
			t[i].TimeMoney(x);
			System.out.println(t[i].tostring());
		}
    }
}