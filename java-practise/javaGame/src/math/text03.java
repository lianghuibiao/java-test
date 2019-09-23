package math;

public class text03 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//这次的练习是继承   extends 元素进行的一个继承
		//这次我们先建立一个父类和一个子类，实现一个封装
		//首先，我们可以先创建一个父类
		class father{
			public father() {//构造方法
				
			}
			//定义成员的方法
			protected void fatherone() {
				System.out.println("nihao");
			}
			//调用父级元素
			 //方法返回的类型是father类型
			protected father dolt() {
				return new father();//返回一个新的father类型
			}
		}
		//继承    人们说子承父业   那用子方法来继承父类的属性
		//首先我们要先创建一个子类
		class son extends father{
			public son() {
				super();
				super.fatherone();
				//承接父类属性并调用父类的方法
				
			}
			//接下来是重写父类
			public void fatheronenew() {
				//新增一个方法
			}
			public void fatherone() {
				//重写父类的方法 
			}
			protected son dolt() {
				return new son();//重写父类方法并返回构造的子方法
			}
			
		}
		//System.out.println();
	}

}
