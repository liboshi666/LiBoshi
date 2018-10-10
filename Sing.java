import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Sing {
	public static void main(String[] args) {//��ʼ���б�
        System.out.println("-----------��ӭʹ��ktv----------");
        System.out.println("1-----���Ӹ���");
        System.out.println("2-----ɾ������");
        System.out.println("3-----�л�����");
        System.out.println("4-----������ǰ��һλ");
        System.out.println("5-----�����ö�");
        System.out.println("6-----�˳�����");
        LinkedList linkedlist = new LinkedList();
        ShowMusic(linkedlist);//��ʾ�赥
        while(true) {
        	Scanner scanner = new Scanner(System.in);
        	int number = scanner.nextInt();//����һ�����֣�ѡ�����
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
        		System.out.println("������������������������룡");
                break;
        	}
        }  
    }
	private static void ShowMusic(LinkedList linkedlist) {//��ʾ�赥
		linkedlist.add("���Ҽ���");
		linkedlist.add("�������");
		linkedlist.add("�����¿�");
		linkedlist.add("��·��");
		linkedlist.add("��������");
		linkedlist.add("�����");
	    System.out.println("�赥���и���   ��"+linkedlist.size()+" �� ");
	    System.out.println("�赥�б�Ϊ��");
	    Iterator iter = linkedlist.iterator();//����
	    while(iter.hasNext()) {//�ж��Ƿ�����һ�׸�
	    	String str = (String)iter.next();
	    	System.out.println(str);//�����׸��str������ӡ
	    }
	}
	private static void AddMusic(LinkedList linkedlist) {//���Ӹ���
		System.out.println("��������Ҫ���Ӹ��������ƣ�");
		Scanner scanner = new Scanner(System.in);
		String MusicName = scanner.nextLine();
		if(linkedlist.indexOf(MusicName) == -1) {	//�����ڣ������룬��֮���ӳɹ� 
			linkedlist.addLast(MusicName);			//�����ڣ��򽫸�������������ĩβ 
			System.out.println("���ӳɹ���");
		}
		else {
			System.out.println("��Ҫ���ӵø��������б��У�");
		}
		System.out.println("�赥���и���   ��"+linkedlist.size()+" �� ");
		for (Object object : linkedlist) {//���´�ӡ�赥
            System.out.println(object);
        }
	}
	private static void DelMusic(LinkedList linkedlist) {//ɾ������
		System.out.println("��������Ҫɾ���ĸ������ƣ�");
		Scanner scanner = new Scanner(System.in);
		String MusicName = scanner.nextLine();
		linkedlist.remove(MusicName);//ɾ������
		System.out.println("ɾ���ɹ���");
		System.out.println("�赥���и���   ��"+linkedlist.size()+" �� ");
		for (Object object : linkedlist) {//���´�ӡ�赥
            System.out.println(object);
        }
	}
	private static void SwitchMusic(LinkedList linkedlist) {//�л�����
		linkedlist.removeFirst();
		System.out.println("�и�ɹ���");
		System.out.println("�赥���и���   ��"+linkedlist.size()+" �� ");
		for (Object object : linkedlist) {//���´�ӡ�赥
            System.out.println(object);
        }
	}
	private static void	SetBefore(LinkedList linkedlist) {//������ǰ��һλ
		System.out.println("��������Ҫǰ��һλ�ĸ������ƣ�");
		Scanner scanner = new Scanner(System.in);
		String MusicName = scanner.nextLine();
		int position;
		position = linkedlist.indexOf(MusicName);//�ҵ�������λ��
		if(0 == position) {
			System.out.println("�����Ѿ�����ǰ���޷�ǰ�ƣ�");
		}
		else if(position < 0){
			System.out.println("�������ڸ赥�");
		}
		else {
			linkedlist.remove(MusicName);			//ɾ������
			linkedlist.add(position-1,MusicName);	//����������ԭ��λ��ǰ��һ��
			System.out.println("ǰ��һλ�ɹ���");
			System.out.println("�赥���и���   ��"+linkedlist.size()+" �� ");
			for (Object object : linkedlist) {//���´�ӡ�赥
	            System.out.println(object);
	        }
		}
	}
	private static void SetTop(LinkedList linkedlist) {//�������ö�
		System.out.println("��������Ҫ�ö��ĸ������ƣ�");
		Scanner scanner = new Scanner(System.in);
		String MusicName = scanner.nextLine();
		int position;
		position = linkedlist.indexOf(MusicName);//�ҵ�������λ��
		if(0 == position) {
			System.out.println("�����Ѿ�����ǰ��");
		}
		else if(position < 0) {
			System.out.println("�������ڸ赥�");
		}
		else {
			linkedlist.remove(MusicName);		//ɾ������
			linkedlist.addFirst(MusicName);		//�ڸ赥�ײ����Ӹ���
			System.out.println("�ö��ɹ���");
			System.out.println("�赥���и���   ��"+linkedlist.size()+" �� ");
			for (Object object : linkedlist) {//���´�ӡ�赥
	            System.out.println(object);
	        }
		}
	}
	private static void Exit() {//�˳�
		System.out.println("��л����ʹ�ã�");
        System.out.println("----------�����˳�ϵͳ----------");
        System.exit(0);//�˳�����
	}
}