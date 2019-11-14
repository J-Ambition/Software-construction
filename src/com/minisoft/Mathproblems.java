package com.minisoft;

import java.util.Random;

public class Mathproblems {
	static int [] arrays=new int[50]; 
	static String [] arrays1=new String[50];
	
	public static void main(String[] args) {
		Generation();
		Printing();
		System.out.println("\n生成的算术题对应的答案如下：");
		Result();
		
	}

	private static void Generation() {
		Random random = new Random();
		int sum;
		int operand1;
		int operand2;
		int temp;
		String ov;
		boolean BL;
		for (int i=0;i<50;i++) {
			BL=false;
			while(BL==false) {
				operand1= (short)random.nextInt(101);
				operand2= (short)random.nextInt(101);
				temp= (short)random.nextInt(2);
				if (temp==0) {
					ov="+";
					sum=operand1+operand2;
					arrays[i]=sum;
					arrays1[i]=operand1+ov+operand2;
					if (sum<100) {
						BL=true;
					}
					else {BL= false;}
				}
				else {
					ov="-";
					sum=operand1-operand2;
					arrays[i]=sum;
					arrays1[i]=operand1+ov+operand2;
					if (sum>0) {
						BL=true;
					}else {BL=false;}
				}
			}
		}
	}

	private static void Printing() {
		for (int i=0;i< arrays1.length;i++) {
			System.out.print((i+1)+":"+arrays1[i]+"="+"\t");
			if ((i+1)%5==0) {
				System.out.println();
			}
		}
		
	}

	private static void Result() {
		for (int i=0;i<arrays.length;i++) {
			System.out.print((i+1)+":"+arrays[i]+"\t");
			if ((i+1)%5==0) {
				System.out.print("\n");
			}
		}
	}


}
