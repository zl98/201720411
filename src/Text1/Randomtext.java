package Text1;

import java.util.Random;

public class Randomtext {
	static String []eqution=new String[60];
	static int []result=new int[60];
	public static  void printHeader1() {
		System.out.println("..............................");
		System.out.println("-�������50��100���ڵļӼ�����ʽ��ϰ��-");
		System.out.println("-ÿ�����г���ɵõ�һ��50�����ϰ�⼰��-");
		System.out.println("..............................");
		for(int i=1;i<=50;i++){
			System.out.print("��"+i+"�⣺"+eqution[i]);	
			if(i%5==0){
				System.out.println();
			}
			else{
				System.out.print("\t");
			}
		}
		System.out.println();
	}//��������ʾ����
	
	public static void printHeader2() {
		System.out.println("..............................");
		System.out.println("-������ϰ��Ĳο���");
		System.out.println("..............................");
		for(int i=1;i<=50;i++){
			System.out.print("��"+i+"��𰸣�");
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
			int a=r.nextInt(101);//����100���ڵ������
		    int b=r.nextInt(101);//����100���ڵ������
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
		    if(sum<0||sum>100){//��ⷶΧ
				i--;
				continue;
			}
			for(int j=1;j<i;j++){//����ظ�
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
