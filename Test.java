import java.util.Scanner;

public class Test {
	public static int N;//输入汽车数量
	public String CarType;//汽车的型号
	public int Tank;//油箱容量
	public int OilConsumption;//百公里耗油量
	public Test(){//初始化块
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
		Test []c = new Test[10];//创建新对象c(用数组对象）
		for(int i=0;i<10;i++) {
			c[i]=new Test();
		}
		Scanner c1 = new Scanner(System.in);
		Scanner c2 = new Scanner(System.in);
		System.out.println("请输入车的数量(个数不大于10)：");
		N = c1.nextInt();
		for(int i=0;i<N;i++){//输入每一台汽车的信息
			System.out.println("请输入车名：");
			c[i].CarType = c2.nextLine();
			System.out.println("请输入油箱容量：");
			c[i].Tank = c1.nextInt();
			System.out.println("请输入汽车百公里耗油量：");
			c[i].OilConsumption = c1.nextInt();
		}
		for(int i=0;i<N;i++) {//输出每一台汽车的信息
			int a = i+1;
			System.out.println("第"+a+"辆车的信息：");
			System.out.println("汽车名："+c[i].CarType);
			System.out.println("油箱容量："+c[i].Tank);
			System.out.println("百公里耗油量："+c[i].OilConsumption);
			c[i].gass();
			c[i].run();
		}
	}

}