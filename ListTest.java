import java.util.*;
public class ListTest {
	public static int N = 200000;//链表中的总数
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();//初始化链表
		for(int i=0;i<N;i++)//给链表赋值
		{
			list.add(i);
		}
		long sumtime = 0;//记录时间
		for(int i=0;i<N;i++)//计算次数
		{
			//int number = (int) (Math.random()* list.size());//从链表中随机取一个数
			long startTime = System.nanoTime();	 			//获取开始时间
			list.indexOf(i);					 				//从链表中找到那个数
			long endTime = System.nanoTime();  				//获取结束时间
			long time = endTime - startTime;				//记录一个时间
			sumtime = sumtime + time;						//记录总时间	
		}
		long time = sumtime/N;
		System.out.println("程序运行时间：" + time + "ns");    //输出程序运行时间
	}
}

