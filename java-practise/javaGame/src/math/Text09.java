package math;





public class Text09 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//����   ����  ��������һ��˼·  
	  //����һ������  ��Ҫʹ�ø�����
		
			int[] array= {65,25,45,7,23,1};
			Text09 sorter=new Text09();
			sorter.sort(array);
	}
	//���������д���һ������  public���Ƕ��巽���ı�־
	//�÷����������������������   ����   �������ڵ����
	//��������ԭ����   ��һ���ڸ��������ҵ�����Ԫ�ط��������
	//�ڶ���Ҳ���ҵ����˵�һ��Ԫ�����ҵ������Ǹ������ڵ����ڶ�λ  �Դ�����
	//�ŵ�array.length Ҳ�������һλʱֹͣ�Ա�
	//ΪʲôҪ����һ��index�أ�  ��Ϊ�˴ӵ�һ����ʼ   �жϾ�����  ����Ϊ��ʵ������滻
	//��ô˵��������Ǳ������򷨰�
	
	    public void sort(int[] array) {
	    	int index;
	    	for(int i=1;i<array.length;i++) {
	    		index=0;
	    		for(int j=1;j<=array.length-i;j++) {
	    			if(array[j]>array[index]) {
	    				index=j;
	    			}
	    		
	    	}
	    		int temp=array[array.length-i];
	    		array[array.length-i]=array[index];
	    		array[index]=temp;
	    }
	    	showArray(array);
	}
     public void showArray(int[] array) {
    	 for(int i:array) {
    		 System.out.print(">"+i);
    	 }
    	 System.out.println();
     }
}
