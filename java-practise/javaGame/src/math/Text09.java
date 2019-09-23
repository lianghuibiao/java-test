package math;





public class Text09 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//排序   首先  我们理清一下思路  
	  //定义一个数组  就要使用该数组
		
			int[] array= {65,25,45,7,23,1};
			Text09 sorter=new Text09();
			sorter.sort(array);
	}
	//我们在类中创建一个方法  public就是定义方法的标志
	//该方法的内容正是这个的主题   排序   个人现在的理解
	//这个排序的原理是   第一次在该数组中找到最大的元素放在最后面
	//第二次也是找到除了第一个元素中找到最大的那个数放在倒数第二位  以此类推
	//排到array.length 也就是最后一位时停止对比
	//为什么要创建一个index呢？  是为了从第一个开始   判断句那里  就是为了实现这个替换
	//怎么说，这个算是暴力排序法吧
	
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
