package exceptions;

public class Finally_Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 100;
		int num2 = 10;
		
		try {
			int num3 = num1 / num2;
		}  finally {
			System.out.println("Finally Block Code");
		}

	}

}
