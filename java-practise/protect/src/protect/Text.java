package protect;

public class Text {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int x=20;{
			int y=40;
			System.out.println(y);  //40
			int z=245;
			boolean b;{
				b=y>z;
				System.out.println(b);   //flash
			}
		}
		String word="hello java";
    System.out.println(word);//hello java
	}

}
