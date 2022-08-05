package com.raju;

public class StudentBean {
	
	private int sub1;
	private int sub2;
	private int sub3;
	private int total;
	private double Avg;

	
	public StudentBean()
	{
		
	}

	public int getSub1() {
		return sub1;
	}

	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}

	public int getSub2() {
		return sub2;
	}

	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}

	public int getSub3() {
		return sub3;
	}

	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}
	
	public void settotal(int total)
	{
		this.total=total;
	}
    
	public int gettotal()
     {
	  return this.total;	
	}
	
	public void setAvg(double Avg) {
		
		this.Avg=Avg;
	}
	
	public double getAvg() {
		return this.Avg;
		
	}
	
	public void printmarks()
	{
		int totalmarks=sub1+sub2+sub3;
		int Avg=totalmarks/3;
		System.out.println("sub1="+sub1);
		System.out.println("sub2="+sub2);
		System.out.println("sub3="+sub3);
		System.out.println("totalmarks:"+totalmarks);
		System.out.println("Avg marks:"+Avg);
		
		if(Avg>70)
		{
			System.out.println("A grade");
		}
		else if(Avg>=60 && Avg<70)
		{
			System.out.println("B grade");
		}
		else if(Avg>=50 && Avg<60)
		{
			System.out.println("C grade");
		}
		else 
		{
			System.out.println("fail");
		}
	}
	
}
