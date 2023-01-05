package entities;

public class Student {
	
	public String name;
	public double firstQuarter;
	public double secondQuarter;
	public double thirdQuarter;
	
	public double finalGrade()
	{		
		return  firstQuarter + secondQuarter + thirdQuarter;
	}
	
	public void isPassed()
	{
		if(finalGrade()>= 60.00)
		{	
			System.out.printf("%.2f%n",finalGrade());
			System.out.println("PASS");
		}
		else
		{	
			System.out.println("FAILED");
			System.out.println("MISSING: "+ (60.00 - finalGrade())+" POINTS");
		}
	}
	
	
}
