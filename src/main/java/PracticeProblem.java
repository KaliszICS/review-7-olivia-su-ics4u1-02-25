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

	public static String isFive(int num){
		if (num ==5){
			return "The number is Five";
		}else{
			return "The number is not Five";
		}
	}

	public static String positiveOrNegative(double num){
		if (num > 0){
			return "Positive";
		}else{
			return "Negative";
		}
	}

	public static String highOrLow(int num){
		if (num > 100){
			return "High";
		}else{
			return "Low";
		}
	}

	public static String isHello(String word){
		if(word.equals("Hello")){
			return "The word is Hello";
		}else{
			return "The word is not Hello";
		}
	}

}
