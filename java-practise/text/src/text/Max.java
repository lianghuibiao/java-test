package text;

public class Max {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//ɸѡ���������������ֵ����Сֵ   
     maxnum ma=new maxnum();
     min mi=new min();
     System.out.println("���ֵ��"+ma.max(30, 44.5));
   
	}

}
//ѡ���������������ֵ  ��������������ͬ�ǻ��л�ɫ������
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
