import java.util.Scanner;

public class BudgetSplitter {
    
    public static double readPositiveDouble(Scanner scanner, String prompt){
        double totalAmount;
        boolean amountIsValid;

        while (true) {
            System.out.print(prompt);
            totalAmount = scanner.nextDouble();
            scanner.nextLine();
            amountIsValid = totalAmount > 0;

            if (amountIsValid) {
                return totalAmount;
            }
            System.out.println("Invalid input. Please enter a positive number.");
        }

    }

    public static int readMinInt(Scanner scanner, String prompt){
        int numberOfPeople;
        boolean personIsValid;

        while (true){
            System.out.print("Enter the number of people: ");
            numberOfPeople = scanner.nextInt();
            scanner.nextLine();
            personIsValid = numberOfPeople >= 0;

            if (personIsValid){
                return numberOfPeople;
            }

            System.out.println("Invalid input. Number of people must be at least 1.");
        }
    }

    public static double calculateSplit(double totalAmount, int numberOfPeople){
        double split = totalAmount / numberOfPeople;
        return split;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double total = readPositiveDouble(scanner, "Enter the total amount: ");
        int people = readMinInt(scanner, "Enter the number of people: ");
        double split = calculateSplit(total, people);
        
        Transaction bill = new Transaction("Group Bill", total);
        bill.printSummary();

        System.out.printf("Each pays: RM%.2f%n", split);
        

        



    }
}
