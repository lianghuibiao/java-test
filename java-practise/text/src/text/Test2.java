package text;
import java.awt.*;
import java.util.Scanner;




public class Test2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc=new Scanner(System.in);
		//scanner ������������
		String name,gander;
		int age;
		System.out.println("��������");
		name=sc.nextLine();
		System.out.println("�����Ա�");
		gander=sc.nextLine();
		System.out.println("��������");
		age=sc.nextInt();
		//�����ַ������͵���ֵ
		System.out.println("������������ǣ�"+name);
		System.out.println("��������Ա��ǣ�"+gander);
		System.out.println("������������ǣ�"+age);
		
	}

}