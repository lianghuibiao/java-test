package math;

public class text03 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//��ε���ϰ�Ǽ̳�   extends Ԫ�ؽ��е�һ���̳�
		//��������Ƚ���һ�������һ�����࣬ʵ��һ����װ
		//���ȣ����ǿ����ȴ���һ������
		class father{
			public father() {//���췽��
				
			}
			//�����Ա�ķ���
			protected void fatherone() {
				System.out.println("nihao");
			}
			//���ø���Ԫ��
			 //�������ص�������father����
			protected father dolt() {
				return new father();//����һ���µ�father����
			}
		}
		//�̳�    ����˵�ӳи�ҵ   �����ӷ������̳и��������
		//��������Ҫ�ȴ���һ������
		class son extends father{
			public son() {
				super();
				super.fatherone();
				//�нӸ������Բ����ø���ķ���
				
			}
			//����������д����
			public void fatheronenew() {
				//����һ������
			}
			public void fatherone() {
				//��д����ķ��� 
			}
			protected son dolt() {
				return new son();//��д���෽�������ع�����ӷ���
			}
			
		}
		//System.out.println();
	}

}
