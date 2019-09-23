package text;

public class Stringtest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
   //  System.out.println("cc");
		str st=new str();
	  
		System.out.println("string类型："+st.str("hellojava")+"int类型："+st.Int(100));
		
	}
	

}
//创建一个类  实例化类对象
class str{
	String set="aaa";
	//返回值 有参数 返回参数
	public String str(String a) {
		return a;
		
	}
	//int类型  有参 
	//字段  字符串  在外部添加字段  引入字符串
	public int Int(int b) {
		
		return b;
	}
}


	

