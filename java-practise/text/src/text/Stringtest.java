package text;

public class Stringtest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
   //  System.out.println("cc");
		str st=new str();
	  
		System.out.println("string���ͣ�"+st.str("hellojava")+"int���ͣ�"+st.Int(100));
		
	}
	

}
//����һ����  ʵ���������
class str{
	String set="aaa";
	//����ֵ �в��� ���ز���
	public String str(String a) {
		return a;
		
	}
	//int����  �в� 
	//�ֶ�  �ַ���  ���ⲿ����ֶ�  �����ַ���
	public int Int(int b) {
		
		return b;
	}
}


	

