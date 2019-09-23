package math;

public class Text14 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		text qq=new text();
     qq.aa();
	}

}
//打印一千以内的全部素数
class text{
     
	public void aa() {
     for(int a =2;a<=1000;a++) {
      boolean q=true;
      for(int i=2;i<a;i++) {
    	  if(a%i==0) {
    		  //只要a=i就停止循环
    		  //已经知道a是非素数
    		  q=false;
    		  
    		  break;
    	  }
    	
      }
      if(q) {
    	  System.out.println(a);
      }
     }
     // System.out.println(q?a+"是素数":a+"不是素数");
    		  
	
	}
	
	
}
