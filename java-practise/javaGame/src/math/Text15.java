package math;

public class Text15 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
       //����  ��   �÷�����ӡ�žų˷���
		//�������  ��һ����void�ķ��� ��������  ��һ��void����������
		fun q = new fun();
		//q.fun();
		q.fun2();
	}

}
class fun {
	public void fun() {
		int a=0;
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				a=i*j;
				System.out.print(i+"*"+j+"="+a+"\t");
			}
			System.out.println();
		}
	}
	public void fun1(int a) {
		int c=0;
		for(int i = 1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				c=i*j;
				System.out.println(c);
			}
			
		}
		
	}
	public int fun2() {
		int a = 0;
		for(int i = 1;i<=9;i++) {
			
			a=i;
		}
		return a;
	}
	
}
