class StudentMakrs {
	
	static String[] students = new String[20];
	static int[] chemMarks = new int[20];
	static int[] mathsMarks = new int[20];
	static int[] physicsMarks = new int[20];
	static int[] averageMarks = new int[20];
	static String[] chemGrades = new String[20];
	static String[] mathGrades = new String[20];
	static String[] physicsGrades = new String[20];
	static String[] averageGrades = new String[20];
	static int k = 0;
	
	public static void main (String[] args) {//produce students' examination grades
		
		for (int i = 0; i<args.length; i++){
			readInputValues(i, args);
			convertMarksToGrade(i);
			printDetails(i);
		}
		
	}
	
	private static void readInputValues(int i,String args[]){
		//this method reades the input values from the user and assign them into maths
		students[i] = args[k];
		chemMarks[i] = Integer.parseInt(args[k+1]);
		mathsMarks[i] = Integer.parseInt(args[k+2]);
		physicsMarks[i] = Integer.parseInt(args[k+3]);
		averageMarks[i] = (chemMarks[i]+mathsMarks[i]+physicsMarks[i])/3;
		k = k + 4;
	}
	
	private static void convertMarksToGrade(int i){
		//this method convert marks into grades by using get grades method
		chemGrades[i] = getGrades(chemMarks[i]);
		mathGrades[i] = getGrades(mathsMarks[i]);
		physicsGrades[i] = getGrades(physicsMarks[i]);
		averageGrades[i] = getGrades(averageMarks[i]);
	}
	
	private static String getGrades(int marks){
		//this method calculates the grade from the marks
		if(marks <= 100 && marks >= 80){
			return "A"; 
		}
		else if(marks <= 79 && marks >= 65){
			return "B";
		}
		else if(marks <= 64 && marks >= 50){
			return "C";
		}
		else if(marks <= 49 && marks >= 40){
			return "D";
		}
		else if (marks <= 39 && marks >= 0){
			return "F";
		}
		else{
			return "ERROR!";
		}
	}
	
	private static void printDetails(int i){
		//this method print the output to the user by printing out students' name,marks,grades
		System.out.println (students[i]);
		System.out.println ("Chemistry\t"+	chemMarks[i]+	"\t"+	chemGrades[i]);
		System.out.println ("Maths\t\t"+	mathsMarks[i]+	"\t"+	mathGrades[i]);
		System.out.println ("Physics\t\t"+	physicsMarks[i]+	"\t"+	physicsGrades[i]);
		System.out.println ("Average\t\t"+	averageMarks[i]+	"\t"+	averageGrades[i]);
		System.out.println ();

	}

}
