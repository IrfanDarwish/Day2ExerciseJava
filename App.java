import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Favourite programming language: ");
		String favProgrammingLanguage = scanner.nextLine();

		System.out.print("Number of study hours per week: ");
		double studyHoursPerWeek = scanner.nextDouble();

		boolean isAdult = age >= 18;
		
		scanner.close();

		System.out.println("\n--- Student Profile ---");
		greetingMessage(name);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Adult: " + isAdult);
		System.out.println("Favourite Programming Language: " + favProgrammingLanguage);
		System.out.println("Study hours per week: " + studyHoursPerWeek);
		System.out.println("Adult: " + isAdult);

		if (isAdult) {
			System.out.println("You are an adult learner.");
		}else {
			System.out.println("You are a young learner.");
		}

		if (studyHoursPerWeek >= 10) {
			System.out.println("Great study habit!");
		}else {
			System.out.println("Try to spend more time practising");
		}

		for (int i = 0 ; i < 3 ; i++){
			if(studyHoursPerWeek >= 10){
				System.out.println("Exellent!");
			}else {
				System.out.println("Keep it up!");
			}
		}
	}

	public static void greetingMessage(String name){
		System.out.println("Welcome " + name + ", to GKK Consultants training center.");
	}
}