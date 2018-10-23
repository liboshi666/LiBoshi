import java.util.*;

interface Trans
{
	abstract void TimeMoney(int x);	//计算时间与金钱
	abstract String tostring();		//返回所需的时间与金钱
}
class car1 implements Trans
{
	public int getTicket;	//取票
	public int Sercurity;	//安检
	public int Wait;		//候车
	public int speed;		//速度
	public int go;			//到达车站（机场）
	public int back;		//返回
	public double time;		//时间
	public double money;		//金钱
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
		String S = "汽车所需要的时间为：" + time + "分钟\t汽车所需要的钱为：" + money;
		return S;
	}
}

class Airplane implements Trans
{
	public int getTicket;	//取票
	public int Sercurity;	//安检
	public int Wait;		//候车
	public int speed;		//速度
	public int go;			//到达车站（机场）
	public int back;		//返回
	public double time;		//时间
	public double money;		//金钱
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
		String S = "飞机所需要的时间为：" + time + "分钟\t飞机所需要的钱为：" + money;
		return S;
	}
}

class Highspeed implements Trans
{
	public int getTicket;	//取票
	public int Sercurity;	//安检
	public int Wait;		//候车
	public int speed;		//速度
	public int go;			//到达车站（机场）
	public int back;		//返回
	public double time;		//时间
	public double money;		//金钱
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
		String S = "高地所需要的时间为：" + time + "分钟\t高地所需要的钱为：" + money;
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
		System.out.println("请输入出发地：");
		s = input_string.nextLine();
		System.out.println("请输入目的地：");
		s = input_string.nextLine();
		System.out.println("请输入两地之间的距离：");
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
