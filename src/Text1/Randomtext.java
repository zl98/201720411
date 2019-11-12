package Text1;

import java.util.Random;

public class Randomtext {
	static String []eqution=new String[60];
	static int []result=new int[60];
	public static  void printHeader1() {
		System.out.println("..............................");
		System.out.println("-程序输出50道100以内的加减法算式的习题-");
		System.out.println("-每次运行程序可得到一套50道题的习题及答案-");
		System.out.println("..............................");
		for(int i=1;i<=50;i++){
			System.out.print("第"+i+"题："+eqution[i]);	
			if(i%5==0){
				System.out.println();
			}
			else{
				System.out.print("\t");
			}
		}
		System.out.println();
	}//程序功能提示方法
	
	public static void printHeader2() {
		System.out.println("..............................");
		System.out.println("-下面是习题的参考答案");
		System.out.println("..............................");
		for(int i=1;i<=50;i++){
			System.out.print("第"+i+"题答案：");
			if(i%5==0)
				System.out.println(result[i]);
			else
				System.out.print(result[i]+"\t");
		}
	}
	
	public static void produce() {
		Random r=new Random();
		@SuppressWarnings("unused")
		String s;
		@SuppressWarnings("unused")
		int sum=0;
		
		for(int i=0;i<50;i++) {
			int a=r.nextInt(101);//产生100以内的随机数
		    int b=r.nextInt(101);//产生100以内的随机数
		    int c=r.nextInt(2);
		    if(c==1) {
		    	sum=a+b;
		    	s=a+"+"+b+"=";
		    }
		    else {
		    	sum=a-b;
		    	s=a+"-"+b+"=";
		    }
		    eqution[i]=s;
		    result[i]=sum;
		    if(sum<0||sum>100){//检测范围
				i--;
				continue;
			}
			for(int j=1;j<i;j++){//检测重复
				if(s==eqution[j]){
					i--;
					break;
				}
			}
		}
	}
	public static void main(String args[]){
		produce();
		printHeader1();
		printHeader2();
	}
}
