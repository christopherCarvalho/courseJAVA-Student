package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student std = new Student();
		System.out.print("Student name: ");
		std.name = sc.nextLine();
		System.out.println("Notes:");
		std.firstQuarter = sc.nextDouble();
		std.secondQuarter = sc.nextDouble();
		std.thirdQuarter = sc.nextDouble();
		
		std.finalGrade();
		
		std.isPassed();
		
		
		sc.close();
	}

}
