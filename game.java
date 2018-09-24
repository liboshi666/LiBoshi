import java.util.Random;
import java.util.Scanner;
public class game {
	public static int score[]= {0,0,0};//记录游戏比分
	public static int Ran_Num;//存放产生的随机数
	public static int number;//玩家输入的数字
	game(){//初始化
		//score[] = {0,0,0};
		Ran_Num = 0;
		number = 0;
	}
	public static void main(String[] args) {
		System.out.println("游戏开始（一共10轮）：");
		for(int i=0;i<10;i++)
		{
			int a = i+1;//第1-10轮
			System.out.println("第"+a+"轮：");
			Random random = new Random();
			Scanner sc = new Scanner(System.in);
			Ran_Num = random.nextInt(10);//取一个随机数
			System.out.print("请玩家1输入一个0-9的数：");
			number = sc.nextInt();
			if(number == Ran_Num) {
				score[0]++;
			}
			System.out.print("请玩家2输入一个0-9的数：");
			number = sc.nextInt();
			if(number == Ran_Num) {
				score[1]++;
			}
			System.out.print("请玩家3输入一个0-9的数：");
			number = sc.nextInt();
			if(number == Ran_Num) {
				score[2]++;
			}
		}
		System.out.println(score[0]+":"+score[1]+":"+score[2]);
		if(score[0]>score[1]) {
			if(score[0]>score[2])
				System.out.println("玩家1胜出！");
			else if(score[0] == score[2])
				System.out.println("玩家1,3并列第一！");
			else
				System.out.println("玩家3胜出！");
		}
		else if(score[1]>score[2])
				System.out.println("玩家2胜出！");
			else if(score[1] == score[2])
				System.out.println("玩家2,3并列第一！");
			else
				System.out.println("玩家3胜出！");
	}

}
