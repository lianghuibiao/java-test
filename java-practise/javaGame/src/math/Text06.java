package math;

public class Text06 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		 System.out.println(Character.isLetter('a'));//判断内容是否字母   ture  只可直接导入
	        System.out.println(Character.isLetter('5'));  //false
	        System.out.println(Character.isDigit('c'));//判断是否数字
	        System.out.println(Character.isDigit('5'));
	        System.out.println(Character.isWhitespace('c'));
	        System.out.println(Character.isWhitespace(' '));
	        System.out.println(Character.isWhitespace('\n'));
	        System.out.println(Character.isWhitespace('\t'));
	        System.out.println( Character.isUpperCase('c'));
	        System.out.println( Character.isUpperCase('C'));
	        System.out.println(Character.toLowerCase('a'));
	        System.out.println(Character.toLowerCase('A'));
	        System.out.println(Character.toString('a'));
	        System.out.println(Character.toString('A'));
	       
	}

}
