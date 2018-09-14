public class Test1 {
	public static void main(String[] args) {
		int array[]=new int[10];
		for(int i=0;i<array.length;i++)
		{
			array[i]=i;
			System.out.print(array[i]+"\n");
		}
		System.out.print(array);
		int a=array[11];
		System.out.print("\n"+a);
	}
}