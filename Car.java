import java.util.Scanner;

public class Car {
	public static int N;//输入汽车数量
	public String CarType;//汽车的型号
	public int Tank;//油箱容量
	public int OilConsumption;//百公里耗油量
	public static int num[] = new int[20];//存放油箱容量和百公里耗油
	public static String str[] = new String[10];//存放汽车名
	public Car(){//初始化块
		CarType = "Maserati";
		Tank = 45;
		OilConsumption = 8;
	}
	public void gass() {//加油操作
		System.out.println("Your car needs refueling!");
	}
	public void run() {//运行操作
		System.out.println("Your car is driving on the highway!");
	}
	public static void main(String[] args) {
		//方法1：
		Car c = new Car();//创建新对象c
		Scanner c1 = new Scanner(System.in);
		Scanner c2 = new Scanner(System.in);
		System.out.println("请输入车的数量(个数不大于10)：");
		N = c1.nextInt();
		for(int i=0;i<N;i++){//输入每一台汽车的信息（用数组存储）
			System.out.println("请输入车名：");
			c.CarType = c2.nextLine();
			str[i] = c.CarType;
			System.out.println("请输入油箱容量：");
			c.Tank = c1.nextInt();
			num[i] = c.Tank;
			System.out.println("请输入汽车百公里耗油量：");
			c.OilConsumption = c1.nextInt();
			num[i+1] = c.OilConsumption;
		}
		for(int i=0;i<N;i++) {//输出每一台汽车的信息
			int a = i+1;
			System.out.println("第"+a+"辆车的信息：");
			System.out.println("汽车名："+str[i]);
			System.out.println("油箱容量："+num[i]);
			System.out.println("百公里耗油量："+num[i+1]);
			c.gass();
			c.run();
		}
	}

}
