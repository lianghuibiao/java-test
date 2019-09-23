
package protect;
import java.util.Date;
public class Text02 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		//字符串
		//char a[]= {'g','o'};//等价下面一条
		//输出26个英文字母
	/*	char b=64;
		for(int i=0;i<=25;i++) {
			b++;
			System.out.println(b);
		}
		String s=new String("go");*/
		
		//查找字符串长度   索引
		
		//索引可以改进
		/*String s="  sa da   sds fa";
		int b=s.length();
		int c=s.trim().length();//去掉头部空格后的长度
		int q=s.indexOf("a");
		System.out.println(b);
		*/
		Date date=new Date();
		String a=String.format("%tF",date);//日期  年月日
		System.out.println(a);
   
	}

}
