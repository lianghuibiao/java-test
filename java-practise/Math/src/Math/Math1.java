package Math;

import java.util.Scanner;

public class Math1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		//控制台输入
      Scanner sc=new Scanner(System.in);
      
      int x;
      int y;
      int count=0;
      //输入的是全班多少人   
      x=sc.nextInt();
      //输入选多少个
      y=sc.nextInt();
      
      
      //fact  返回一个
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
