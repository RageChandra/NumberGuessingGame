package CoreJava;
import java.util.*;
public class Number {
	static int attempt = 0;
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Random random = new Random();
		int computer = random.nextInt(100);
		System.out.println("===============Welcome to Number Guessing game==================");
		System.out.println("RULES TO BE FOLLOWED ARE: ");
		System.out.println("1.The computer will select an random integer from 1 to 100");
		System.out.println("2.You must guess an number in minimum number of attempts");
		System.out.println("=================================================================");
		System.out.println("                                                         ");
		System.out.println("The Game Going to start in: ");
		System.out.println("3......");
		System.out.println("2......");
		System.out.println("1......");
		System.out.println("                                                         ");
		while(true) {
			int user;
			System.out.print("Enter your number here: ");
			user = sc.nextInt();
			if(user>computer) {
				attempt++;
				System.out.println("The Number is too High");
			}
			else if(user<computer) {
				attempt++;
				System.out.println("The Number is too Low");
			}
			else {
				System.out.println("The number is found in: "+ attempt +" attempts");
				break;
			}
		}
        sc.close();

	}
}