package Exercise;


import java.util.Scanner;

public class StrategyPatternExample {

	public static void main(String[] args) {
	
		System.out.println("Select one of the data types (d-Database/c-CSV/t-TSV): ");
		Scanner sc = new Scanner(System.in);
		String datatype = sc.nextLine();

		Data data = null;
		switch (datatype) {
		case "d":
			data = ____________________ //<<1
			break;
		case "c":
			data = ____________________ //<<2
			break;
		case "t":
			data = ____________________ //<<3
			break;
		}
		
		data.extractData();
		sc.close();
	}
}





