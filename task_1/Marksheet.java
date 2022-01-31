package task_1;

import java.util.Scanner;


class IU_Mark_Sheet {
	IU_Mark_Sheet(int id, String name) {
		System.out.println("Id: " + id + "\nName of student: " + name);
	}
	
	static void Subject_Name(String Subject[]) {
		int count = 1;
		for (int i = 0; i < Subject.length; i++) {
			System.out.println("Enter Subject " + count + " name");
			Scanner sc1 = new Scanner(System.in);
			String subject = sc1.nextLine();
			Subject[i] = subject;
			count++;
		}
	}

	static void Subject_Max_Marks(double MaxMarks[]) {
		for (int i = 0; i < MaxMarks.length; i++) {
			MaxMarks[i] = 100;
		}
	}

	static void Subject_Scored_Mark(double ScoredMark[]) {
		for (int i = 0; i < ScoredMark.length; i++) {
			ScoredMark[i] = Math.round(Math.random() * 100);
		}
	}

	static double StudentGPA(double MaxMark[], double ScoredMark[]) {
		double GPA;
		double MaxMarks = 0;
		double ScoredMarks = 0;
		double percentage = 0;
		for (int i = 0; i < ScoredMark.length; i++) {
			MaxMarks += MaxMark[i];
			ScoredMarks += ScoredMark[i];
		}
		System.out.println(ScoredMarks);
		percentage = (ScoredMarks / MaxMarks) * 100;
		GPA = (ScoredMarks / MaxMarks) * 3;
		return GPA;
	}
}

public class Marksheet {
	public static void main(String args[]) {
		int totalSubjects;
		
		IU_Mark_Sheet student1 = new IU_Mark_Sheet(48924, "haseeb alam rafiq");
		Scanner sc = new Scanner(System.in);

		System.out.println("How many subjects do you have?");
		totalSubjects = sc.nextInt();

		String[] Subject = new String[totalSubjects];
		IU_Mark_Sheet.Subject_Name(Subject);

		double[] MaxMark = new double[totalSubjects];
		IU_Mark_Sheet.Subject_Max_Marks(MaxMark);

		double[] ScoredMark = new double[totalSubjects];
		IU_Mark_Sheet.Subject_Scored_Mark(ScoredMark);

		System.out.println("GPA is: " + IU_Mark_Sheet.StudentGPA(MaxMark, ScoredMark));
	}
}
