package math;

public class Text15 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
       //需求  ：   用方法打印九九乘法表
		//需求改良  用一个非void的方法 不带参数  和一个void方法带参数
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
