package text;

public class Max {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//筛选出两个参数的最大值和最小值   
     maxnum ma=new maxnum();
     min mi=new min();
     System.out.println("最大值："+ma.max(30, 44.5));
   
	}

}
//选出两个参数的最大值  类名跟函数名相同是会有黄色报错的
class maxnum{
	public double max(double x,double y) {
		if (x>y) {
			return x;
		}
		else {
			return y;
		}
		}
	}
class min{
	public double minnum(double x,double y) {
		if (x<y) {
			return x;
		}
		else {
			return y;
		}
		}
}

