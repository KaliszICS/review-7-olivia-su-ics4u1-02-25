public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String evenOrOdd(int num){
		if (num % 2 == 0){
			return "Even";
		}else{
			return "Odd";
		}
	}

	public static String teacherOrStudent(String teacher){
		if (teacher.equals("Kalisz")){
			return "Teacher";
		}else{
			return "Student";
		}
	}

	public static int fartherFromZero(int num){
		if (num > 0 ){
			num = num + 5;
			return num;
		}else if (num < 0){ 
			num  = num - 5;
			return num;	
		}else{
			return 0;
		}
	}

}
