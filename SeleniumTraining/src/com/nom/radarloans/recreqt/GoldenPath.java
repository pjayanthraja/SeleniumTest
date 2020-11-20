package com.nom.radarloans.recreqt;

public class GoldenPath {

	int a=10,b=20,c;
	
	void add()
	{
			c=a+b;
			System.out.println("Addition of a & b is" +  c);
	}
	
	void sub()
	{
			c=a-b;
			System.out.println("Difference between a & b is "+c);
	}
	
	public static void main(String[] args) {
		System.out.println("Hi...");
		
		GoldenPath obj=new GoldenPath();
		obj.add();
		obj.sub();	

		GoldenPath obj1=new GoldenPath();
		obj1.add();
		obj1.sub();	
	}

}
