import java.util.Scanner;

public class BudgetSplitter {
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        double totalAmount;
        boolean amountIsValid;

        while (true) {
            System.out.print("Enter the total amount: ");
            totalAmount = input.nextDouble();
            input.nextLine();
            amountIsValid = totalAmount > 0;

            if (amountIsValid) {
                break;
            }
            System.out.println("Invalid input. Please enter a positive number.");
        }

        int numberOfPeople;
        boolean personIsValid;

        while (true){
            System.out.print("Enter the number of people: ");
            numberOfPeople = input.nextInt();
            input.nextLine();
            personIsValid = numberOfPeople >= 0;

            if (personIsValid){
                break;
            }

            System.out.println("Invalid input. Number of people must be at least 1.");
        }


        double split = totalAmount / numberOfPeople;
        System.out.printf("Amount per person: RM %.2f%n", split);

    }
}
