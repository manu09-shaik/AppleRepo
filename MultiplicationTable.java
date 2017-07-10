import java.util.Scanner;

public class MultiplicationTable {

	public void tableDisplay(){		
		Scanner scanner = new Scanner(System.in);
		int n =5;
		for (int i = 1; i <= 10; i++) {
			 System.out.println(n+" * "+i+" = "+n*i);
		}
		scanner.close();
	}
	public static void main(String[] args) {
		System.out.println( " Inside main method of MultiplicationTable ");
		MultiplicationTable table = new MultiplicationTable();
		table.tableDisplay();
	}
}
