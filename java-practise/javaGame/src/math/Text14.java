package math;

public class Text14 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		text qq=new text();
     qq.aa();
	}

}
//��ӡһǧ���ڵ�ȫ������
class text{
     
	public void aa() {
     for(int a =2;a<=1000;a++) {
      boolean q=true;
      for(int i=2;i<a;i++) {
    	  if(a%i==0) {
    		  //ֻҪa=i��ֹͣѭ��
    		  //�Ѿ�֪��a�Ƿ�����
    		  q=false;
    		  
    		  break;
    	  }
    	
      }
      if(q) {
    	  System.out.println(a);
      }
     }
     // System.out.println(q?a+"������":a+"��������");
    		  
	
	}
	
	
}
