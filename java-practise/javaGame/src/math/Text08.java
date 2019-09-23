package math;


public class Text08 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		// 5月29 学习的是面向对象的思想   
		//类对象   从类定义一个对象
		//抽象一个对象  面向对象
		//让类在合适的时间内出现
		//定义相关对象的类型
		//创建一个对象   类里面就有属性 方法
		//动态  静态
		//面向对象编程中  一切都是围绕数据展开  我们一个一个对象  里面核心的东西是数据
		//对象是有特殊性的
		//学生类型。。。大家都有不同的地方
		//通过一个学生类型创建整个班  对象是通过一个类来创建的
		//一个类可以创建很多个对象
		//对象中有相应的特征  属性  行为  
		//特殊在属性 行为基本上是一样的
		//求解学生的成绩  对于学生对象来说 他们具有不同特征  学号姓名。。往往是不一样的
		//学生对象  有相应的方法  求解最高分最低分  
		//从行为来说他们基本是一样的   数据是特殊的
		//方法和行为基本都是一样的  对象分类  对象是由什么组成？？？
		//能解决的问题都是从对象出发
		//对象不同  创建超市  创建牙膏都是不同的
		//对象的处理  对象对数据的处理  通过这个问题创建一个对象  来使用对象  
		//对象其实是对数据的处理  数据通过对象里面的方法来执行
		//张三的最大值  李四 的最大值  他们都封装在一个类一个对象离
		//面向对象  面向过程   
		//面向过程  除了面向对象都是面向过程  我们目前做的一些求解都是面向过程
		//c#中的控件就是一个方法  一个对象
		//main  面向过程
		father();  //如果只是一个方法可以直接进行书写调用
		//System.out.println(father());
		
	}
	//创建一个方法调用   达到一物多用的效果
	//调用方法来实践九九乘法表   构造方法
	//方法里面构造函数仅仅是赋值
	public static void father() {
		int a;
		String b="";
		for(int i=1;i<=9;i++) {
			
			for(int j=1;j<=i;j++) {
				a=i*j;
				
				System.out.print(i+"*"+j+"="+a+"\t");
				
				
			}
			System.out.println();
		}
	
		
	}
	//在类里面创建一个方法   面向问题比较复杂  代码量比较大的情况下  
	//行为  方法  方法定义的是行为 
	//面向过程思想  
	//比面向对象思想更早  面向过程还在用  
	//语言没有绝对的好也没有绝对的不好
	//从功能入手   
	//在以上的编程中面向对象没有起到很大作用，甚至显得复杂  
	//但是，当问题变复杂的时候面向对象就会显得很优秀
	//在嵌入式设备中  就是面向过程  
	//数据和方法是一起的   面向过程   没有将对象作为一个整体
	//面向过程中基本没有对象
	//没有一个容器把它装起来
	//对于大型的项目中 就不好  因为数据没有分开
	//张三去买水   李四去买书   共同花钱的问题  不明确钱是谁的  对于方法来说就可以分开 
	//对于面向过程来说就是数据混合的 没有办法分开
	//面向过程重方法轻数据   数据变复杂的时候就很麻烦
	//面向对象思想就可以将数据有序分开  
	//面向过程维护的时候非常麻烦  很难查找  难于维护修改程序
	//面向对象思想就显得比较方便，直接就可以定位到哪一行
	//面向对象语言的三大特性  封装 继承  多态
	//封装  方法是对外的  数据是隐藏的  方法就可以从外面调用
	//方法一般来说都是对外公开的  别人可以使用的  创建一个对象通过方法来对外公开去用
	//方法里面的数据不能轻易的被修改
	//为了保证数据的完整性  所以数据要是隐藏的  可以通过方法来使用这个数据
	//数据对外部来说不能直接用  只能通过方法间接的去使用  封装是将数据和方法封装在一起
	//继承
	//类是通过对象来抽象的  
	//通过类进一步抽象
	//人是动物  人跟动物之间是一个继承之间的关系  
	//就是因为人和动物有着共同的特征
	//将许多个类 将共同的东西抽取出来
	//我定义一个动物的一个类型   我定义一个人的类型
	//从动物中抽取到人的一些东西
	//我定义了一个动物类  我定义一个牛 一个马我可以省略很多
	//反复使用共同的东西
	//多态
	//两种多态  一种叫重载 一种叫重写
	//方法名 求最高的那个学生  求解一列  另一列  方法的重载 
	//通过参数   我想要求解一列的  就定义一列的参数
	//根据自己的特征做出训练的不同内容  并不会做一个事情
	//这时候就需要重写
	//认识类
	//是对同一个对象的抽象 
	//求解学生成绩 
	//对于学生来说具有什么样的特征
	//都有学号 姓名  。。。
	//具有相同的特征
	//对象是类的实例   我是学生  我是通过学生这个类型来创建的
	//对对象来说  一个是静态  一个是动态  一个特征
	//创建一个学生的信息   使用这个学生  显示这个学生也是
	//class类型  对于class  有一个show方法    单击按钮的时候就会显示
	//xx.show可以显示到   class  xx   中的show方法
	//类中的方法  可以反复使用   对象也可以反复使用
	//类是模板  对象是产品
	//类是可以嵌套的  
	//我要定义一个机器人 我可以从一个螺丝一块板定义   我直接定义头  四肢  手 脚  躯干
	//头  手  脚 躯干  都是一个类里面的 
	/*
	 * 
	 * 实验阶段  
	 * 嵌套类 
	 * 在类里面定义类
	 * 通过类可以创建很多个对象
	 * 字段  构造方法
	 * 一般来说  肯定要有构造方法 public a()构造方法
	 * 如果没有，那么系统辉自动添加一个无参的构造方法
	 * 如果有，那么系统就不会自动添加一个无参的构造方法，所以一般情况下无参的构造方法应该手动添加
	 * 类是可以嵌套的
	 * 类的成员  字段  属性 方法
	 * public a(int a){
	 * this.ml=ml
	 * }
	 * 
	 * */
	//private  自己用的意思   私有的
	//学生类型  字段   构造方法  公有public 
	//一般情况下  有几个字段  就有几个构造方法参数  
	//赋值  
	//属性
	//属性在方法中是属性访问器 
	//字段不能在外面访问  
	//对象外部可以借助属性来间接访问字段
	//需要字段同时要用到属性的时候  用大写字母开头
	//public string Name{代码}
	//属性  get  set   一个读一个写  
	//get 返回一个值     set将一个值赋值给。。
	
	//静态特征  动态特征
	//属性是间接访问数据的   外面看不到数据的
	//方法是为了处理这个数据的
	//去买瓶水  钱减少  方法就是这个   
	//构造方法  给这个数据进行初始化的
	//围绕着数据进行展开
	//方法一般是public  
	//方法是用来处理数据的  
	/*
	 * 练习阶段
	 * 定义一个类  一般来说首字母大写
	 * 定义字段 private 私有的
	 * private string name;
	 * public  string Name;{
	 * get{return name;}
	 * set{name=value;}
	 * }
	 * 
	 * 
	 * 
	 * 
	 * */
	public int son() {
		int a ;
		a=10;
		return a;
	}
}
