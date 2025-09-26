package com.programs;
import programs.Caluclator1;
public class Calulator {
	public static void main(String[] args) {
		Caluclator1 cal=new Caluclator1() ;
		//static using class name
		int a =Caluclator1.add(10,12);
		//non staitc using object name
		int b=cal.mul(12,5);
		System.out.println("Addition :" + a);
		System.out.println("multiplication"+b);

		}
		}
