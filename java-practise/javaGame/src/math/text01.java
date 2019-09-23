package math;

public class text01 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
    //int a =10;
    //String b ="aaa";
    //String c;
    //c=a+b;
    //System.out.println(c);
    //自动拼接  类型自动转化
    Object qq=new Object();
     
    //System.out.println(qq);
    //创建一维数组
    int[] y= new int[]{1,2,3,4,5};
   
    for(int i=0;i<5;i++) {
    	//System.out.println(y[i]);
    }
    //二维数组的建立
    //问题1  比较数组中的大小
    int [ ][ ]  arr={{22,15,32,20,18},{12,21,25,19,33},{14,58,34,24,66},};
   // for(int i=0;i<3;i++) {
    	//for(int j=0;j<5;j++) {
    		//每一位之间都进行比较
    		int [ ]  arr1={22,15,32,20,18};
    		
    		for(int s=0;s<arr1.length-1;s++) {
    			//第一个和第二个比较
    				if(arr1[s]<arr1[s+1]) {
    					if(arr1[s+1]<arr1[s+2]) {
    						if(arr1[s+2]<arr1[s+3]) {
            					
    							if(arr1[s+3]<arr1[s+4]) {
    								
    	    	    				
    	    	    				
    	    	    			}
        	    				
        	    			}
    	    				
    	    				
    	    			}
    				
    				
    			}
    			
    				System.out.println(arr1[s+1]);
    		}

    		
    		//System.out.println(arr[i][j]);
    	}
   // }
     
    
	//}
   
}



