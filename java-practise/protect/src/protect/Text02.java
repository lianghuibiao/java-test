
package protect;
import java.util.Date;
public class Text02 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		//�ַ���
		//char a[]= {'g','o'};//�ȼ�����һ��
		//���26��Ӣ����ĸ
	/*	char b=64;
		for(int i=0;i<=25;i++) {
			b++;
			System.out.println(b);
		}
		String s=new String("go");*/
		
		//�����ַ�������   ����
		
		//�������ԸĽ�
		/*String s="  sa da   sds fa";
		int b=s.length();
		int c=s.trim().length();//ȥ��ͷ���ո��ĳ���
		int q=s.indexOf("a");
		System.out.println(b);
		*/
		Date date=new Date();
		String a=String.format("%tF",date);//����  ������
		System.out.println(a);
   
	}

}
