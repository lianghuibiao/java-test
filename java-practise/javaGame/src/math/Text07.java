package math;


public class Text07 {

	
		// TODO 自动生成的方法存根
		// TODO 自动生成的方法存根
		  public static void main(String[] args){
			 aa fa=new aa();// 无论要引用外面哪一个类  首先得获取到那个类的对象才能调用，不然于事无补  什么作用都没有
		        System.out.println("1+2+3+..+100="+qyq());//在控制台中调用这个函数  调用本类里面的方法
		        System.out.println(fa.fither(10));//调用类外面的类中的方法  不需要用到static修饰符
		    }
		  //创建一个函数     函数里面可以装着参数
		    public static int qyq(){//创建一个qyq函数，增加去定义它的功能
		        int sum=0;
		        for(int i=0;i<101;i++){
		            sum+=i;
		            }
		     return sum;
		  //调用函数得返回
		    
	}
		     ///方法要写到兄弟方法外，不能写在里面
		    
		  
		    
		    }
//相当于定义另外一个class类   因此可以定义各种父类   并且一个父类可以在另一个父类中调用
 class aa{
    public int fither(int b){
    	   int a=10;
    	   int c;
    	   c=a+b;
    	   return c;
    	}

    }	
 //面向对象的思想   
 


