import java.util.Scanner;

class Subject{
	int SubjectMarks; int credits; int grade;
}

class Student{
	Subject subject[];
	String name, usn;
	double sgpa;
	Scanner sc;
	int n;
	
	Student(){
		subject = new Subject[10];
		sc = new Scanner(System.in);
		System.out.println("Enter no.  of subjects: ");
		n = sc.nextInt();
		for(int i = 0; i < 9; i++){
			subject[i] = new Subject();
		}
		sc.nextLine();
		
	}
	
	void getStudentDetails(){
		
		System.out.println("Enter name: ");
		name = sc.nextLine();
		System.out.println("Enter usn: ");
		usn = sc.nextLine();
	}
	
	void getMarks(){
		System.out.println("\n");
		for(int i = 0; i < n; i++){
			System.out.println("Enter no. of credits: ");
			subject[i].credits = sc.nextInt();
			System.out.println("Enter marks obtained: ");
			subject[i].SubjectMarks = sc.nextInt();
			System.out.println("\n");
			if (subject[i].SubjectMarks > 100) subject[i].SubjectMarks = 100;
			else if (subject[i].SubjectMarks < 40) subject[i].SubjectMarks = 0;	
			subject[i].grade = (subject[i].SubjectMarks / 10) + 1;
			if (subject[i].grade == 11) subject[i].grade = 10;
			if (subject[i].SubjectMarks >= 40 && subject[i].SubjectMarks < 50) subject[i].grade = 4;
			else if (subject[i].SubjectMarks >= 50 && subject[i].SubjectMarks < 55) subject[i].grade = 5;
			else if (subject[i].SubjectMarks >= 55 && subject[i].SubjectMarks < 60) subject[i].grade = 6;
						
		}
	}

	double computeSGPA(){
		int effective = 0, credits = 0;
		for(int i = 0; i < n; i++){
			effective += (subject[i].grade * subject[i].credits);
			credits += subject[i].credits;
		}
		
		sgpa = effective/credits;
		return sgpa;
		
	}
}

class StudentMain{
	public static void main(String args[]){
		Student student = new Student();
		System.out.println("Pranav Y - 1BM22CS204");
		student.getStudentDetails();
		student.getMarks();
		System.out.println("Name of student is: " + student.name);
		System.out.println("USN of student is: " + student.usn);
		System.out.println("SGPA of student is: " + student.computeSGPA());
	}
	
}
