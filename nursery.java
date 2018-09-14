public class nursery {
	public static void main(String[] args) {
		int N=99;//啤酒瓶数
		for(int bot_num=N;bot_num>=0;bot_num--)//实现每拿走一个啤酒瓶唱一段话
		{
			int bot_num_1=bot_num-1;//拿走一个瓶酒瓶之后的数目
			if(bot_num>2)//当啤酒瓶多于两个的时候应用复数
			{
				System.out.print(bot_num+"bottles of beer on the wall."+bot_num+"bottles of beer.Take one down.Pass it around."+bot_num_1+"bottles of beer on the wall\n" );
			}
			else if(2==bot_num)//当啤酒瓶拿走后墙上剩下一个啤酒瓶
			{
				System.out.print(bot_num+"bottles of beer on the wall."+bot_num+"bottles of beer.Take one down.Pass it around."+bot_num_1+"bottle of beer on the wall\n" );
			}
			else if(1==bot_num)//只剩下一个啤酒瓶
			{
				System.out.print(bot_num+"bottles of beer on the wall."+bot_num+"bottles of beer.Take one down.Pass it around."+bot_num_1+"bottle of beer on the wall\n" );
			}
			else System.out.print("No more bottles of beer on the wall\n");//全部拿完了
		}
	}
}