package Math;

import java.util.Scanner;

public class Math1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		//����̨����
      Scanner sc=new Scanner(System.in);
      
      int x;
      int y;
      int count=0;
      //�������ȫ�������   
      x=sc.nextInt();
      //����ѡ���ٸ�
      y=sc.nextInt();
      
      
      //fact  ����һ��
      /*
       * 
       * X+x-1+x-2....
       * ------------
       * 
       * 
       * 
       * 
       * */
      int num=Math1.fact(x)/(Math1.fact(y)*(Math1.fact(x-y)));
      System.out.println(num);

      
      
	}
	 public static int fact(int n){
         int sum=1;
         for (int i=n;i>0;i--) {
                 sum *= i;
         }
     return sum;

 }


}