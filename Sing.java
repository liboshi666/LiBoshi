import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Sing {
	public static void main(String[] args) {//初始化列表
        System.out.println("-----------欢迎使用ktv----------");
        System.out.println("1-----添加歌曲");
        System.out.println("2-----删除歌曲");
        System.out.println("3-----切换歌曲");
        System.out.println("4-----将歌曲前移一位");
        System.out.println("5-----歌曲置顶");
        System.out.println("6-----退出程序");
        LinkedList linkedlist = new LinkedList();
        ShowMusic(linkedlist);//显示歌单
        while(true) {
        	Scanner scanner = new Scanner(System.in);
        	int number = scanner.nextInt();//输入一个数字，选择操作
        	switch(number){
        	case 1:
        		AddMusic(linkedlist);
        		break;
        	case 2:
        		DelMusic(linkedlist);
        		break;
        	case 3:
        		SwitchMusic(linkedlist);
        		break;
        	case 4:
        		SetBefore(linkedlist);
        		break;
        	case 5:
        		SetTop(linkedlist);
        	case 6:
        		Exit();
        		break;
        	default:
        		System.out.println("您输入的数字有误，请重新输入！");
                break;
        	}
        }  
    }
	private static void ShowMusic(LinkedList linkedlist) {//显示歌单
		linkedlist.add("独家记忆");
		linkedlist.add("告白气球");
		linkedlist.add("等你下课");
		linkedlist.add("卡路里");
		linkedlist.add("浪人琵琶");
		linkedlist.add("起风了");
	    System.out.println("歌单中有歌曲   ："+linkedlist.size()+" 首 ");
	    System.out.println("歌单列表为：");
	    Iterator iter = linkedlist.iterator();//迭代
	    while(iter.hasNext()) {//判断是否有下一首歌
	    	String str = (String)iter.next();
	    	System.out.println(str);//将下首歌给str，并打印
	    }
	}
	private static void AddMusic(LinkedList linkedlist) {//添加歌曲
		System.out.println("请输入需要添加歌曲的名称：");
		Scanner scanner = new Scanner(System.in);
		String MusicName = scanner.nextLine();
		if(linkedlist.indexOf(MusicName) == -1) {	//若存在，则不输入，反之添加成功 
			linkedlist.addLast(MusicName);			//不存在，则将歌曲添加至集合末尾 
			System.out.println("添加成功！");
		}
		else {
			System.out.println("您要添加得歌曲已在列表中！");
		}
		System.out.println("歌单中有歌曲   ："+linkedlist.size()+" 首 ");
		for (Object object : linkedlist) {//重新打印歌单
            System.out.println(object);
        }
	}
	private static void DelMusic(LinkedList linkedlist) {//删除歌曲
		System.out.println("请输入需要删除的歌曲名称：");
		Scanner scanner = new Scanner(System.in);
		String MusicName = scanner.nextLine();
		linkedlist.remove(MusicName);//删除歌曲
		System.out.println("删除成功！");
		System.out.println("歌单中有歌曲   ："+linkedlist.size()+" 首 ");
		for (Object object : linkedlist) {//重新打印歌单
            System.out.println(object);
        }
	}
	private static void SwitchMusic(LinkedList linkedlist) {//切换歌曲
		linkedlist.removeFirst();
		System.out.println("切歌成功！");
		System.out.println("歌单中有歌曲   ："+linkedlist.size()+" 首 ");
		for (Object object : linkedlist) {//重新打印歌单
            System.out.println(object);
        }
	}
	private static void	SetBefore(LinkedList linkedlist) {//将歌曲前置一位
		System.out.println("请输入需要前置一位的歌曲名称：");
		Scanner scanner = new Scanner(System.in);
		String MusicName = scanner.nextLine();
		int position;
		position = linkedlist.indexOf(MusicName);//找到歌曲的位置
		if(0 == position) {
			System.out.println("歌曲已经在最前，无法前移！");
		}
		else if(position < 0){
			System.out.println("歌曲不在歌单里！");
		}
		else {
			linkedlist.remove(MusicName);			//删除歌曲
			linkedlist.add(position-1,MusicName);	//将歌曲插入原来位置前面一个
			System.out.println("前移一位成功！");
			System.out.println("歌单中有歌曲   ："+linkedlist.size()+" 首 ");
			for (Object object : linkedlist) {//重新打印歌单
	            System.out.println(object);
	        }
		}
	}
	private static void SetTop(LinkedList linkedlist) {//将歌曲置顶
		System.out.println("请输入需要置顶的歌曲名称：");
		Scanner scanner = new Scanner(System.in);
		String MusicName = scanner.nextLine();
		int position;
		position = linkedlist.indexOf(MusicName);//找到歌曲的位置
		if(0 == position) {
			System.out.println("歌曲已经在最前！");
		}
		else if(position < 0) {
			System.out.println("歌曲不在歌单里！");
		}
		else {
			linkedlist.remove(MusicName);		//删除歌曲
			linkedlist.addFirst(MusicName);		//在歌单首部添加歌曲
			System.out.println("置顶成功！");
			System.out.println("歌单中有歌曲   ："+linkedlist.size()+" 首 ");
			for (Object object : linkedlist) {//重新打印歌单
	            System.out.println(object);
	        }
		}
	}
	private static void Exit() {//退出
		System.out.println("感谢您的使用！");
        System.out.println("----------您已退出系统----------");
        System.exit(0);//退出程序
	}
}
