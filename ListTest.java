import java.util.*;
public class ListTest {
	public static int N = 200000;//�����е�����
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();//��ʼ������
		for(int i=0;i<N;i++)//��������ֵ
		{
			list.add(i);
		}
		long sumtime = 0;//��¼ʱ��
		for(int i=0;i<N;i++)//�������
		{
			//int number = (int) (Math.random()* list.size());//�����������ȡһ����
			long startTime = System.nanoTime();	 			//��ȡ��ʼʱ��
			list.indexOf(i);					 				//���������ҵ��Ǹ���
			long endTime = System.nanoTime();  				//��ȡ����ʱ��
			long time = endTime - startTime;				//��¼һ��ʱ��
			sumtime = sumtime + time;						//��¼��ʱ��	
		}
		long time = sumtime/N;
		System.out.println("��������ʱ�䣺" + time + "ns");    //�����������ʱ��
	}
}
