package assignment;

public class Assignment {

	public static void main(String[] args) {
	   
		hasMidpoint(8,6,7);
		
	}
	public static void hasMidpoint(int numberOne,int numberTwo,int numberThree){
		if(numberOne==(numberTwo+numberThree)/2) {
			System.out.println("true");
			//return true;
		}
		else if(numberTwo==(numberOne+numberThree)/2) {
			System.out.println("true");
			//return true;
		}
		else if(numberThree==(numberOne+numberTwo)/2) {
			System.out.println("true");
			//return true;
		}
		else {
			System.out.println("false");
			//return false;
		}
	}

}
