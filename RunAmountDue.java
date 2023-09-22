package package1;
import java.util.Scanner;
public class RunAmountDue {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		AmountDue due = new AmountDue();
		
		System.out.println("Press any of the following then enter values seperated by spaces: ");
		System.out.println("1 Price only");
		System.out.println("2 Price and quantity");
		System.out.println("3 Price, quantity, and discount amount");
		int choice = scn.nextInt();
		
		if(choice == 1) {
			due.computeAmountDue(scn.nextDouble());
		}

		else if(choice == 2) {
			due.computeAmountDue(scn.nextDouble(),scn.nextDouble());
		}
		else {
			due.computeAmountDue(scn.nextDouble(), scn.nextDouble(), scn.nextDouble());
		}
	}
}
