package math;



public class Text13 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
      //这节课讲面向对象  属性
		//面向对象  面向思想  主要是创建对象和使用对象
		//掌握好面向对象   难点在怎么创建对象  要有类型
		//根据对象来定义类
		//类是什么要搞清楚  类对对象来创建对象  类是对对象的抽象
		//我们首先要了解对象
		//如果你对类 或者对象很了解了  直接定义一个对象
		//对象是类的实例
		//你需要对对象了解  如果你了解了对象  你定义对象就很简单 
		//如果类定义好了   创建一个对象更简单
		//对象分为两类   一类是静态特征  一类是动态特征
		//身份证号码  属于静特征   动态特征说的是对象的行为能力   更清楚的就是对数据的处理
		//动态特征围绕着数据
		//
		gaokao aGaokao=new gaokao();
		System.out.println(aGaokao.gaokao());
		
	}

}

class gaokao{
	public String gaokao() {
		String a="";
	 int b=0;
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++){
				b=i*j;
				a+=i+"*"+j+"="+b+"\t";
				
			}
			
			}
		return a;
		
		}
	
	}

