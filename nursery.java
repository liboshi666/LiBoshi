public class nursery {
	public static void main(String[] args) {
		int N=99;//ơ��ƿ��
		for(int bot_num=N;bot_num>=0;bot_num--)//ʵ��ÿ����һ��ơ��ƿ��һ�λ�
		{
			int bot_num_1=bot_num-1;//����һ��ƿ��ƿ֮�����Ŀ
			if(bot_num>2)//��ơ��ƿ����������ʱ��Ӧ�ø���
			{
				System.out.print(bot_num+"bottles of beer on the wall."+bot_num+"bottles of beer.Take one down.Pass it around."+bot_num_1+"bottles of beer on the wall\n" );
			}
			else if(2==bot_num)//��ơ��ƿ���ߺ�ǽ��ʣ��һ��ơ��ƿ
			{
				System.out.print(bot_num+"bottles of beer on the wall."+bot_num+"bottles of beer.Take one down.Pass it around."+bot_num_1+"bottle of beer on the wall\n" );
			}
			else if(1==bot_num)//ֻʣ��һ��ơ��ƿ
			{
				System.out.print(bot_num+"bottles of beer on the wall."+bot_num+"bottles of beer.Take one down.Pass it around."+bot_num_1+"bottle of beer on the wall\n" );
			}
			else System.out.print("No more bottles of beer on the wall\n");//ȫ��������
		}
	}
}